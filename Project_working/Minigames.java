import cs1.Keyboard;
import java.io.*;
import java.util.*;

public class Minigames{

  public static boolean beatDeath(Human x){
    int count = 0;
    long finish = 0;
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("|Welcome to ---TYPE QUICK: A Game to Give Human A Second Chance-----            |");
    System.out.println("|In this game, the objective is to type in the letter k and press     |");
    System.out.println("|enter as much as you can within the given time limit.                |");
    System.out.println("|             Press any key and enter when you're ready!              |");
    System.out.println("-----------------------------------------------------------------------");
    String random100 = Keyboard.readString();
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("                       Good Luck, Have Fun!                            \n");

    System.out.println("-----------------------------------------------------------------------");
    System.out.println("|Time Limit: 10 seconds                                               |");
    /*start*/ long start = System.currentTimeMillis();
    while( finish - start <= 10000 ){
      String input = Keyboard.readString();
      input = input.toLowerCase();
      if(input.equals("k")){
        count += 1;
      }
      finish = System.currentTimeMillis();
    }

    if(count > 30){
      System.out.println("You Managed to Survive!\n");
      return true;
    } else {
      System.out.println("You Died...\n");
      return false;
    }
  }

  public static int test(File file,Human x){
    System.out.println("Surprise! It's a relaxation day! (that means test...)");
    int testScore = 0;
    if(x instanceof Child){
      for(int i=1;i<6;i+=2){
        System.out.println(Settings.talk(file,i));
        if(Keyboard.readString().equals(Settings.talk(file,i+1))){
          testScore++;
        }
      }
    }else if(x instanceof Teen){
      for(int j=7;j<12;j+=2){
        System.out.println(Settings.talk(file,j));
        if(Keyboard.readString().equals(Settings.talk(file,j+1))){
          testScore++;
        }
      }
    }
    return testScore;
  }

  public static boolean type(Human x){
    int lives = 3;
    int count = 0;
    String key = "";
    String[] temp = {"a","f","l","p","t"};
    System.out.println("-------------------------------------------------------------------\n" +
                       "|Just Dance (Terminal Version)!                            Lives: " + lives + "|\n" +
                       "|Just a minigame, may or may not have an effect on your life...     |\n" +
                       "|The rules are simple: Type in the key you see in your terminal and |\n" +
                       "|press enter to continue. There will be five rounds, and each round |\n" +
                       "|is timed to 2 seconds. Also, you are given only 3 chances.         |\n" +
                       "|                  Press any key to continue                        |\n");
    String start = Keyboard.readString();
    System.out.println("                   Good luck and have fun!                           ");
    while(lives != 0 && count <= 5){
      long init = System.currentTimeMillis();
      System.out.println("-------------------------------------------------------------------\n" +
                         "|Time:"+ init +"                                                    Lives:" + lives + "|");
      String word = temp[(int)(Math.random() * 4.01)];
      System.out.println(Woo.TYPE.get(word));
      long fin = System.currentTimeMillis();
      if(fin - init > 1500){
        System.out.println("Sorry, you ran out of time");
      }else{
        key = Keyboard.readString().toLowerCase();
      }
      if(word.equals(key)){
        System.out.println("Good Job !!!");
      }else{
        System.out.println("That's not quite correct");
        lives--;
      }
      count++;
    }
    if(lives > 0){
      System.out.println("-------------------------------------------------------------------\n" +
      "Congragulations you won!\nThings seem to be looking up for you...\n" +
      "-------------------------------------------------------------------");
      return true;
    }else{
      System.out.println("-------------------------------------------------------------------\n" +
      "Seems like you lost...\nThat will have consequences...\n" +
      "-------------------------------------------------------------------");
      return false;
    }
  }
  public static boolean TicTacToe(){
    String[][] grid = new String[3][3];
    String[][] selection = new String[3][3];
    ArrayList<Integer> possible = new ArrayList<Integer>();
    String symbol;
    String symbol2;
    boolean win = false;
    String winner = "tie";
    int counter = 1;
    int counter2 = 1;
    int pos;
    int posfinal;


    System.out.println("-----------------------------------------------------------------------");
    System.out.println("|Welcome to TicTacToe! The objective of this game is to place three of|");
    System.out.println("|your marks in a horizontal, vertical, or diagonal row.               |");
    System.out.println("|The rules are very simple, you can only choose empty positions in the|");
    System.out.println("|TicTacToe grid as shown below. Good luck and have fun!               |\n");


    for(int p = 0; p < 9; p++){
      possible.add(counter2);
      counter2 += 1;
    }
    for(int i = 0; i < grid[0].length; i++){
      for(int j = 0; j < grid.length; j++){
        grid[i][j] = "empty";
      }
    }
    for(int i = 0; i < selection[0].length; i++){
      for(int j = 0; j < selection.length; j++){
        selection[i][j] = counter + "";
        counter += 1;
      }
    }


    System.out.println(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
    System.out.println("=====================");
    System.out.println(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
    System.out.println("=====================");
    System.out.println(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
    System.out.println("First choose your symbol (click on the number signifying the symbol you want)\n1. X\n2. O");
    int choice = Keyboard.readInt();
    if(choice == 1){
      System.out.println("You choice the symbol X!");
      symbol = "X";
      symbol2 = "O";
    } else if(choice == 2){
      System.out.println("You choice the symbol O!");
      symbol = "O";
      symbol2 = "X";
    } else {
      System.out.println("That's not a valid input, try again");
      int choice2 = Keyboard.readInt();
      if(choice2 == 1){
        System.out.println("You choice the symbol X!");
        symbol = "X";
        symbol2 = "O";
      }else if(choice2 == 2){
        System.out.println("You choice the symbol O!");
        symbol = "O";
        symbol2 = "X";
      } else {
        System.out.println("That's not a valid input either\nAuto-Assigning symbol X");
        symbol = "X";
        symbol2 = "O";
      }
    }


    System.out.println("         Press any key when you're ready to play!           ");
    String random10 = Keyboard.readString();
    System.out.println("               Good Luck, Have Fun!                             ");


    while(win == false){
      ArrayList<Integer> cpu = new ArrayList<Integer>();
      System.out.println("------------------------------------------------------");
      System.out.println(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
      System.out.println("=====================");
      System.out.println(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
      System.out.println("=====================");
      System.out.println(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
      System.out.println("\nChoose which position you want to place your symbol on from the grid below:");
      System.out.println("(Only sections with a number in them are available)");
      System.out.println("  " + selection[0][0] + "  " + " ||  " +  selection[0][1] + "  || " + "  " + selection[0][2] + "  ");
      System.out.println("=====================");
      System.out.println("  " + selection[1][0] + "  " + " ||  " + selection[1][1] + "  || " + "  " + selection[1][2] + "  ");
      System.out.println("=====================");
      System.out.println("  " + selection[2][0] + "  " + " ||  " + selection[2][1] + "  || " + "  " + selection[2][2] + "  ");
      int choosing = Keyboard.readInt();
      if( choosing <= 3){
        grid[0][choosing - 1] = "  " + symbol + "  ";
        selection[0][choosing - 1] = " ";
        possible.set(choosing - 1,0);
      } else if( choosing <= 6){
        grid[1][choosing - 4] = "  " + symbol + "  ";
        selection[1][choosing - 4] = " ";
        possible.set(choosing - 1,0);
      } else if( choosing <= 9){
        grid[2][choosing - 7] = "  " + symbol + "  ";
        selection [2][choosing - 7] = " ";
        possible.set(choosing - 1,0);
      }
      if(grid[0][0].equals("  X  ") && grid[0][1].equals("  X  ") && grid[0][2].equals("  X  " )){
        win = true;
        winner = "me";
        break;
      } else if(grid[1][0].equals("  X  ") && grid[1][1].equals("  X  ") && grid[2][1].equals("  X  ")){
        win = true;
        winner = "me";
        break;
      } else if(grid[2][0].equals("  X  ") && grid[2][1].equals("  X  ") && grid[2][2].equals("  X  ")){
        win = true;
        winner = "me";
        break;
      } else if(grid[0][0].equals("  X  ") && grid[1][0].equals("  X  ") && grid[2][0].equals("  X  ") ){
        win = true;
        winner = "me";
        break;
      } else if(grid[0][1].equals("  X  ") && grid[1][1].equals("  X  ") && grid[2][1].equals("  X  ") ){
        win = true;
        winner = "me";
        break;
      } else if(grid[0][2].equals("  X  ") && grid[1][2].equals("  X  ") && grid[2][2].equals("  X  ")){
        win = true;
        winner = "me";
        break;
      } else if(grid[0][0].equals("  X  ") && grid[1][1].equals("  X  ") && grid[2][2].equals("  X  ") ){
        win = true;
        winner = "me";
        break;
      } else if(grid[0][2].equals("  X  ") && grid[1][1].equals("  X  ") && grid[2][0].equals("  X  ") ){
        win = true;
        winner = "me";
        break;
      } else{
        for(int k: possible){
          if( k != 0){
            cpu.add(k);
          }
        }
      }

      if(cpu.size() == 0){
        winner = "tie";
        win = true;
      }
      pos = (int) (Math.random() * (cpu.size() - 1) );
      posfinal = cpu.get(pos);
      if( posfinal <= 3){
        grid[0][posfinal - 1] = "  " + symbol2 + "  ";
        selection[0][posfinal - 1] = " ";
        possible.set(posfinal - 1,0);
      } else if( posfinal <= 6){
        grid[1][posfinal - 4] = "  " + symbol2 + "  ";
        selection[1][posfinal - 4] = " ";
        possible.set(posfinal - 1,0);
      } else if( posfinal <= 9){
        grid[2][posfinal - 7] = "  " + symbol2 + "  ";
        selection [2][posfinal - 7] = " ";
        possible.set(posfinal - 1,0);
      }

      if(grid[0][0].equals("  O  ") && grid[0][1].equals("  O  ") && grid[0][2].equals("  O  " )){
        win = true;
        winner = "not";
        break;
      } else if(grid[1][0].equals("  O  ") && grid[1][1].equals("  O  ") && grid[2][1].equals("  O  ")){
        win = true;
        winner = "not";
        break;
      } else if(grid[2][0].equals("  O  ") && grid[2][1].equals("  O  ") && grid[2][2].equals("  O  ")){
        win = true;
        winner = "not";
        break;
      } else if(grid[0][0].equals("  O  ") && grid[1][0].equals("  O  ") && grid[2][0].equals("  O  ") ){
        win = true;
        winner = "not";
        break;
      } else if(grid[0][1].equals("  O  ") && grid[1][1].equals("  O  ") && grid[2][1].equals("  O  ") ){
        win = true;
        winner = "not";
        break;
      } else if(grid[0][2].equals("  O  ") && grid[1][2].equals("  O  ") && grid[2][2].equals("  O  ")){
        win = true;
        winner = "not";
        break;
      } else if(grid[0][0].equals("  O  ") && grid[1][1].equals("  O  ") && grid[2][2].equals("  O  ") ){
        win = true;
        winner = "not";
        break;
      } else if(grid[0][2].equals("  O  ") && grid[1][1].equals("  O  ") && grid[2][0].equals("  O  ") ){
        win = true;
        winner = "not";
        break;
      }

    }
    if(winner.equals("me")){
      System.out.println("------------------------------------------------------");
      System.out.println(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
      System.out.println("=====================");
      System.out.println(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
      System.out.println("=====================");
      System.out.println(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
      System.out.println("You Won!\n");
      return true;
    }else if(winner.equals("not")){
      System.out.println("------------------------------------------------------");
      System.out.println(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
      System.out.println("=====================");
      System.out.println(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
      System.out.println("=====================");
      System.out.println(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
      System.out.println("You Lost...\n");
      return false;
    }else if(winner.equals("tie")){

      System.out.println("------------------------------------------------------");
      System.out.println(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
      System.out.println("=====================");
      System.out.println(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
      System.out.println("=====================");
      System.out.println(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
      System.out.println("Seems to be a tie...");
      return false;
    }
    return false;
  }


}
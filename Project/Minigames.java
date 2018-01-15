import java.util.*;
import cs1.Keyboard;


public class Minigames{
  private static int Lives;

  public Minigames(){
    Lives = 3;
  }

  public static boolean Play(){
    int pos;
    ArrayList<String> alpha = new ArrayList<String>();
    /*A*/alpha.add("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //A
    /*F*/alpha.add("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //F
    /*L*/alpha.add("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //L
    /*P*/alpha.add("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //P
    /*T*/alpha.add("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");   //T

    /*start*/ long start = System.currentTimeMillis();
    SOP("-------------------------------------------------------------------");
    SOP("|Just Dance Timer:3" + "                                       Lives:" + Lives + "|");
    SOP("|Just a minigame, may or may not have an effect on your life...     |");
    SOP("|The rules are simple: Type in the key you see in your terminal and |");
    SOP("|press enter to continue. There will be five rounds, and each round |");
    SOP("|is timed to 2 seconds. Also, you are given only 3 chances.         |");
    SOP("|                  Press any key to continue                        |");
    String random = Keyboard.readString();
    SOP("                   Good luck and have fun!                           ");
    int Trials = 5;
    int count = 1;
    pos = (int) (Math.random() * 4.01);
    SOP("-------------------------------------------------------------------");
    SOP("|Just Dance Timer:3" + "                                       Lives:" + Lives + "|");
    SOP(alpha.get(pos));

    String key = Keyboard.readString();
    key = key.toLowerCase();

    /*finish*/ long finish = System.currentTimeMillis();
    if(finish - start > 2500){
      SOP("Timer ran out\nYou lost a life");
      Lives -= 1;
    } else {
      if( pos == 0 && key.equals("a") ){
        SOP("Good Job!");
      }
      else if( pos == 1 && key.equals("f") ) {
        SOP("Good Job!");
      }
      else if( pos == 2 && key.equals("l") ){
        SOP("Good Job!");
      }
      else if( pos == 3 && key.equals("p") ){
        SOP("Good Job!");
      }
      else if( pos == 4 && key.equals("t") ){
        SOP("Good Job!");
      }
      else{
        SOP("That's not right!");
        Lives -= 1;
      }
    }

    while( (Lives > 0) && (count < Trials)){
      SOP("");
      pos = (int) (Math.random() * 4.01);

      SOP("-------------------------------------------------------------------");
      SOP("|Just Dance Timer:3" + "                                       Lives:" + Lives + "|");
      SOP(alpha.get(pos));
      /*start*/ long nvm = System.currentTimeMillis();
      String key2 = Keyboard.readString();
      key2 = key2.toLowerCase();

      /*finish*/ long finisher = System.currentTimeMillis();
      if(finisher - nvm > 1500){
        SOP("Timer ran out\nYou lost a life");
        Lives -= 1;
      }else{
        if( pos == 0 && key2.equals("a") ){
          SOP("Good Job!");
        }
        else if( pos == 1 && key2.equals("f") ) {
          SOP("Good Job!");
        }
        else if( pos == 2 && key2.equals("l") ){
          SOP("Good Job!");
        }
        else if( pos == 3 && key2.equals("p") ){
          SOP("Good Job!");
        }
        else if( pos == 4 && key2.equals("t") ){
          SOP("Good Job!");
        }
        else{
          SOP("That's not right!");
          Lives -= 1;
        }
      }
      count += 1;
    }
    if(Lives == 0) {
      SOP("-------------------------------------------------------------------");
      SOP("Seems like you lost...\nThat will have consequences...");
      SOP("-------------------------------------------------------------------");
      return true;
    }
    else{
      SOP("-------------------------------------------------------------------");
      SOP("Congragulations you won!\nThings seem to be looking up for you...");
      SOP("-------------------------------------------------------------------");
      return false;
    }

  }

  public static boolean TicTacToe(){
    String[][] grid = new String[3][3];
    SOP("-----------------------------------------------------------------------");
    SOP("|Welcome to TicTacToe! The objective of this game is to place three of|");
    SOP("|your marks in a horizontal, vertical, or diagonal row.               |");
    SOP("|The rules are very simple, you can only choose empty positions in the|");
    SOP("|TicTacToe grid as shown below. Good luck and have fun!               |");
    for(int i = 0; i < grid[0].length; i++){
      for(int j = 0; j < grid.length; j++){
        grid[i][j] = "empty";
      }
    }
    SOP(grid[0][0] + " || " + grid[0][1] + " || " + grid[0][2]);
    SOP("=====================");
    SOP(grid[1][0] + " || " + grid[1][1] + " || " + grid[1][2]);
    SOP("=====================");
    SOP(grid[2][0] + " || " + grid[2][1] + " || " + grid[2][2]);
    SOP("");
    SOP("Choose your symbol (click on the number that coresponds with your choice)\n1. X\n2. O");
    int choice = new Keyboard.readInt();
    return true;
  }

  public static void SOP(Object x){
    System.out.println(x);
  }



} //end clas

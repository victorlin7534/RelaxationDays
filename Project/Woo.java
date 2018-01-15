import cs1.Keyboard;
import java.util.*;
import cs1.Keyboard;
import java.io.*;
import java.util.Scanner;

public class Woo{

  private ArrayList stuff;

  /*public void create(){
  HashMaps STDS = new HashMaps<String,double>(3);
  STDS.put("HIV",xcvckvncxvncxv);
  STDS.put("Syphilis",xcvckvncxvncxv);
  STDS.put("Chlamidya",xcvckvncxvncxv);
  stuff.add(STDS);
  HashMaps MENTAL = new HashMaps<String,double>(3);
  MENTAL.put("Depression",adsadasb);
  MENTAL.put("Anxiety",adsadasb);
  MENTAL.put("Schizophrenia",adsadasb);
  stuff.add(MENTAL);
  HashMaps PHYSICAL = new HashMaps<String,double>(3);
  PHYSICAL.put("Flu",adsadasb);
  PHYSICAL.put("Cancer",adsadasb);
  PHYSICAL.put("Heart Disease",adsadasb);
  stuff.add(PHYSICAL);
  HashMaps FRIENDS = new HashMaps<String,String>();
  FRIENDS.put();
  FRIENDS.put();
  stuff.add(FRIENDS);
}*/

public static void main(String []args){
  Minigames game = new Minigames();
  game.TicTacToe();
  System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' " + "\n");

  //Escaped string to facilitate compiling - Baby
  System.out.println("           .-@-.\r\n          /     \\\r\n         |       |\r\n         ( o   o )\r\n        .-\\  ^  /-.\r\n       /   '-@-'   \\");
  System.out.println();

  System.out.println("Give the human a name: ");
  Human a = new Child(Keyboard.readString());


  System.out.println(a._name + " undergoes a developmental period of his/her infant life.");

  //Escaped string to facilitate compiling - Developmental baby art
  System.out.println("         \r\n               ,==.              |~~~\r\n              /  OO\\             |\r\n              \\c  -_)         |~~~\r\n               `) (           |\r\n               /   \\       |~~~\r\n              /   \\ \\      |\r\n             ((   /\\ \\_ |~~~ \r\n              \\\\  \\ `--`|\r\n              / / /  |~~~\r\n         ___ (_(___)_|");

  System.out.println(a._name + " learns how to babble, crawl, walk, and eventually talk.\n");
  System.out.println("It's time for "  + a._name + " to start his journey to become a 'real person'... Prepare to simulate.");

  //Go to school at six years old
  a._age = 6.0;

  while(!a.isDead() && a.getAge() < 100){
    System.out.println(a);
    if(a.getAge() < 13){ //Child
      System.out.println("\nWhat should " + a._name + " do today? a) school b) playground c) stay home");
      String act = Keyboard.readString();
      switch(act){

        case "a":
        System.out.println("\n" + a._name + " goes to school that day to acquire knowledge.\n");

        Settings.atSchool(a);

        break;

        case "b":
        Settings.atPark(a);
        break;

        case "c":
        Settings.atHome(a);
      }
    }

    else if(a.getAge() < 18){//Teen
      Human a_temp = new Teen(a); //Teen with values from Human a
      a = a_temp;
      System.out.println("\nWhat do you want to do? a)school b) c)");
      String act = Keyboard.readString();
      switch(act){
        case "a":
        //System.out.println("Your score: " + Settings.atSchool(a));
        break;
      }
    }
    else{
      Human a_temp = new Adult(a);
      a = a_temp;
    }
    a.growUp();
  }
}



}//end class

import cs1.Keyboard;
import java.util.*;
import java.io.*;

public class Woo{

  //protected static ArrayList<HashMap<String,Object>> stuff;
  protected static HashMap STDS;
  protected static HashMap MENTAL;
  protected static HashMap PHYSICAL;
  protected static HashMap FRIENDS;
  protected static HashMap TYPE;

  public static void create(){
    STDS = new HashMap<String,Double>(3);
    STDS.put("HIV",3.0);
    STDS.put("Syphilis",2.3);
    STDS.put("Chlamidya",1.3);
    //  stuff.add(STDS);
    MENTAL = new HashMap<String,Double>(3);
    MENTAL.put("Depression",2.3);
    MENTAL.put("Anxiety",4.5);
    MENTAL.put("Schizophrenia",12.1);
    //stuff.add(MENTAL);
    PHYSICAL = new HashMap<String,Double>(3);
    PHYSICAL.put("Flu",1.1);
    PHYSICAL.put("Cancer",2.2);
    PHYSICAL.put("Heart Disease",3.3);
    //stuff.add(PHYSICAL);
    FRIENDS = new HashMap<String,String>();
    // FRIENDS.put();
    // FRIENDS.put();
    // FRIENDS.put();
    //stuff.add(FRIENDS);
    TYPE = new HashMap<String,String>(5);
    TYPE.put("a","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //A
    TYPE.put("f","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //F
    TYPE.put("l","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //L
    TYPE.put("p","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //P
    TYPE.put("t","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");   //T
    //stuff.add(TYPE);
  }

  public static void main(String []args){
    create();
    System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' " + "\n");

    //Escaped string to facilitate compiling - Baby
    System.out.println("           .-@-.\r\n          /     \\\r\n         |       |\r\n         ( o   o )\r\n        .-\\  ^  /-.\r\n       /   '-@-'   \\");
    System.out.println();

    System.out.println("Give the human a name: ");
    Human a = new Child(Keyboard.readString());

    //  Minigames.type(a);
    System.out.println(a._name + " undergoes a developmental period of his/her infant life.");

    //Escaped string to facilitate compiling - Developmental baby art
    System.out.println("         \r\n               ,==.              |~~~\r\n              /  OO\\             |\r\n              \\c  -_)         |~~~\r\n               `) (           |\r\n               /   \\       |~~~\r\n              /   \\ \\      |\r\n             ((   /\\ \\_ |~~~ \r\n              \\\\  \\ `--`|\r\n              / / /  |~~~\r\n         ___ (_(___)_|");

    System.out.println(a._name + " learns how to babble, crawl, walk, and eventually talk.\n");
    System.out.println("It's time for "  + a._name + " to start his journey to become a 'real person'... Prepare to simulate.");

    //Go to school at six years old
    a._age = 6.0;
    //test
    //Minigames.beatDeath(a);
    while(!a.isDead() && a.getAge() < 100){
      System.out.println(a);
      if(a.getAge() < 13){ //Child
        a.setAge(13);
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
        //System.out.println("\n" + a._name + " is now a teenager!");
        Human a_temp = new Teen(a); //Teen with values from Human a
        a = a_temp;
        System.out.println("\nWhat should " + a._name + " do today? a) school b) party c) stay home");
        String act = Keyboard.readString();
        switch(act){
          case "a":
          Settings.atSchool(a);
          break;

          case "b":
          Settings.atParty(a);
          break;

          case "c":
          Settings.atHome(a);
          break;
        }
      }
      else{
        Human a_temp = new Adult(a);
        a = a_temp;
      }
      a.growUp();
      Settings.randEvent(a);
    }
  }



}//end class

import cs1.Keyboard;
import java.util.*;
import java.io.*;

public class Woo{

  protected static HashMap STDS;
  protected static HashMap MENTAL;
  protected static HashMap PHYSICAL;
  protected static HashMap TYPE;

  public static void create(){
    STDS = new HashMap<String,Double>(3);
    STDS.put("HIV",3.0);
    STDS.put("Syphilis",2.3);
    STDS.put("Chlamidya",1.3);
    MENTAL = new HashMap<String,Double>(3);
    MENTAL.put("Depression",2.3);
    MENTAL.put("Anxiety",4.5);
    MENTAL.put("Schizophrenia",12.1);
    PHYSICAL = new HashMap<String,Double>(3);
    PHYSICAL.put("Flu",1.1);
    PHYSICAL.put("Cancer",2.2);
    PHYSICAL.put("Heart Disease",3.3);
    TYPE = new HashMap<String,String>(5);
    TYPE.put("a","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //A
    TYPE.put("f","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n"); //F
    TYPE.put("l","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //L
    TYPE.put("p","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n");  //P
    TYPE.put("t","\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2500\r\n\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2591\u2591\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2588\u2588\u2588\u2588\u2588\u2588\u2500\u2500\u2500\u2500\u2500\r\n\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");   //T
  }

  public static void main(String []args){
    create();
    System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' " + "\n");

    //Escaped string to facilitate compiling - Baby
    System.out.println("           .-@-.\r\n          /     \\\r\n         |       |\r\n         ( o   o )\r\n        .-\\  ^  /-.\r\n       /   '-@-'   \\");
    System.out.println();

    System.out.println("Give the human a name: ");
    System.out.println("------------------------------------------------------");
    Human a = new Child(Keyboard.readString());
    System.out.println("------------------------------------------------------");

    //  Minigames.type(a);
    System.out.println(a._name + " undergoes a developmental period of his/her infant life.");

    //Escaped string to facilitate compiling - Developmental baby art
    System.out.println("         \r\n               ,==.              |~~~\r\n              /  OO\\             |\r\n              \\c  -_)         |~~~\r\n               `) (           |\r\n               /   \\       |~~~\r\n              /   \\ \\      |\r\n             ((   /\\ \\_ |~~~ \r\n              \\\\  \\ `--`|\r\n              / / /  |~~~\r\n         ___ (_(___)_|");

    System.out.println(a._name + " learns how to babble, crawl, walk, and eventually talk.\n");
    System.out.println("It's time for "  + a._name + " to start his journey to become a 'real person'... Prepare to simulate.");

    //Go to school at six years old
    a._age = 6.0;

    // a._age = 14.0; used for teen testing purposes :)
    while(!a.isDead() && a.getAge() < 100){
      System.out.println(a);
      if(a.getAge() < 13){ //Child

        System.out.println("\nWhat should " + a._name + " do today? a) school b) playground c) stay home");
        System.out.println("------------------------------------------------------");
        String act = Keyboard.readString();
        System.out.println("------------------------------------------------------");
        if( !(act.equals("a") || act.equals("b") || act.equals("c"))){
          System.out.println("That's not a valid input...\nIf you mess up again you go on a trip.");
          System.out.println("------------------------------------------------------");
          act = Keyboard.readString();
          System.out.println("------------------------------------------------------");
        }
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
          break;

          default:
          System.out.println("Guess " + a._name + " is going on a trip...");
          Settings.atTrip(a);
          break;
        }
      }

      else if(a.getAge() < 18){//Teen
        //System.out.println("\n" + a._name + " is now a teenager!");
        Human a_temp = new Teen(a); //Teen with values from Human a
        a = a_temp;
        //  a.partTime();

        System.out.println("\nWhat should " + a._name + " do today? a) school b) party c) stay home");
        System.out.println("------------------------------------------------------");
        String act = Keyboard.readString();
        System.out.println("------------------------------------------------------");
        if( !(act.equals("a") || act.equals("b") || act.equals("c"))){
          System.out.println("That's not a valid input...\nIf you mess up again you have to stay home.");
          System.out.println("------------------------------------------------------");
          act = Keyboard.readString();
          System.out.println("------------------------------------------------------");
        }
        ((Teen) a).partTime(3);
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

          default:
          System.out.println("Guess " + a._name + " is staying home...");
          Settings.atHome(a);
          break;
        }
      }
      else if(a._age == 18){
        System.out.println("What is " + a._name+   "'s future job?");
        System.out.println("------------------------------------------------------");
        String job = Keyboard.readString();
        System.out.println("------------------------------------------------------");
        a._future = job;
        System.out.println("What is the average income for such a job?");
        System.out.println("------------------------------------------------------");
        int salary = Keyboard.readInt();
        System.out.println("------------------------------------------------------");
        a._income = salary;

      }
      else{
        Human a_temp = new Adult(a);
        a = a_temp;
        //System.out.println(a._income);
        //System.out.println(a._future);
      }
      a.growUp();
      Settings.randEvent(a);
    }
  }



}//end class

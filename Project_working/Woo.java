import cs1.Keyboard;
import java.util.*;
import java.io.*;

public class Woo{

    protected static HashMap STDS;
    protected static HashMap BIRTH;
    protected static HashMap RANDOM;
    protected static HashMap TYPE;

    protected static ArrayList<String> stdArray = new ArrayList<String>();
    protected static ArrayList<String> birthArray = new ArrayList<String>();
    protected static ArrayList<String> randomArray = new ArrayList<String>();

    public static void create(){
    	STDS = new HashMap<String,Double>(3);
      	STDS.put("HIV",0.5);
      	STDS.put("Syphilis",0.75);
      	STDS.put("Chlamidya",0.4);
        stdArray.add("HIV");
        stdArray.add("Syphilis");
        stdArray.add("Chlamidya");
    	BIRTH = new HashMap<String,Double>(3);
      	BIRTH.put("Down",0.4);
      	BIRTH.put("CongenitalHeart",0.5);
      	BIRTH.put("PKU",0.75);
        birthArray.add("Down");
        birthArray.add("CongenitalHeart");
        birthArray.add("PKU");
    	RANDOM = new HashMap<String,Double>(3);
      	RANDOM.put("Flu",0.2);
      	RANDOM.put("Cancer",1.0);
      	RANDOM.put("pneumonia",0.5);
        randomArray.add("Flu");
        randomArray.add("Cancer");
        randomArray.add("pneumonia");
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
    	Human a = new Child(Keyboard.readString());

      if(Math.random() < 0.4){
        a.getSick("birth");
      }

    	//  Minigames.type(a);
    	System.out.println(a._name + " undergoes a developmental period of his/her infant life.");

    	//Escaped string to facilitate compiling - Developmental baby art
    	System.out.println("         \r\n               ,==.              |~~~\r\n              /  OO\\             |\r\n              \\c  -_)         |~~~\r\n               `) (           |\r\n               /   \\       |~~~\r\n              /   \\ \\      |\r\n             ((   /\\ \\_ |~~~ \r\n              \\\\  \\ `--`|\r\n              / / /  |~~~\r\n         ___ (_(___)_|");

    	System.out.println(a._name + " learns how to babble, crawl, walk, and eventually talk.\n");
    	System.out.println("It's time for "  + a._name + " to start his journey to become a 'real person'... Prepare to simulate.");

    	//Go to school at six years old
    	a._age = 6.0;

    	// a._age = 14.0; used for teen testing purposes :)

      //Simulate life
    	while(!a.isDead() && a.getAge() < 31){
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
      		    break;

      		default:
      		    Settings.atTrip(a);
      		    break;
      		}
      	    }

      	    else if(a.getAge() < 18 && !a._hasChild){//Teen
      		//System.out.println("\n" + a._name + " is now a teenager!");
      		Human a_temp = new Teen(a); //Teen with values from Human a
      		a = a_temp;
      		//  a.partTime();

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
        else if(a._age == 18){
          if(!a._hasChild){
            System.out.println("What is " + a._name+   "'s future job?");
            String job;

            job = Keyboard.readString();

            a._future = job;
            System.out.println("What is the average income for such a job? (be realistic)");
            int salary = Keyboard.readInt();
            a._income = salary;
          }else{
            a._future = "Laborer";
            a._income = 40000;
      		}

      	    }
      	    else{
      		Human a_temp = new Adult(a);
      		a = a_temp;
      		//System.out.println(a._income);
      		//System.out.println(a._future);
      		//System.out.println("\n" + a._name + " is now a Adult!");

      		System.out.println("\nWhat should " + a._name + " do today? a) work b) take care of child c) college");
      		String act = Keyboard.readString();
      		switch(act){
      		case "a":
      		    Settings.atWork(a);
      		    break;

      		case "b":
          if(a._hasChild){
            ( (Adult)a).childCare();
          }
          else{
            System.out.println(a._name + " doesn't have children....");
          }
      		    break;

      		case "c":
      		    Settings.atSchool(a);
              a.setMoney(a.getMoney() - 20000);
      		    break;
      		}
          System.out.println("----------------------");
          System.out.println();
          ((Adult)a).payBills();
          ((Adult)a).payTaxes();
      	 }
            if(a._physHealth == 1 || a._mentalHealth == 1){
              Settings.atHospital(a);
            }
            a.loseSick();
      	    a.growUp();
      	    Settings.randEvent(a);

            if(a.getMoney() < 0){
              a.setMoney(0);
            }
            if(a.getMental() > 10){
              a.setMental(10);
            }
            if(a.getPhysical() > 10){
              a.setPhysical(10);
            }
      	}
      }
}//end class

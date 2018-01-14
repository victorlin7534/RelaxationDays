import cs1.Keyboard;
import java.io.*;
import java.util.Scanner;

//Events handles the dialogue
public class Settings{

  public static int oneOf(int min, int max){
    return min + (int) (Math.random() * (max - min) + 1);
  }


  public static boolean atParty(int lineNum){
    File file = new File("Party.txt");
    System.out.println(talk(file,lineNum));
    return true;
  }

  public static Human atSchool(Human x){

    boolean choice = false;
    File file = new File("School.txt");

    //Chance of having a relaxation day
    if(Math.random() < 0.35){
      System.out.println("Surprise! It's a relaxation day! (that means test...)");
      int testScore = 0;
      if(x instanceof Child){
        for(int i=1;i<6;i+=2){
          System.out.println(talk(file,i));
          if(Keyboard.readString().equals(talk(file,i+1))){
            testScore++;
          }
        }
      }else if(x instanceof Teen){
        for(int j=7;j<12;j+=2){
          System.out.println(talk(file,j));
          if(Keyboard.readString().equals(talk(file,j+1))){
            testScore++;
          }
        }
      }
      System.out.println(testScore + " correct answer(s)");
    }
    else{
      System.out.println("Should " + x.getName() + " pay attention? a) yes b) no");
      String decision = Keyboard.readString();

      switch(decision){
        //If human chooses to pay attention
        case "a":
        if(x instanceof Child){
          System.out.println(talk(file,oneOf(13,15)));
          choice = true;
        }
        break;
        case "b":
        System.out.println(talk(file,oneOf(16,17)));
      }

    }
    return x;
  } //end atSchool method

  // public static boolean sickness(){
  //   File file = new File("");
  //   return talk(file,lineNum);
  // }
  //
  // public static boolean carHit(){
  //   File file = new File("");
  //   return talk(file,lineNum);
  // }
  //

  public static boolean atHospital(int lineNum){
    File file = new File("Hospital.txt");
    System.out.println(talk(file,lineNum));
    return true;
  }

  public static Human atPark(Human x){
    System.out.println("        ###\r\n      #o###\r\n   #####o###\r\n   #o#\\#|#/###\r\n    ###\\|/#o#\r\n     # }|{  #\r\n       }|{");
    System.out.println(x.getName() + " goes to the park. ");
    double injuryProb = Math.random();


    System.out.println("Should " + x.getName() + " play ... a) monkey bars b) sports");
    String decision = Keyboard.readString();
    switch(decision){
      case "a":
      System.out.println();
      System.out.println("Off to the monkey bars!");
      if(injuryProb > 0.75){
        System.out.println("Shoot! "+ x.getName() + " fell off the monkey bars!");
        x.getInjured();
      }
      //add minigame-HERE
      break;

      case "b":
      System.out.println();
      System.out.println("Off to the the sports field!");
      if(injuryProb > 0.75){
        System.out.println("Shoot! "+ x.getName() + " slipped and is now bruised.");
        x.getInjured();
      }
      else{
        //add minigame here
        x.workout();
      }


    }
    return x;
  }

  public static void atHome(Human x){
    System.out.println(" \r\n    House\r\n     /\\-\\\r\n    _||\"|_\r\n    ");
    System.out.println(x.getName() + " stays at home that day.");

    System.out.println("Should " + x.getName() + " a) sleep all day b) play something ");
    String decision = Keyboard.readString();
    switch(decision){
      case "a":
      System.out.println("     o\r\n       |\r\n o    ,|.\r\n |  ,' \\ `.\r\n |,'\\,' ,' `.   o\r\n |.`. ,'" +
      "     `. |\r\n | `.`.    o  ,'| \r\n     `.`.  |,'  |\r\n       `.`.|  ,'|\r\n         `.|,'\r\n           |");
      x.sleep();
      break;


      case "b":
      System.out.println("minigame here");
      //place minigame here
    }

    }




    public static boolean atWork(int lineNum){
      File file = new File("Work.txt");
      System.out.println(talk(file,lineNum));
      return true;
    }

    public static String talk(File a, int lineNum){
      try {
        //Create a new Scanner object which will read the data from the file passed in.
        //Check if there is another line and loop through until desired line number is found.
        //When desired line number found, print it.
        Scanner scanner = new Scanner(a);
        int lineCtr = 1;
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          if(lineCtr == lineNum)
          {
            return line;
          }
          lineCtr +=1 ;
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace(); //helps trace the exception
      }
      return null;
    }
  }//end class

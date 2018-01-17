import cs1.Keyboard;
import java.io.*;
import java.util.Scanner;

//Events handles the dialogue
public class Settings{

  public static int oneOf(int min, int max){
    return (int)(Math.random() * ((max - min) + 1)) + min;
  }


  public static void atParty(Human x){
    Minigames.type(x);
    int action = oneOf(1,2);
    int lineNum = oneOf(1,3);
    File file = new File("Party.txt");

    if(action == 1){
      System.out.println(x.getName() + " is offered drugs. Take the offer? a) yes b) no");
      String choice = Keyboard.readString();
      switch(choice){
        case "a":
        x.doDrugs();
        break;

        case "b":
        System.out.println(x.getName() + " exercises great self-restraint and understands the possible efects of drug use.");
        break;
      }

    }
    else{
      System.out.println(x.getName() + " is offered a drink. Take the offer? a) yes b) no");
      String decision = Keyboard.readString();

      switch(decision){
        case "a":
        System.out.println("   .\r\n  .\r\n . .\r\n  ...\r\n\\~~~~~/\r\n \\   /\r\n  \\ /\r\n   V\r\n   |\r\n   |\r\n  ---");
        System.out.println(talk(file,lineNum));
        if(lineNum == 1) {
          x.sex();
        }
        else{
          x._physHealth -= 1.0;
          x._mentalHealth -= 0.5;
          Minigames.followLine(x);

        }
        break;
        case "b":
        System.out.println(x.getName() + "- 'I think im gonna leave...this isnt for me'");

      }

    }
  }

  public static boolean atSchool(Human x){
    System.out.println("__\r\n         \\_}\r\n        .-./--.\r\n       /# ^^   \\\r\n       |       |\r\n        \\     /\r\n         `\"`\"`\r\n ");
    boolean choice = false;
    File file = new File("School.txt");

    //Chance of having a relaxation day
    if(Math.random() < 0.35){
      System.out.println("You scored a: " + Minigames.test(file,x) + " on the test");
      x.setMental(x.getMental() + 1);
    }
    else{
      System.out.println("Should " + x.getName() + " pay attention? a) yes b) no");
      String decision = Keyboard.readString();

      switch(decision){
        //If human chooses to pay attention
        case "a":
        System.out.println(talk(file,oneOf(37,38)));
        choice = true;
        x.setMental(x.getMental() + 0.5);
        break;
        //If human does not pay attention
        case "b":
        System.out.println(talk(file,oneOf(39,40)));
        x.setMental(x.getMental() - 0.5);

      }

    }
    return choice;
  } //end atSchool method


  public static void atHospital(Human x){
    File file = new File("Hospital.txt");
    System.out.println(talk(file,oneOf(1,2)));

    if( Minigames.quickType(x)){
      x._mentalHealth += 2.0;
      x._physHealth += 2.0;
      if(x._sickness.length() > 0){
        if(Math.random() < 0.2){
          x._sickTypef = x._sickType;
          x._sickType = "";
          x._sickness = "";
          System.out.println(x.getName() + " has been cured.");
        }
      }
    }else{
      x._physHealth = 0.0;
      System.out.println(x.getName() + " could not be saved");
    }
  }

  public static Human atPark(Human x){
    System.out.println("        ###\r\n      #o###\r\n   #####o###\r\n   #o#\\#|#/###\r\n    ###\\|/#o#\r\n     # }|{  #\r\n       }|{");
    System.out.println(x.getName() + " goes to the park. ");
    double injuryProb = Math.random();


    System.out.println("Should " + x.getName() + " play ... a) monkey bars b) sports c) make friends");
    String decision = Keyboard.readString();
    switch(decision){
      case "a":
      System.out.println();
      System.out.println("Off to the monkey bars! Try not to fall!");
      if(!Minigames.quickType(x)){
        System.out.println("Shoot! "+ x.getName() + " fell off the monkey bars!");
        x.getInjured();
      }
      else{
        System.out.println("Good job " + x.getName() + " for not falling!");
      }
      break;

      case "b":
      System.out.println();
      System.out.println("Off to the the sports field!");
      System.out.println("                    ___\r\n o__        o__     |   |\\\r\n/|          /\\      |   |X\\\r\n/ > o        <\\     |   |XX\\");
      if(injuryProb > 0.75){
        System.out.println("Shoot! "+ x.getName() + " slipped and is now bruised.");
        x.getInjured();
      }
      else{
        //add minigame here
        x.workout();
      }
      break;

      case "c":
      System.out.println(x.getName() + " has made a friend");
      x._mentalHealth += 1.5;
    }
    return x;
  }

  public static void atTrip(Human x){
    System.out.println(x.getName() + " has a trip to an amusement park!\n");
    double prob = Math.random();
    System.out.println("Should " + x.getName() + " ride a rollercoaster? a) yes b) no");

    String decision = Keyboard.readString();
    switch(decision){
      case "a":
      if(prob > 0.4){
        System.out.println("\r\n +   __    ___                    /XXXXX\r\n |  /XX\\  /   \\        __        /XXXXXX\r\n | /XXXX\\(     )      /XX\\      /xXXXXXX\r\n |/XXXXXX\\\\___/__    /XXXX\\    /xXXXXXXX\r\n /XXXXXXXX\\__/XXX\\__/XXXXXX\\__/xXXXXXXXX");
        System.out.println(x.getName() + " has a lot of fun. +0.5 mental health");
        x.setMental(x.getMental() + 0.5);
      }
      else{
        //Vomit art
        System.out.println("\r\n   .-'\"'-.\r\n  / `. ,' \\\r\n |  ,' `.  |\r\n |   ___   |\r\n  \\ ( . ) /\r\n   '-.:.-'\r\n     .:.\r\n     :::          lf\r\n     :::\r\n     ::.\r\n     '::\r\n      '");
        System.out.println("Jeez! " + x.getName() + " vomited.");
        x.setMental(x.getMental() - 0.5);

      }
      break;
      case "b":
      System.out.println("Well that's not fun....");
      break;
    }
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
      Minigames.TicTacToe();

      if(x instanceof Teen){
        System.out.println(x.getName() + " has some spare time to make cash. Work a little? a) yes b) no");
        String choice = Keyboard.readString();
        if(choice == "a"){
          ((Teen) x).partTime(3);
        }

      }
      break;
    }
  }

  public static void atWork(Human x){
    System.out.println(" __          __        _      _ \r\n \\ \\        / /       | |    | |\r\n  \\ \\  /\\  / /__  _ __| | __ | |\r\n   \\ \\/  \\/ / _ \\| '__| |/ / | |\r\n    \\  /\\  / (_) | |  |   <  |_|\r\n     \\/  \\/ \\___/|_|  |_|\\_\\ (_)\r\n                                \r\n                                ");
    if(Minigames.work1(x)){
      x.setMoney(x.getMoney() + x._income);
    }else{
      x.setMoney(x.getMoney() + x._income/2);
    }
    x.setPhysical(x.getPhysical() - 0.5);
    x.setMental(x.getMental() - 0.5);
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

  public static void randEvent(Human x){
    double chance = Math.random();
    double chance2 = Math.random();
    double chance3 = Math.random();
    if(chance < 0.1){
      if(chance2 < 0.1){
        System.out.println("Tis A Natural Disaster");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                      \r\n   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                        \r\n      \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                        \r\n         \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                          \r\n           \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                           \r\n              \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                             \r\n                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                              \r\n                   \\\\\\\\\\\\\\\\\\\\\\\\\\\\                               \r\n                   \\\\\\\\\\\\\\\\\\\\\\\\\\                                \r\n                   \\\\\\\\\\\\\\\\\\\\\\\\                                 \r\n                  \\\\\\\\\\\\\\\\\\\\\\\\                                  \r\n                 \\\\\\\\\\\\\\\\\\\\\\\\                                   \r\n                \\\\\\\\\\\\\\\\\\\\\\\\                                    \r\n               \\\\\\\\\\\\\\\\\\\\\\\\                                     \r\n              \\\\\\\\\\\\\\\\\\\\\\\\                                      \r\n              \\\\\\\\\\\\\\\\\\\\\\\\                                      \r\n         `     \\\\\\\\\\\\\\\\\\\\\\\\      `    `                         \r\n            *    \\\\\\\\\\\\\\\\\\\\\\\\  *   *                            \r\n     `    *    *   \\\\\\\\\\\\\\\\\\\\\\\\   *  *   `                      \r\n             *   *   \\\\\\\\\\\\\\\\\\\\  *                              \r\n          `    *   * \\\\\\\\\\\\\\\\\\ *   *   `                        \r\n       `    `     *  \\\\\\\\\\\\\\\\   *   `_____                      \r\n             \\ \\ \\ * \\\\\\\\\\\\\\  * /  /\\`````\\                    \r\n           \\ \\ \\ \\  \\\\\\\\\\\\  / / / /  \\`````\\                    \r\n         \\ \\ \\ \\ \\ \\\\\\\\\\\\ / / / / |[] | [] |");
        x.setMoney(x.getMoney() / 2);
        if(chance3 < 0.1){
          System.out.println("Rest in Peace...You have died from the storm");
          x.setPhysical(0);
        }
      }else if(chance2 > 0.9){
        System.out.println("You were hit by a car");
        if(chance3 < 0.1){
          System.out.println("Rest in Peace...You have died from the car accident.");
          x.setPhysical(0);
        }else{
          atHospital(x);
        }
      }
    }else if(chance > 0.7){
          x.getSick("random");
    }
  }
}//end class

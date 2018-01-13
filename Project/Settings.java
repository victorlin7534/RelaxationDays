import cs1.Keyboard;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Events handles the dialogue
public class Settings{

  public static boolean atParty(int lineNum){
    File file = new File("Party.txt");
    System.out.println(talk(file,lineNum));
    return true;
  }

  public static int atSchool(Human x){
    File file = new File("School.txt");
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
    return testScore;
  }

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

//import cs1.Keyboard;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Events handles the dialogue
public class Settings{

  public static boolean atParty(int lineNum){
    File file = new File("Party.txt");
    return talk(file,lineNum);
  }

  public static boolean atSchool(int lineNum){
    File file = new File("School.txt");
    return talk(file,lineNum);
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
  public static boolean takeTest(int line){
    File file = new File("Test.txt");
    return talk(file,lineNum);
  }

  public static boolean atHospital(int line){
    File file = new File("Hospital.txt");
    return talk(file,lineNum);
  }

  public static boolean atWork(int line){
    File file = new File("Work.txt");
    return talk(file,lineNum);
  }

  public static boolean talk(File a, int lineNum){
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
          System.out.println(line);
        }
        lineCtr +=1 ;
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace(); //helps trace the exception
    }
    return true;
  }
}//end class

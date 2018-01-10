//import cs1.Keyboard;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

//Events handles the dialogue
public class Settings{

  public static boolean atParty(int lineNum){
    File file = new File("Party.txt");
    try {
      //Create a new Scanner object which will read the data from the file passed in.
      //Check if there is another line and loop through until desired line number is found.
      //When desired line number found, print it.
      Scanner scanner = new Scanner(file);
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

//testing
/*  public static void main(String[] args){
    atParty(1);
    atParty(2);
    atParty(3);
  }*/

}//end class

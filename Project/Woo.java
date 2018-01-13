import cs1.Keyboard;
import java.util.*;

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

  System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' " + "\n");
  System.out.println(" `\\.____|_\\\r\n   \\______/\r\n    (_)(_)\r\n");
  System.out.println("Give the human a name: ");
  Human a = new Child(Keyboard.readString());
  //life method found in human
  while(!a.isDead() && a.getAge() < 100){
    System.out.println(a);
    if(a.getAge() < 13){ //Child
      System.out.println("\nWhat do you want to do? a) school b) c)");
      String act = Keyboard.readString();
      switch(act){
        case "a":
          System.out.println("Your score: " + Settings.atSchool(a));
          break;
      }
    }

    else if(a.getAge() < 18){//Teen
      Human a_temp = new Teen(a); //Teen with values from Human a
      a = a_temp;
      System.out.println("\nWhat do you want to do? a)school b) c)");
      String act = Keyboard.readString();
      switch(act){
        case "a":
          System.out.println("Your score: " + Settings.atSchool(a));
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

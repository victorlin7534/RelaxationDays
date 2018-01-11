import cs1.Keyboard;
import java.util.*;

public class Woo{

  private ArrayList stuff;

  public void create(){
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
  }

  public static void main(String []args){

    System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' ");
    System.out.println("Give the human a name: ");
    Human a = new Child(Keyboard.readString());
    //life method found in human
    while(a.life()){
      a.stats();

    }
  }


}//end class

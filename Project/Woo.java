import cs1.Keyboard;

public class Woo{


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

import cs1.Keyboard;

public class Woo{

  //***Lives a human can live. One is not BOUND to a life. Decisions need to be made. ***

  public static void nerdLife(Human o){
      System.out.println("Do you wish to ");
  }

  public static void athleteLife(Human o){
      System.out.println("Do you wish to ");
  }

  public static void drugLife(Human o){
      System.out.println("Do you wish to (a)take drugs or (b)sell drugs? ");
      if(Keyboard.readString().equals("a")){
        System.out.println("Which drug do you wish to take? ");
        Druggie.showDrugs();
        Druggie.doDrugs(Keyboard.readString(),o);
      }else{
        System.out.println("Which drug do you wish to sell? ");
        Druggie.showDrugs();
        Druggie.dealDrugs(Keyboard.readString(),o);
      }
  }

  public static void main(String []args){

    System.out.println("PUSH! PUSH!..... 'wah' .... 'wah' ");
    System.out.println("Give the human a name: ");
    Human a = new Child(Keyboard.readString());

    System.out.println("Choose life: \n a) druggie\n b) nerd \n c) athlete");
    String choice = Keyboard.readString();

    //Check for valid user input. If not valid give them drug life path.
    if( ! ( choice.equals("a") || choice.equals("b") || choice.equals("c") ) ){
      System.out.println("Human Selection Failed. Picking for user drug life...");
      choice = "a";
    }

    //Human life simulation begins.... prepare for the adventure of your life
    if(choice.equals("a")){
      System.out.println(a.getName() + " was born in a household surrounded by drugs.");
      System.out.println("Sadly " + a.getName() + " adopted his parents' behaviors.");

      while( ( ! ( a.isDead() ) )  && a.getAge() < 13) {
        drugLife(a);

        a.setPhysical(a.getPhysical() - 10);
        a.setMental(a.getMental() - 0.1);
//a.die();
      }
      System.out.println("The end");
    }

    else if(choice.equals("b")){
      System.out.println(a.getName() + " was a scholar from " + a.getName() + "'s inception.");
      while( ( ! ( a.isDead() ) )  &&  a.getAge() < 13){
        nerdLife(a);
        System.out.println("livin the nerd life");
        a.setPhysical(a.getPhysical() - 0.1);
        a.setMental(a.getMental() - 0.1);
      }
    }

    else if(choice.equals("c")){
      System.out.println(a.getName() + "'s parents were olympic level athletes; thus, " + a.getName() + " followed their footsteps.");
      while( ( ! ( a.isDead() ) )  &&  a.getAge() < 13){
        athleteLife(a);
        System.out.println("livin the athletic life");
        a.setPhysical(a.getPhysical() - 0.1);
        a.setMental(a.getMental() - 0.1);
      }
    }

    //teen
    /*  Human b = new Teen(a);
    System.out.println("Choose life: \n a) druggie \n b) nerd \n c) athlete");
    _teenType = Keyboard.readString();
    if(_teenType.equals("a")){

  }
  else if(_teenType.equals("b")){

}
else if(_teenType.equals("c")){

}

//adult
Human c = new Adult(b);
System.out.println("Choose life: \n a) worker \n b) addict \n c) ");////////////////////////////
_adultType = Keyboard.readString();
if(_adultType.equals("a")){

}
else if(_adultType.equals("b")){

}
else if(_adultType.equals("c")){

}
}
*/
}



}//end class

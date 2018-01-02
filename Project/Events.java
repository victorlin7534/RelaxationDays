import cs1.Keyboard;
//handles the dialogue and events
public class Events{

  public static void SOP(Object x){
    System.out.println(x);
  }

  public static boolean sickness(Human o,String type){
    if(type.equals("physical")){
      o.setPhysical(o.getPhysical() - 0.5);
    }else{
      o.setMental(o.getMental() - 0.5);
    }
    return true;
  }

  public static void carHit(Human o){
    System.out.println("Did that dude not see the red light? Where's the ambulance!?");
    if(Math.random() < .5){
      o.die();
      System.out.println(o.getName() + " has passed away.");
    }
    else{
      System.out.println("Is this the end, or is there more?");
      System.out.println("a)Yes this is the end\nb)No, take me to the Hospital");
      String choice = Keyboard.readString();
      if(choice.equals("a")){
        o.die();
      }
      else{
        atHospital(o);
      }
    }
  }


  //********SCHOOL METHODS*****************
  public static boolean atSchool(Human o){
    SOP("Another beautiful day at school for " + o.getName());

    return true;
  }

  public static void takeTest(Human o){
    SOP("Test time!");
    SOP("What is the worst case run time of Selection Sort?");
    SOP("a) n b) n^2 c) A Thinker is Capable of Great Things");
    String choice = Keyboard.readString();
    if(choice.equals("b")){
      SOP("You are correct");
    }else{
      SOP("You are incorrect; the answer is b, n^2");
    }
  }
  //***************************************
  public static boolean atHospital(Human o){
    SOP("Welcome to the Hospital");
    //do hospital stuff
    return true;
  }


//**********PARTY METHODS******************
  public static boolean atParty(Human o){


    return true;
  }

  public static void drink(Human o){
    System.out.println("Chug! Chug! Chug!");
    _physHealth -= 1.0f;
  }

//*****************************************

}//end class

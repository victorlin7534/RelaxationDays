public class Athlete{

  public static void superWorkout(Human o){
    System.out.println("Time to go lift some major weights!");

    //Injury factor
    if(Math.rand() < 0.3){
      System.out.println(o.getName() + " was injured. Lower the weights dude.");
      o.setPhysical(o.getPhysical() - 3.0);
    }
    else{
      System.out.println("Jeez that was an intense session. Where's the protein shake?");
      o.setPhysical(o.getPhysical() + 2.0);
      o.setMental(o.getMental() + 1.0);
    }

  } //end superWorkout method


}//end class

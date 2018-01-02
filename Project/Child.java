public class Child extends Human{

  //instance variables

  //default constructor
  public Child(){
    _name = "Life";
    _physHealth = 1.0;
    _mentalHealth = 1.0;
    _money = 0;
    _age = 0;
  }

  //overloaded constructor with name as a parameter
  public Child(String name){
    this();
    _name = name;
  }

  //**************Child specific ways to die***************

  //Simulates event where child eats a toy
  //Possible Outcomes: Death/Decreased mental health
  public void eatToy(){
    System.out.println("Mother: Oh my God get that out of your mouth " + getName() + "!");
    System.out.println("...Mother attempts diaphram maneuver...");
    if(Math.random() <= 0.33){
      die();
      System.out.println("Mother: My baby! Wake up!");
      System.out.println(getName() + " has passed away so soon...");
      System.out.println();
    }
    else{
      System.out.println("Mother: Jesus! You scared me to death. Don't eat the toys!");
      setMental(getMental() - 0.5);
    }
  }

  //Simulates event where child meets a stranger
  //Possible Outcomes: Death/Decreased Mental Health

  //**************************************************************************

  public void makeFriends(){
      System.out.println("Finally, some companionship.");
  }

} //end class Child

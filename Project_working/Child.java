public class Child extends Human implements Nerd,Athlete{

  //instance variables

  //default constructor
  public Child(){
    _name = "Life";
    _physHealth = 10.0;
    _mentalHealth = 10.0;
    _money = 0;
    _age = 0;
    _future = "";
    _income = 0;
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

  public void study(){
    _mentalHealth += 0.5;
  }

public void workout(){
  System.out.println("This is some good  cadiovascular exercise for " + this.getName() + ". + 0.5 physical health");
  _physHealth += 0.5;
}

} //end class Child

import java.util.Random;

public class Teen extends Human{
  //instance variables
  private String _future;
  private int chance; //probability to obtain a significant other

  //default constructor
  public Teen(Child o){
    _name = o.name;
    _physHealth = o._physHealth;
    _mentalHealth = o._mentalHealth;
    _age = o.age;
    _money = o._money;
  }

  public void growUp(){
    if(_age == 19){
      if(Random.nextDouble() > 0.5){
        _mentalHealth -= 2;
        _future = "college";
      }else{
        _future = "working";
      }
    }else{
      _age++;
    }
  }

  public void study(){
    _mentalHealth += 0.25;
    _physHealth -= 0.25;
  }

  public void exercise(){
    if(Math.random() < 0.2){
      //injury
      System.out.println(_name + "needs to stop ego lifting! Grats on the injury.")
      _mentalHealth -= 2;
      _physHealth -= 2;
    }
    else{
      _mentalHealth += 0.05;
      _physHealth += 0.25;
    }
  }
//randomize STD l8r.
  public void sex(){
    System.out.println("There isn't a condom in sight! Still want to have sex? (yes or no)");
    String decision = Keyboard.readString();
    double probability = Math.random();
    switch(decision):
      case "yes":
        if(probability < 0.25){
          System.out.println(_name + "got texted the day after and developed no STDs!");
        }

        else if(probability < 0.5){
          System.out.println("Did you not take health class?" + _name ".you got " + STDS[0]);
        }

        else if(probability < 0.75){
          System.out.println("Congratulations " + _name ". You're a teen parent now!");
        }

        else{
          System.out.println("You're now a parent and you also got " + STDS[0]);
        }
        break;
      case "no":
        System.out.println(_name + " practiced self retraint! Stay safe!");
        break;
  }
  /*  if(type.equals("unprotected")){
      System.out.println("");
      _money -= 250;
    }else{
      System.out.println("I'm sorry I can't do this. Im feeling... out of sorts");
    }
  }*/

  public void partTime(int hours){
    System.out.println(_name + " only does the job for the money.");
    _mentalHealth -= 0.5;
    _money += 7 * hours;
  }

  public void sleep(){
    System.out.println("*...snooze...*");
    _mentalHealth += 0.5;
  }
}// end class Teen

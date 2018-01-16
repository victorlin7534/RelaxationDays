import cs1.Keyboard;
import java.util.ArrayList;

public abstract class Human{

  //instance variables
  protected String _name;
  protected double _physHealthf; //old value
  protected double _mentalHealthf; //old value
  protected double _physHealth; //Scale of 0 - 10 where 10 is peak physical health
  protected double _mentalHealth; //Scale of 0 - 10 where 10 is peak mental health
  protected int _money; //amount of money indicates class level
  protected double _age;
  protected String _future;
  protected int _income;
  protected boolean _hasChild;

  //*************ACCESSOR METHODS*********************
  public String getName(){return _name;}

  public double getAge(){return _age;}

  public int getMoney(){return _money;}

  public double getPhysical(){return _physHealth;}

  public double getPhysicalf(){return _physHealthf;}

  public double getMental(){return _mentalHealth;}

  public double getMentalf(){return _mentalHealthf;}


  //******************MUTATORS**************************
  public void setAge(double a){_age = a;}

  public void setMoney(int m){_money = m;}

  public void setPhysical(double health){_physHealth = health;}

  public void setMental(double health){_mentalHealth = health;}
  //**************************************************

  //checks if human is dead
  public boolean isDead(){
    return (_physHealth <= 0 || _mentalHealth <= 0);
  }

  //human dies
  public void die(){
    _physHealth = 0.0;
    _mentalHealth = 0.0;
    System.out.println(_name + " has died.");
  }

  public void growUp(){_age += 1.0;}

  public void sleep(){
    System.out.println(this.getName() + " feels very sleepy and takes a long rest.");
    System.out.println("His body is allowd to rest and gains +1.0 mental health");
    _mentalHealth += 1.0;
  }

  public String toString(){
    return "\nName: " + getName() +
    "\nPhysical health: " + getPhysicalf() + "->" + getPhysical() +
    "\nMental health: " + getMentalf() + "->" + getMental() +
    "\nAge: " + getAge() +
    "\nMoney: " + getMoney();
  }

  public void getInjured() {
    _physHealth -= 1.0;
    System.out.println("Physical health decreased by 1.0 due to an injury");
  }

  public void sex(){
    System.out.println("There isn't a condom in sight! Still want to have sex? a) yes b) no");
    String decision = Keyboard.readString();
    double probability = Math.random();
    switch(decision){
      case "a":
      if(probability < 0.25){
        System.out.println(getName() + " got tested the day after and developed no STDs!");
      }

      else if(probability < 0.5){
        System.out.println("Did you not take health class?" + getName() + ". You got an STD.");
      }

      else if(probability < 0.75){
        System.out.println("Congratulations " + getName() + ". You're a parent now!");
      }

      else{
        System.out.println("You're now a parent and you also got STDs/ ");
      }
      break;
      case "b":
      System.out.println(getName() + " practiced self retraint! Stay safe!");
      break;
    }
  }

  public void doDrugs(){
    System.out.println("Would you like to do a) cocaine b) fentanyl c) lsd");
    String decision = Keyboard.readString();
    switch(decision){
      case "a":
      System.out.println("Cocaine really stimulates " + this._name + " .... *jitters*");
      System.out.println("Physical and Mental health -1.0");
      _physHealth -= 1.0;
      _mentalHealth -= 1.0;
      _age += 0.5;
      break;
      case "b":
      System.out.println(this._name + " shouldnt have taken fentanyl....");
      System.out.println("Physical health reduced to 0");
      _physHealth = 0;
      break;
      case "c":
      System.out.println(this._name + " prepares to experience enlightenment under the effects of lsd.");
      System.out.println("Physical health -0.3 and Mental Health +0.3");
      _physHealth -= 0.3;
      _mentalHealth += 0.3;
      break;
    }
  }

    public void dealDrugs(){
      System.out.println("Would you like to sell a) cocaine b) fentanyl c) lsd");
      String decision = Keyboard.readString();
      switch(decision){
        case "a":
        _money += 50;
        break;
        case "b":
        _money += 100;
        break;
        case "c":
        _money += 20;
        break;
      }
    }

    public void withdrawal(){
      System.out.println(this._name + " feels the pain of withdrawal symptoms... 'OWW MY HEAD'");
      _mentalHealth -= 0.2;
    }

    //***********ABSTRACT METHODS UNDER HERE ****************

    //public abstract void makeFriends();
    public abstract void workout();


  } //end class

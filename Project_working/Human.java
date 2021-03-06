import cs1.Keyboard;
import java.util.ArrayList;

public abstract class Human{

  //instance variables
  protected String _name;
  protected double _physHealthf; //old value
  protected double _mentalHealthf; //old value
  protected int _moneyf; //old value
  protected double _physHealth; //Determines life or death
  protected double _mentalHealth; //Determines life or death
  protected int _money; //amount of money indicates class level
  protected double _age;
  protected String _future;
  protected int _income;
  protected boolean _hasChild;

  protected String _sickness = "";
  protected String _sickType = "";
  protected String _sickTypef = "";

  //*************ACCESSOR METHODS*********************
  public String getName(){return _name;}

  public double getAge(){return _age;}

  public int getMoney(){return _money;}

  public int getMoneyf(){return _moneyf;}

  public double getPhysical(){return _physHealth;}

  public double getPhysicalf(){return _physHealthf;};

  public double getMental(){return _mentalHealth;}

  public double getMentalf(){return _mentalHealthf;};


  //******************MUTATORS**************************
  public void setAge(double a){_age = a;}

  public void setMoney(int m){_money = m;}

  public void setPhysical(double health){_physHealth = health;}

  public void setPhysicalf(double health){_physHealthf = health;}

  public void setMentalf(double health){_mentalHealthf = health;}

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

//increments age of a human
  public void growUp(){_age += 1.0;}

//replicates a human's sleep resulting in an increase in mental health
  public void sleep(){
    System.out.println(this.getName() + " feels very sleepy and takes a long rest.");
    System.out.println("His body is allowd to rest and gains +1.0 mental health");
    _mentalHealth += 0.5;
  }
//overwritten toString. Displays changes
  public String toString(){
    if(getPhysicalf() == getPhysical() && getMentalf() == getMental() && getMoneyf() == getMoney() && _sickTypef.equals(_sickType)){
      return "\nName: " + getName() +
      "\nPhysical health: " + (int)getPhysical() +
      "\nMental health: " + (int)getMental() +
      "\nAge: " + getAge() +
      "\nMoney: " + getMoney() +
      "\nSickness: " + _sickType;
    }else{
      return "\nName: " + getName() +
      "\nPhysical health: " + (int)getPhysicalf() + " -> " + (int)getPhysical() +
      "\nMental health: " + (int)getMentalf() + " -> " + (int)getMental() +
      "\nAge: " + getAge() +
      "\nMoney: " + getMoneyf() + " -> " + getMoney() +
      "\nSickness: " + _sickTypef + " -> " + _sickType;
    }
  }

//Decrease physical health due to injury
  public void getInjured() {
    _physHealth -= 1.0;
    System.out.println("Physical health decreased by 1.0 due to an injury");
  }

//Replicate sex  with possibility of no infirmities, only STD, or STD and parenthood
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
        getSick("sex");
      }

      else if(probability < 0.75){
        System.out.println("Congratulations " + getName() + ". You're a parent now!");
	_hasChild = true;

      }

      else{
        System.out.println("You're now a parent and you also got STDs/ ");
	_hasChild = true;
  getSick("sex");
      }
      break;
      case "b":
      System.out.println(getName() + " practiced self retraint! Stay safe!");
      break;
    }
  }
//******************END SEX****************************

//Gives a human a sickness
  public void getSick(String type){
    if(_sickness.length() == 0){
      switch(type){
        case "sex":
          _sickness = "STDS";
          _sickTypef = "";
          _sickType = Woo.stdArray.get(Settings.oneOf(0,2));
          break;

        case "birth":
          _sickness = "BIRTH";
          _sickTypef = "";
          _sickType = Woo.birthArray.get(Settings.oneOf(0,2));
          break;

        case "random":
          _sickness = "RANDOM";
          _sickTypef = "";
          _sickType = Woo.randomArray.get(Settings.oneOf(0,2));
          break;
        }
      }
      System.out.println("You got: " + _sickType);
    }
//************END GET SICK***************

//Decreases health due to sickness
  public void loseSick(){
    switch(_sickness){
      case "STDS":
        double temp = ((Double)Woo.STDS.get(_sickType)).doubleValue();
        _physHealthf = _physHealth;
        _mentalHealthf = _mentalHealth;
        _physHealth -= temp;
        _mentalHealth -= temp;
        break;

      case "BIRTH":
        temp = ((Double)Woo.BIRTH.get(_sickType)).doubleValue();
        _physHealthf = _physHealth;
        _mentalHealthf = _mentalHealth;
        _physHealth -= temp;
        _mentalHealth -= temp;
        break;

      case "RANDOM":
        temp = ((Double)Woo.RANDOM.get(_sickType)).doubleValue();
        _physHealthf = _physHealth;
        _mentalHealthf = _mentalHealth;
        _physHealth -= temp;
        _mentalHealth -= temp;
        break;
  }
}
//Simulates doing drugs with affects on physical and mental health
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
//Replicates dealing drugs to make money
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
//Simulates withdrawl symptoms of a drug with decreased mental health
    public void withdrawal(){
      System.out.println(this._name + " feels the pain of withdrawal symptoms... 'OWW MY HEAD'");
      _mentalHealth -= 0.2;
    }

    //***********ABSTRACT METHODS UNDER HERE ****************

    //public abstract void makeFriends();
    public abstract void workout();


  } //end class

import cs1.Keyboard;
import java.util.ArrayList;

public abstract class Human{

  //constant variables

  public final String[] STDS = {"HIV", "Syphilis", "Chlamidya"};
  public final String[] MENTAL = {"Depression", "Anxiety", "Schizophrenia"};
  public final String[] PHYSICAL = {"Flu", "Cancer", "Heart Disease"};

  //instance variables
  protected String _name;
  protected double _physHealth; //Scale of 0 - 10 where 10 is peak physical health
  protected double _mentalHealth; //Scale of 0 - 10 where 10 is peak mental health
  protected int _money; //amount of money indicates class level
  protected int _age;
  protected ArrayList<String> _friends;


  //*******METHODS NEEDED TO RUN LIFE**************************

  public boolean life(){
    this.childYears();
    this.teenYears();
    this.adultYears();
    return true;
  }

  public void childYears(){
    while(getAge() < 13){
      System.out.println("yeet");
      growUp();
    }
  }

  public void teenYears(){

  }

  public void adultYears(){

  }

  //****************************************************


  //*************ACCESSOR METHODS*********************
  //accessor method for the name of the human
  public String getName(){
    return _name;
  }

  //accessor method for age of Human
  public int getAge(){
    return _age;
  }

  //accessor method for amount of money Human has
  public int getMoney(){
    return _money;
  }

  public double getPhysical(){
    return _physHealth;
  }

  public double getMental(){
    return _mentalHealth;
  }

  //accesor method for Human's friends
  public ArrayList<String> getFriends(){
    return _friends;
  }
  //****************************************************


  //******************MUTATORS**************************

  public void setAge(int a){
    _age = a;
  }

  public void setMoney(int m){
    _money = m;
  }

  public void setFriend(String name){
    _friends.add(name);
  }

  public void setPhysical(double health){
    _physHealth = health;
  }

  public void setMental(double health){
    _mentalHealth = health;
  }
  //***************************************************

  //prints the humans characteristics.
  //used as human progresses through life.
  public void stats(){
    System.out.println("Physical Health: " + getPhysical());
    System.out.println("Mental Health: " + getMental());
    System.out.println("Age: " + getAge());
    System.out.println("Money: " + getMoney());
  }

  //checks if human is dead
  public boolean isDead(){
    return (_physHealth == 0 || _mentalHealth == 0);
  }

  //human dies
  public void die(){
    _physHealth = 0.0;
    _mentalHealth = 0.0;
    System.out.println(_name + " has died.");
  }

  //increases human's age
  public void growUp(){
    _age += 1;
  }

  public void sleep(){
    _mentalHealth += 1.0;
  }

  //***********ABSTRACT METHODS UNDER HERE ****************

  public abstract void makeFriends();

} //end class

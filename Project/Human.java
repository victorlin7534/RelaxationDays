import cs1.Keyboard;
import java.util.ArrayList;
import java.util.HashMaps;

public abstract class Human{

  //instance variables
  protected String _name;
  protected double _physHealth; //Scale of 0 - 10 where 10 is peak physical health
  protected double _mentalHealth; //Scale of 0 - 10 where 10 is peak mental health
  protected int _money; //amount of money indicates class level
  protected int _age;
  protected ArrayList _friends;

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

  //*************ACCESSOR METHODS*********************
  public String getName(){return _name;}

  public int getAge(){return _age;}

  public int getMoney(){return _money;}

  public double getPhysical(){return _physHealth;}

  public double getMental(){return _mentalHealth;}

  public ArrayList<String> getFriends(){return _friends;}

  //******************MUTATORS**************************
  public void setAge(int a){_age = a;}

  public void setMoney(int m){_money = m;}

  public void setFriend(String name){_friends.add(name);}

  public void setPhysical(double health){_physHealth = health;}

  public void setMental(double health){_mentalHealth = health;}
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
  public boolean isDead(){return (_physHealth == 0 || _mentalHealth == 0);}

  //human dies
  public void die(){
    _physHealth = 0.0;
    _mentalHealth = 0.0;
    System.out.println(_name + " has died.");
  }

  public void growUp(){_age += 1;}

  public void sleep(){_mentalHealth += 1.0;}


  //***********ABSTRACT METHODS UNDER HERE ****************

  public abstract void makeFriends();

} //end class

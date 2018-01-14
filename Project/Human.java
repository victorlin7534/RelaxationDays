import cs1.Keyboard;
import java.util.ArrayList;

public abstract class Human{

  //instance variables
  protected String _name;
  protected double _physHealth; //Scale of 0 - 10 where 10 is peak physical health
  protected double _mentalHealth; //Scale of 0 - 10 where 10 is peak mental health
  protected int _money; //amount of money indicates class level
  protected double _age;
  protected ArrayList _friends;

  //*************ACCESSOR METHODS*********************
  public String getName(){return _name;}

  public double getAge(){return _age;}

  public int getMoney(){return _money;}

  public double getPhysical(){return _physHealth;}

  public double getMental(){return _mentalHealth;}

  public ArrayList<String> getFriends(){return _friends;}

  //******************MUTATORS**************************
  public void setAge(double a){_age = a;}

  public void setMoney(int m){_money = m;}

  public void setFriend(String name){_friends.add(name);}

  public void setPhysical(double health){_physHealth = health;}

  public void setMental(double health){_mentalHealth = health;}
  //***************************************************

  //prints the humans characteristics.
  //used as human progresses through life.
  /*public void stats(){
    System.out.println("Physical Health: " + getPhysical());
    System.out.println("Mental Health: " + getMental());
    System.out.println("Age: " + getAge());
    System.out.println("Money: " + getMoney());
  }*/

  //checks if human is dead
  public boolean isDead(){return (_physHealth == 0 || _mentalHealth == 0);}

  //human dies
  public void die(){
    _physHealth = 0.0;
    _mentalHealth = 0.0;
    System.out.println(_name + " has died.");
  }

  public void growUp(){_age += 0.5;}

  public void sleep(){_mentalHealth += 1.0;}

  public String toString(){
    return "\nName: " + getName() +
    "\nPhysical health: " + getPhysical() +
    "\nMental health: " + getMental() +
    "\nAge: " + getAge() +
    "\nMoney: " + getMoney();
  }

  /*public void change(Human obj){
      if(getAge() == 13){//Teen
        Human obj = new Teen(obj);
      }else if(getAge() == 19){//Adult
      // Human a = new Adult(a);
      System.out.println("adult to be worked on");
      }
  }*/
  //***********ABSTRACT METHODS UNDER HERE ****************

  //public abstract void makeFriends();

} //end class

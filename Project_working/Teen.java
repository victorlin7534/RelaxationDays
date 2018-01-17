import java.util.Random;
import cs1.Keyboard;

public class Teen extends Human{
  //instance variables

  //private int chance; //probability to obtain a significant other

  //default constructor
  public Teen(Human o){
    _name = o._name;
    _physHealthf = o._physHealth;
    _mentalHealthf = o._mentalHealth;
    _physHealth = o._physHealth;
    _mentalHealth = o._mentalHealth;
    _age = o._age;
    _moneyf = o._moneyf;
    _money = o._money;
    _future = "";
    _income = 0;
  }

  /*public void findFuture(){
    if(_age == 18){
      if(Math.random() > 0.5){
        _mentalHealth -= 2;
        _future = "college";
      }else{
        _future = "working";
      }
    }
  }*/

  public void study(){
    _physHealthf = _physHealth;
    _mentalHealthf = _mentalHealth;
    _mentalHealth += 0.25;
    _physHealth -= 0.25;
  }

  public void exercise(){
    if(Math.random() < 0.2){
      //injury
      System.out.println(_name + "needs to stop ego lifting! Grats on the injury.");
      _physHealthf = _physHealth;
      _mentalHealthf = _mentalHealth;
      _mentalHealth -= 2;
      _physHealth -= 2;
    }
    else{
      _physHealthf = _physHealth;
      _mentalHealthf = _mentalHealth;
      _mentalHealth += 0.05;
      _physHealth += 0.25;
    }
  }

public void partTime(int hours){
  System.out.println(this._name + " likes to make money!");
  _mentalHealthf = _mentalHealth;
  _moneyf = _money;
  _mentalHealth -= 0.5;
  _money += 7 * hours;
}

public void sleep(){
  System.out.println("*...snooze...*");
  _mentalHealthf = _mentalHealth;
  _mentalHealth += 0.5;
}

public void makeFriends(){

}

public void workout(){

}
}// end class Teen

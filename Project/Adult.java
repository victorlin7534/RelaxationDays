public class Adult extends Human{

private int _income;

  public Adult(Human o){
    _name = o._name;
    _physHealth = o._physHealth;
    _mentalHealth = o._mentalHealth;
    _age = o._age;
    _money = o._money;
    _income = 70000;
  }

<<<<<<< HEAD
  public void payBills(){
    this._money -= 12000; //covers 6 months period
    System.out.println("Time to pay the bills again...");
    System.out.println(this._name + " loses a lot of money.");
=======
  public void makeFriends(){

  }

  //just put it here so i can test woo
  public void workout(){
    System.out.println("This is some good  cadiovascular exercise for " + this.getName() + ". + 0.5 physical health");
    _physHealth += 0.5;
>>>>>>> b5d1f23e1f38223cf055d94c719a80b4aece8758
  }

public void payTaxes(){
  this._money -= _income / 2;

}
public void workout(){

}

}//end class

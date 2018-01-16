public class Adult extends Human{



  public Adult(Human o){
    _name = o._name;
    _physHealth = o._physHealth;
    _mentalHealth = o._mentalHealth;
    _age = o._age;
    _money = o._money;
    _income = o._income;
    _future  =  o._future;

  }

  public void payBills(){
    this._money -= 12000; //covers 6 months period
    System.out.println("Time to pay the bills again...");
    System.out.println(this._name + " loses a lot of money.");
  }

public void payTaxes(){
  this._money -= _income / 2;

}
public void workout(){

}
    public void childCare(){
	System.out.println("Children are expensive these days!");
	_mentalHealth -= 0.5;
	_physicalHealth -= 0.5;
    }
}//end class

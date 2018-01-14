public class Adult extends Human{

  public Adult(Human o){
    _name = o._name;
    _physHealth = o._physHealth;
    _mentalHealth = o._mentalHealth;
    _age = o._age;
    _money = o._money;
  }

  public void makeFriends(){

  }

  //just put it here so i can test woo
  public void workout(){
    System.out.println("This is some good  cadiovascular exercise for " + this.getName() + ". + 0.5 physical health");
    _physHealth += 0.5;
  }

}//end class

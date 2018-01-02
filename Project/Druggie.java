//This class contains the methods a human can use during the druggie stage of his life
//Don't do drugs(or deal them) KIDS
public class Druggie extends Human{

  //Doing drugs decreases the amount of money Human has by the values in drugDmg()
  public void doDrugs(){
    this.setMoney(this.getMoney() - drugDmg(drug,o));
//testing
    thus.die();
  }

  // Dealing drugs increases the amount of money HUman has by the values in drugDmg()
  public static void dealDrugs(String drug, Human o){
    o.setMoney(o.getMoney() + drugDmg(drug,o));
  }

  public static void showDrugs(){
    System.out.println("cocaine");
    System.out.println("marijuana");
    System.out.println("methamphetamine");
    System.out.println("fentanyl");
    System.out.println("heroin");
    System.out.println("magicShrooms");
  }

  public int drugDmg(){
    switch(drug){
      case "cocaine":
      o.setPhysical(o.getPhysical() - 0.3);
      return 7;
      case "marijuana":
      o.setPhysical(o.getPhysical() - 0.5);
      return 3;
      case "methamphetamine":
      o.setPhysical(o.getPhysical() - 0.75);
      return 5;
      case "fentanyl":
      o.setPhysical(0);
      return 15;
      case "heroin":
      o.setPhysical(o.getPhysical() - 1.25);
      return 9;
      case "magicShrooms":
      o.setPhysical(o.getPhysical() - 0.75);
      o.setMental(o.getMental() - 0.5);
      return 7;
    }
    return 0;
  }

  //ask user for this option once physical and mental health are almost 0
  public static void rehab(Human o){
    System.out.println("Going to rehab. Going to set your life straight.");

    System.out.println("... 1 yr later");
    o.setAge(o.getAge() + 1);

    System.out.println("Seems like " + o.getName() + "is doing fine. Try to resist drug urges though. ");
  }

}//end class

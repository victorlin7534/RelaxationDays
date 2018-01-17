public class Adult extends Human{

    public Adult(Human o){
      _name = o._name;
      _physHealthf = o._physHealth;
      _mentalHealthf = o._mentalHealth;
      _physHealth = o._physHealth;
      _mentalHealth = o._mentalHealth;
      _age = o._age;
      _moneyf = o._money;
      _money = o._money;
      _income = o._income;
      _future  =  o._future;

    }

    public void payBills(){
      //Bills art
      System.out.println("$$$$$$$\\  $$\\ $$\\ $$\\                 $$\\ \r\n$$  __$$\\ \\__|$$ |$$ |                $$ |\r\n$$ |  $$ |$$\\ $$ |$$ | $$$$$$$\\       $$ |\r\n$$$$$$$\\ |$$ |$$ |$$ |$$  _____|      $$ |\r\n$$  __$$\\ $$ |$$ |$$ |\\$$$$$$\\        \\__|\r\n$$ |  $$ |$$ |$$ |$$ | \\____$$\\           \r\n$$$$$$$  |$$ |$$ |$$ |$$$$$$$  |      $$\\ \r\n\\_______/ \\__|\\__|\\__|\\_______/       \\__|\r\n                                          \r\n                                         ");
      _moneyf = _money;
      _money -= 12000; //covers 6 months period
      System.out.println("Time to pay the bills again...");
      System.out.println(this._name + " loses a lot of money.");
    }

    public void payTaxes(){
      //Taxes art
      System.out.println("/$$$$$$$$                                            /$$\r\n|__  $$__/                                           | $$\r\n   | $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$$      | $$\r\n   | $$ |____  $$|  $$ /$$/ /$$__  $$ /$$_____/      | $$\r\n   | $$  /$$$$$$$ \\  $$$$/ | $$$$$$$$|  $$$$$$       |__/\r\n   | $$ /$$__  $$  >$$  $$ | $$_____/ \\____  $$          \r\n   | $$|  $$$$$$$ /$$/\\  $$|  $$$$$$$ /$$$$$$$/       /$$\r\n   |__/ \\_______/|__/  \\__/ \\_______/|_______/       |__/\r\n                                                         \r\n");
      _moneyf = _money;
      _money -= _income / 2;

    }

    public void workout(){
      //Weightlifitng art
      System.out.println("  _                             _\r\n           | |                           | |\r\n         =O| |========mn=======nm========| |O=\r\n           |_|        ( \\     / )        |_|\r\n                       \\ )(\")( /\r\n                       ( /\\_/\\ )\r\n                        \\     /\r\n                         )=O=(\r\n                        /  _  \\\r\n                       /__/ \\__\\\r\n                       | |   | |\r\n                       |_|   |_|\r\n                       (_)   (_)");
      _physHealthf = _physHealth;
      _physHealth += 2.5;
    }

    public void childCare(){
      if(_hasChild){
      	System.out.println("Children are expensive these days!");
      	_mentalHealth -= 0.5;
      	_physHealth -= 0.5;
      }else{
        System.out.println("Haha. You thought you had children. Well, that is too bad");
      }
    }
}//end class

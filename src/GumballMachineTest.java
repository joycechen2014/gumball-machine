public class GumballMachineTest {
    public static void main(String[] args) {

        int[] coinsTypeQuarter = new int[]{25};
        int[] coinsTypeAny = new int[]{1, 10, 25, 50};

        // Test Gumball Machine which only accept 25 with Gumball price 25
        System.out.println("----------------------------------------------------------------------------------- ");
        System.out.println("1. Test Gumball Machine only accept 25 with 3 gumballs(each one costs 25)");
        System.out.println("----------------------------------------------------------------------------------- ");
        GumballMachine gumballMachine25 = new GumballMachine(3, coinsTypeQuarter, 25);

        System.out.println(gumballMachine25);

        //insert ￠25, valid
        System.out.println("***************** Insert ￠25, valid *****************");
        gumballMachine25.insertCoin(25);
        // gumball ejected
        gumballMachine25.turnCrank();

        //insert ￠25, valid
        System.out.println("***************** Insert ￠25, valid *****************");
        gumballMachine25.insertCoin(25);
        // gumball ejected
        gumballMachine25.turnCrank();

        //insert ￠10 invalid
        System.out.println("***************** Insert ￠10 invalid *****************");
        gumballMachine25.insertCoin(10);
        // gumball rejected
        gumballMachine25.turnCrank();

        //insert ￠25, valid
        System.out.println("***************** Insert ￠25, valid *****************");
        gumballMachine25.insertCoin(25);
        // gumball ejected
        gumballMachine25.turnCrank();

        // Test Gumball Machine which only accept 25 with Gumball price 50
        System.out.println("----------------------------------------------------------------------------------- ");
        System.out.println("2. Test Gumball Machine only accept 25 with 5 gumballs(each one costs 50)");
        System.out.println("----------------------------------------------------------------------------------- ");

        GumballMachine gumballMachine50 = new GumballMachine(3, coinsTypeQuarter, 50);
        System.out.println(gumballMachine50);

        // insert ￠25, still need ￠25 more
        System.out.println("***************** Insert ￠25, still need ￠25 more *****************");
        gumballMachine50.insertCoin(25);
        gumballMachine50.turnCrank();

        // insert ￠25 twice, gumball ejected
        System.out.println("***************** Insert ￠25 twice, gumball ejected *****************");
        gumballMachine50.insertCoin(25);
        gumballMachine50.insertCoin(25);
        gumballMachine50.turnCrank();

        // insert ￠10, invalid
        System.out.println("***************** Insert ￠10, invalid *****************");
        gumballMachine50.insertCoin(10);
        gumballMachine50.turnCrank();



        // Test Gumball Machine which accept any type of coin with Gumball price 50
        System.out.println("----------------------------------------------------------------------------------- ");
        System.out.println("3. Test Gumball Machine accept any type of coin with 5 gumballs(each one costs 50)");
        System.out.println("----------------------------------------------------------------------------------- ");



        GumballMachine gumballMachine50Any =  new GumballMachine(5,coinsTypeAny,50);
        System.out.println(gumballMachine50Any);

        // insert ￠10 twice
        System.out.println("***************** Insert ￠10 twice, still need ￠30 more *****************");
        gumballMachine50Any.insertCoin(10);
        gumballMachine50Any.insertCoin(10);
        gumballMachine50Any.turnCrank();

        // insert ￠25 once, ￠10 twice and ￠1 5 times
        System.out.println("***************** Insert ￠25 once, ￠10 twice and ￠1 5 times  *****************");
        gumballMachine50Any.insertCoin(25);
        gumballMachine50Any.insertCoin(10);
        gumballMachine50Any.insertCoin(10);
        gumballMachine50Any.insertCoin(1);
        gumballMachine50Any.insertCoin(1);
        gumballMachine50Any.insertCoin(1);
        gumballMachine50Any.insertCoin(1);
        gumballMachine50Any.insertCoin(1);
        gumballMachine50Any.turnCrank();
    }
}

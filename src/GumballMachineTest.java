import java.util.HashSet;
import java.util.Set;

public class GumballMachineTest {
    public static void main(String[] args) {

        int[] coinsTypeQuarter = new int[]{25};
        int[] coinsTypeAny = new int[]{1, 10, 25, 50};

        // Test Gumball Machine which only accept 25
        GumballMachine gumballmachine_25 =  new GumballMachine(3,coinsTypeQuarter,25);

        System.out.println(gumballmachine_25);
        System.out.println("************************************");
        //insert ￠25, valid
        gumballmachine_25.insertCoin(25);
        // gumball ejected
        gumballmachine_25.turnCrank();
        System.out.println(gumballmachine_25);
        System.out.println("************************************");
        //insert ￠25, valid
        gumballmachine_25.insertCoin(25);
        // gumball ejected
        gumballmachine_25.turnCrank();
        System.out.println(gumballmachine_25);
        System.out.println("************************************");
        //insert ￠50 invalid
        gumballmachine_25.insertCoin(50);
        // gumball rejected
        gumballmachine_25.turnCrank();
        System.out.println(gumballmachine_25);
        System.out.println("************************************");
        //insert ￠25, valid
        gumballmachine_25.insertCoin(25);
        // gumball ejected
        gumballmachine_25.turnCrank();
        System.out.println(gumballmachine_25);
        System.out.println("************************************");

        System.out.println("=====================================");

        GumballMachine gumballmachine_50 =  new GumballMachine(5,coinsTypeAny,50);
        System.out.println(gumballmachine_50);
        System.out.println("************************************");
        // insert ￠25 ,still need ￠25 more
        gumballmachine_50.insertCoin(25);
        gumballmachine_50.turnCrank();
        System.out.println(gumballmachine_50);
        System.out.println("************************************");
        // insert ￠25 valid ,gumball ejected
        gumballmachine_50.insertCoin(50);
        gumballmachine_50.turnCrank();
        System.out.println(gumballmachine_50);
        System.out.println("************************************");
        // insert ￠10, invalid
        gumballmachine_50.insertCoin(10);
        gumballmachine_50.turnCrank();
        System.out.println(gumballmachine_50);
        System.out.println("************************************");
        System.out.println("=====================================");


        GumballMachine gumballmachine_50_any =  new GumballMachine(5,coinsTypeAny,50);
        System.out.println(gumballmachine_50_any);
        // insert ￠10, valid
        System.out.println("************************************");
        gumballmachine_50_any.insertCoin(20);
        gumballmachine_50_any.turnCrank();
        System.out.println(gumballmachine_50_any);
        System.out.println("************************************");

    }
}

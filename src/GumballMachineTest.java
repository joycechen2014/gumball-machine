import java.util.HashSet;
import java.util.Set;

public class GumballMachineTest {
    public static void main(String[] args) {

        Set<Integer> coins_type_quarter = new HashSet<Integer>(){
            {
                add(25);
            }
        };
        Set<Integer> coins_type_any = new HashSet<Integer>(){
            {
                add(50);
                add(25);
                add(10);
                add(1);
            }
        };
        GumballMachine gumballmachine_25 =  new GumballMachine(5,coins_type_quarter,25);

        System.out.println(gumballmachine_25);
        gumballmachine_25.insertQuarter(25);
        gumballmachine_25.turnCrank();
        System.out.println(gumballmachine_25);

        System.out.println("=====================================");

        GumballMachine gumballmachine_50 =  new GumballMachine(5,coins_type_quarter,50);
        System.out.println(gumballmachine_50);
        gumballmachine_50.insertQuarter(25);
        gumballmachine_50.turnCrank();
        System.out.println(gumballmachine_50);
        System.out.println("=====================================");
        GumballMachine gumballmachine_50_any =  new GumballMachine(5,coins_type_any,50);
        System.out.println(gumballmachine_50_any);
        gumballmachine_50_any.insertQuarter(10);
        gumballmachine_50_any.turnCrank();
        System.out.println(gumballmachine_50_any);

    }
}

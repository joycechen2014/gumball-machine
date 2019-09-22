public class GumballMachineTest {
    public static void main(String [ ] args) {
        GumballMachine gumballmachine;
        gumballmachine = new GumballMachine(5);
        System.out.println(gumballmachine);
        gumballmachine.insertQuarter(25);
        gumballmachine.turnCrank();
        System.out.println(gumballmachine);

    }
}

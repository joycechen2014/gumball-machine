import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GumballMachine
{

    private int gumballNum = 0;
    private boolean dispenseBall = false;
    private Map<Integer,Integer> coinMap = new HashMap<Integer, Integer>();
    private int gumballPrice = 0;
    private int currentMoney = 0;

    public GumballMachine(int size , int[] coinTypes, int gumballPrice)
    {
        // initialise Gumball Machine variables
        this.gumballNum = size;
        // set coin HashMap base on coin type
        for(int coinType : coinTypes) {
            // put coin type and number into coin map
            this.coinMap.put(coinType, 0);
        }
        this.gumballPrice = gumballPrice;
    }

    public void insertCoin(int coinType)
    {
        System.out.println("You insert ￠" + coinType + ".");
         if(!this.coinMap.containsKey(coinType)) {
             System.out.println("This coin type ￠ " + coinType + " is not accepted by this machine.");
             // all coins are ejected
             this.initCoinMap();
             System.out.println("All coins are ejected.");

         }
         else {
             this.coinMap.put(coinType, this.coinMap.get(coinType) + 1);
         }

         if (this.getTotalValue(coinMap) < this.gumballPrice) {
             int coinNeeded = this.gumballPrice - this.getTotalValue(coinMap);
             System.out.println("Still need ￠" + coinNeeded + " to get a gumball.");
         }
    }

    public void turnCrank()
    {
        // check if there is still have gumballs in machine
        // also check coin total value to see if get gumball price
        if (this.gumballNum == 0) {
            System.out.println( "Sorry, we are out of gumball and your coins will be ejected!" ) ;
            this.initCoinMap();
            System.out.println("All coins are ejected.");
        } else if (this.getTotalValue(coinMap) != this.gumballPrice) {
            System.out.println( "The coin value not match the gumball x price, and your coins will be ejected!" ) ;
            this.initCoinMap();
        } else {
            this.gumballNum--;
            System.out.println("One gumball with price " + this.gumballPrice + " is ejected.");
            this.initCoinMap();
        }
    }

    private int getTotalValue(Map<Integer, Integer> hashMap) {
        int totalValue = 0;
        for (int key : hashMap.keySet()) {
            totalValue += hashMap.get(key) * key;
        }
        return totalValue;
    }

    private void initCoinMap() {
        for (int key : coinMap.keySet()) {
            this.coinMap.put(key, 0);
        }
    }


    @Override
    public String toString() {
        StringBuffer sb =  new StringBuffer();
        for(int key : this.coinMap.keySet()) {
            sb.append("￠" + key + " ");
        }
        return "Gumball Machine has " + gumballNum + " gumballs now!\n"  +
                "The cost of a Gumball is ￠" + this.gumballPrice +
                " and we accept " + sb.toString() ;
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private Map<Integer,Integer> coin_type;
    private int price;
    private int curr_money;

    public GumballMachine(int size , Set<Integer> coin_type, int price)
    {
        this.coin_type = new HashMap<Integer, Integer>();
        // initialise instance variables
        this.num_gumballs = size;
        for(Integer key : coin_type) {    // delete coins;
            this.coin_type.put(key,0);
        }
       // this.coin_type.addAll(coin_type);
        this.price = price;
        this.curr_money = 0;
    }

    public void insertQuarter(int coin)
    {
        System.out.println("You insert ￠" + coin + ".");
         if(this.coin_type.containsKey(coin)) {
             this.coin_type.put(coin,this.coin_type.get(coin) + 1);
             this.curr_money += coin;
         }
         else {
             System.out.println("We can not accept ￠" + coin);
             System.out.println("You have ejected 1" + " coin of " + coin);
             this.ejectQuarter();
             this.curr_money = 0;
         }
    }

    public void turnCrank()
    {
        if ( this.curr_money == this.price)
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.curr_money = 0 ;
                for(Integer key : coin_type.keySet()) {    // delete coins;
                    coin_type.put(key,0);  //delete coins;
                }
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "Sorry, we are out of gumball and your money will reject!" ) ;
                ejectQuarter();
            }
        }
        else
        {
            int money_still_need = price - curr_money;
            System.out.println("You still need ￠" + money_still_need);
        }
    }

    public void ejectQuarter() {
        for(Integer key : this.coin_type.keySet()) {
            if(this.coin_type.get(key) != 0)
            System.out.println("You have ejected " + this.coin_type.get(key) + " coin of ￠" + key);
            this.coin_type.put(key,0);  //delete coins;
        }
        this.curr_money = 0;

    }

    @Override
    public String toString() {

        String string2 = new String();
        for(int key : this.coin_type.keySet()) {
            string2 = string2 + " ￠" + key + " ";
        }
        return "Gumball Machine has " + num_gumballs + " gumballs now!\n"  +
                "The cost of a Gumball is ￠" + this.price +
                " and we accept " + string2 ;
    }
}
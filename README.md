# Gumball Machine

## About
This is the first version to implement Gumball Machine, supporting 3 types of machine.

1. ￠25 per gumball and receive ￠25 only;
2. ￠50 per gumball and receive ￠25 only;
3. ￠50 per gumball and receive any coins;

## Functions
Behavior | Description
--- | ---
insertCoin | Insert coin type
turnCrank | Get a gumball if reach gumball price
getTotalValue | Get current total value for insert coin(s).

## Example Usage
```
int[] coinsTypeAny = new int[]{1, 10, 25, 50};
GumballMachine gumballMachine =  new GumballMachine(5,coinsTypeAny,50);
gumballMachine.insertCoin(25);
gumballMachine.insertCoin(25);
gumballMachine.turnCrank();
```

## Testing
Use GumballMachineTest to do the test. 
GumballMachine1:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumbalMachine1.png)
GumballMachine2:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumballMachine2.png)
GumballMachine3:
![image](https://github.com/gopinathsjsu/assignment-1-gumball-joycechen2014/blob/master/GumballMachine3.png)

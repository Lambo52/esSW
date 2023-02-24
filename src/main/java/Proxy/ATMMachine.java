package Proxy;

public class ATMMachine implements GetATMData {
    ATMState atmState;
    int cashIn = 200;
    @Override
    public ATMState getATMState() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashIn;
    }
}

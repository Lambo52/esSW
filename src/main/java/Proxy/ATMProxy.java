package Proxy;

public class ATMProxy implements GetATMData {
    @Override
    public ATMState getATMState() {
        ATMMachine atmMachine = new ATMMachine();
        return atmMachine.getATMState();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine atmMachine = new ATMMachine();
        return atmMachine.getCashInMachine();
    }
}

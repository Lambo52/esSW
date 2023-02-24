package Proxy;

public class Main {

    public static void main(String[] args){

        //ATMMachine atmMachine = new ATMMachine();

        // NEW STUFF : Proxy Design Pattern Code
        // The interface limits access to just the methods you want
        // made accessible

        GetATMData realATMMachine = new ATMMachine();

        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());

        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());

        //atmProxy.setCashInMachine(); infattibile perché ho i metodi protetti

        // The user can't perform this action because ATMProxy doesn't
        // have access to that potentially harmful method
        // atmProxy.setCashInMachine(10000);

    }

}


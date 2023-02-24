package Observer;

import java.util.ArrayList;

public class stockGrabber implements Subject{


    ArrayList<Observer> observers;
    double ibmPrice;
    double aaplPrice;

    public stockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(observers.indexOf(o));
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(ibmPrice, aaplPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }
}

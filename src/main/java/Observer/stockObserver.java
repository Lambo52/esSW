package Observer;

public class stockObserver implements Observer{

    double ibmPrice, aaplPrice;
    static int observerIDTracker = 0;
    int observerID;
    Subject stockGrabber;
    public stockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("observer: " + this.observerID);
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\napple: " + aaplPrice + "\nibm: " + ibmPrice);
    }
}

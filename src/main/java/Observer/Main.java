package Observer;

public class Main {
    public static void main(String[] args) {
        stockGrabber stockgrabber = new stockGrabber();

        stockObserver observer1 = new stockObserver(stockgrabber);
        //stockObserver observer2 = new stockObserver(stockgrabber);

        stockgrabber.setIbmPrice(50);
        stockgrabber.setAaplPrice(200);
    }
}

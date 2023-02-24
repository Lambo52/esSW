package Bridge;

public class Philips implements TV{
    public void on(){
        System.out.println("TV philips in azione");
    }
    public void off(){
        System.out.println("TV philips spenta");
    }
    public void tuneChannel(int channel){
        System.out.println("canale cambiato in " + channel + " nella tv philips");
    }

}

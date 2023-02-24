package Bridge;

public class Sony implements TV{
    public void on(){
        System.out.println("accesa TV sony");
    }
    public void off(){
        System.out.println("spenta TV sony");
    }
    public void tuneChannel(int channel){
        System.out.println("canale cambiato in " + channel + " su sony");
    }
}

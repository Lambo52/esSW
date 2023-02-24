package Bridge;

public class Main { //questo è in other ma l'abbiamo fatto in teoria
    public static void main(String[] args) {
        RemoteControl telecomando = new ConcreteRemote(new Sony(),10);
        telecomando.on();
        telecomando.setChannel(50);
        telecomando.off();
    }
}

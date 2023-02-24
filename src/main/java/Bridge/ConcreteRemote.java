package Bridge;

public class ConcreteRemote extends RemoteControl{
    private int currentChannel;

    public ConcreteRemote(TV implementor, int currentChannel) {
        super(implementor);
        this.currentChannel = currentChannel;
    }

    public void nextChannel(){
        currentChannel++;
        setChannel(currentChannel);
    }
    public void prevChannel(){
        currentChannel--;
        setChannel(currentChannel);
    }
}

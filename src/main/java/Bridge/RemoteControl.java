package Bridge;

public abstract class RemoteControl{
    private TV implementor;

    public RemoteControl(TV implementor) {
        this.implementor = implementor;
    }

    public void on(){
        implementor.on();
    }
    public void off(){
        implementor.off();
    }
    public void setChannel(int channel){
        implementor.tuneChannel(channel);
    }
}


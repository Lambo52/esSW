package Strategy;

public class Bird extends Animal{
    public Bird() {
        setName("Bird");
        flyType = new itFlys();
    }

}

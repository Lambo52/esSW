package Strategy;

public class Animal {
    String name;

    Flys flyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tryToFly() {
        return flyType.fly();
    }

    public void setFlyType(Flys flyType) {
        this.flyType = flyType;
    }

}

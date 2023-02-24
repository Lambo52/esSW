package Strategy;

public class notFlys implements Flys{
    @Override
    public String fly() {
        return "Can't fly";
    }
}

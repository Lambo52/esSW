package Decorator;

public class basicPizza implements Pizza{
    @Override
    public String returnPizza() {
        return "Base";
    }

    @Override
    public double getCost() {
        return 2;
    }
}

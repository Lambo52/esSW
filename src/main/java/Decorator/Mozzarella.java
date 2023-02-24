package Decorator;

public class Mozzarella extends pizzaDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String returnPizza() {
        return pizza.returnPizza() + ", mozzarella";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 0.5;
    }
}

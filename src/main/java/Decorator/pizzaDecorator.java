package Decorator;

public abstract class pizzaDecorator implements Pizza{
    Pizza pizza;

    public pizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String returnPizza();

    @Override
    public abstract double getCost();
}

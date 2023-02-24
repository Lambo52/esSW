package Decorator;

public class prosciuttoCrudo extends pizzaDecorator{
    public prosciuttoCrudo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String returnPizza() {
        return pizza.returnPizza() + ", prosciutto crudo";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2;
    }
}

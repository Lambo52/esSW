package Decorator;

public class salamePiccante extends pizzaDecorator{
    public salamePiccante(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String returnPizza() {
        return pizza.returnPizza() + ", salame piccante";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1;
    }
}

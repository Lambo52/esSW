package Decorator;

public class mainDecorator {
    public static void main(String[] args) {

        Pizza pizza = new basicPizza();
        System.out.println(pizza.returnPizza() + " " + pizza.getCost());

        Pizza pizzaSalamepiccante = new salamePiccante(new Mozzarella(new basicPizza()));
        System.out.println(pizzaSalamepiccante.returnPizza() + " " + pizzaSalamepiccante.getCost());

        Pizza pizzaSalamepiccanteMozzarella = new salamePiccante(new salamePiccante(new Mozzarella(new basicPizza())));
        System.out.println(pizzaSalamepiccanteMozzarella.returnPizza() + " " + pizzaSalamepiccanteMozzarella.getCost());

        Pizza prosciuttoCrudo = new prosciuttoCrudo(new Mozzarella(new basicPizza()));
        System.out.println(prosciuttoCrudo.returnPizza() + " " + prosciuttoCrudo.getCost());

    }
}

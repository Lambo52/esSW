package Template;

public class veggieHoagie extends Hoagie{
    @Override
    boolean custometWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.println("mettendo verdure inutili per gente inutile");
    }
}

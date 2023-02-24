package Template;

public class italianHoagie extends Hoagie{
    @Override
    void addMeat() {
        System.out.println("mettendo carne italiana");
    }

    @Override
    void addCheese() {
        System.out.println("mettendo formaggio italiano");
    }

    @Override
    void addVegetables() {
        System.out.println("mettendo verdure italiane");
    }
}

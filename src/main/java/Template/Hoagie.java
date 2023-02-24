package Template;

public abstract class Hoagie {
    final void makeSandwich(){
        cutBum();
        if(custometWantsMeat()) {
            addMeat();
        }
        if(customerWantsCheese()) {
            addCheese();
        }
        if(customerWantsVegetables()) {
            addVegetables();
        }
        wrapHoagie();
    }

    public void cutBum() {
        System.out.println("cutting bum");
    }
    public void wrapHoagie() {
        System.out.println("wrap hoagie");
    }
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    boolean custometWantsMeat() {
        return true;
    }
    boolean customerWantsCheese() {
        return true;
    }
    boolean customerWantsVegetables() {
        return true;
    }
}

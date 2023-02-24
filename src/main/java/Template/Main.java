package Template;

public class Main {
    public static void main(String[] args) {
        Hoagie paninoitaliano = new italianHoagie();
        paninoitaliano.makeSandwich();

        Hoagie paninoinutile = new veggieHoagie();
        paninoinutile.makeSandwich();
    }
}

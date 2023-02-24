package Strategy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println(dog.tryToFly());
        System.out.println(bird.tryToFly());
        dog.setFlyType(new itFlys());
        System.out.println(dog.tryToFly());
    }
}

package Adapter;

public class enemyRobot {
    public void smashWithHands() {
        System.out.println("robot: attaccando con le mani");

    }

    public void walk() {
        System.out.println("il robot nemico sta camminando!");
    }
    public void autoDrive(String name) {
        System.out.println("enemy robot sta andando senza l'aiuto di " + name);
    }
}

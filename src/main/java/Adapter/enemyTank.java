package Adapter;

public class enemyTank implements enemyAttacker{
    @Override
    public void fireWeapon() {
        System.out.println("10 danno");
    }

    @Override
    public void driveForward() {
        System.out.println("andando avanti");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("assegno guidatore: " + name);
    }
}

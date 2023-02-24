package Factory;

public abstract class enemyShip {

    String name;
    double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void enemyShipShoot() {
        System.out.println(getName() + " is shooting with " + getDamage() + " damage!");
    }


}

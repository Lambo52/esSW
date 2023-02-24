package Factory;

public class Main { //pure qua male male
    public static void main(String[] args) {
        enemyShip enemy = null;

        enemyShipFactory enemyshipfactory = new enemyShipFactory();

        enemy = enemyshipfactory.makeEnemyShip("Rocket");
        if(enemy != null) {

            doStuff(enemy);

        }
    }
    public static void doStuff(enemyShip enemyship) {
        enemyship.enemyShipShoot();
    }
}

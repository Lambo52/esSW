package Factory;

public class enemyShipFactory {
    public enemyShip makeEnemyShip(String type) {
        enemyShip enemyship = null;

        if(type.startsWith("U")) {
            enemyship = new UFOenemyShip();
        }
        else if(type.startsWith("R")) {
            enemyship = new rocketEnemyShip();
        }
        return enemyship;
    }

}

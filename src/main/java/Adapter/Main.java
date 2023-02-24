package Adapter;

public class Main {
    public static void main(String[] args) {
        //enemyattacker è un nemico, tutti i nemici dovrebbero implementare i suoi metodi, ma io ho enemyRobot che
        // non fa le stesse cose che fa l'enemyAttacker

        enemyAttacker enemyrobot = new enemyRobotAdapter(new enemyRobot());
        enemyAttacker enemytank = new enemyTank();
        enemyrobot.fireWeapon();
        enemytank.fireWeapon();
    }
}

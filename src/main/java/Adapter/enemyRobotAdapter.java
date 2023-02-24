package Adapter;

public class enemyRobotAdapter implements enemyAttacker{
    enemyRobot enemyrobot;

    public enemyRobotAdapter(enemyRobot enemyrobot) {
        this.enemyrobot = enemyrobot;
    }

    @Override
    public void fireWeapon() {
        enemyrobot.smashWithHands();

    }

    @Override
    public void driveForward() {
        enemyrobot.walk();
    }

    @Override
    public void assignDriver(String name) {
        enemyrobot.autoDrive(name);
    }
}

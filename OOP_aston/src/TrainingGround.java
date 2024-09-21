public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy();
        enemy.setHealth(25);


        Warrior warrior = new Warrior("warrior",25);
        Mage mage = new Mage("mage");
        Archer archer = new Archer("archer");

        if (enemy.isAlive()) {
            archer.attackEnemy(enemy);
        }
        if (enemy.isAlive()) {
            mage.attackEnemy(enemy);
        }
        if (enemy.isAlive()) {
            warrior.attackEnemy(enemy);
        }
    }
}

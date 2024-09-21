public class BattleGround {
    public static void main(String[] args) {

        Zombie zombie = new Zombie();
        zombie.setHealth(25);

        Warrior warrior = new Warrior("warrior",25);


        while (warrior.isAlive() && zombie.isAlive()) {
            warrior.attackEnemy(zombie);

            zombie.checkRefresh();
            if (!zombie.isAlive()) {
                System.out.println("Герой победил!");
                continue;
            }
            zombie.attackHero(warrior);
        }
        if (zombie.isAlive()) {
            System.out.println("Враг победил!");
        }




    }
}

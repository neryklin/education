public class Warrior extends Hero{

    private final int powerDamage = 2;
    public Warrior(String name, int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage= (int) (Math.random()*10*powerDamage);
        enemy.takeDamage(damage);
        System.out.println("Warrior атакует врага, враг получил "+damage+" урона, осталось жизни " + enemy.getHealth());



    }
}

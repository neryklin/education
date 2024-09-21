public class Mage extends Hero{

    private final int powerDamage = 4;
    public Mage(String name) {
        super(name,100);
    }

    @Override
    public void attackEnemy(Enemy enemy)  {
        int damage= (int) (Math.random()*10*powerDamage);
        enemy.takeDamage(damage);
        System.out.println("Mage атакует врага, враг получил "+damage+" урона, осталось жизни " + enemy.getHealth());

    }

}

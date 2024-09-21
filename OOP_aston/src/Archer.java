public class Archer extends Hero{

    private final int powerDamage = 3;
    public Archer(String name) {
        super(name,100);
    }

    @Override
    public void attackEnemy(Enemy enemy)  {
        int damage= (int) (Math.random()*10*powerDamage);
        enemy.takeDamage(damage);
        System.out.println("Archer атакует врага, враг получил "+damage+" урона, осталось жизни " + enemy.getHealth());
         }
    //тест
    //ываываыаываываыва
}

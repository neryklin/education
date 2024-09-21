public class Skeleton extends Enemy{

    private int critPercent=5;
    private int powerDamage=2;


    @Override
    public void takeDamage(int damage) {
        super.setHealth(Math.max(super.getHealth()-damage,0));
    }

    public void checkRefresh() {

            int crit = (int) (Math.random() * critPercent);
            if (crit <= critPercent) {
            System.out.println("Skeleton сработала способность крит удара +" + crit+"%");
            }

    }

    @Override
    public void attackHero(Hero hero) {

        int damage= (int) (Math.random()*10*powerDamage);
        hero.takeDamage(damage);
        System.out.println("Zombie атакует героя, герой получил "+damage+" урона, осталось жизни "+hero.getHealth());
    }
}



public class Zombie extends Enemy{

    private int refreshPercent=5;
    private int powerDamage=2;

    @Override
    public void takeDamage(int damage) {
        super.setHealth(Math.max(super.getHealth()-damage,0));
    }

    public void checkRefresh() {
        if (super.getHealth()==0) {
            int refresh = (int) (Math.random() * 10);
            if (refresh >= refreshPercent) {
                super.setHealth((int) (Math.random() * 100));
                System.out.println("zombie сработала способность воскрешение, текущее здоровье " + super.getHealth());
            }
        }
    }

    @Override
    public void attackHero(Hero hero) {

        int damage= (int) (Math.random()*10*powerDamage);
        hero.takeDamage(damage);
        System.out.println("Zombie атакует героя, герой получил "+damage+" урона, осталось жизни "+hero.getHealth());
    }
}

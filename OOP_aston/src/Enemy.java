public class Enemy implements Mortal{

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health=this.health-damage;
        health= Math.max(health, 0);
    }

    public void attackHero(Hero hero) {


    }
    @Override
    public boolean isAlive() {
        if (health<=0) {
            return false;
        }
        return true;
    }
}

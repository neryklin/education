public abstract  class Hero implements Mortal{
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health=this.health-damage;
        health= Math.max(health, 0);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

@Override
    public boolean isAlive() {
        if (this.health<=0) {
            return false;
        }
        return true;
    }
    abstract public void attackEnemy(Enemy enemy);

}

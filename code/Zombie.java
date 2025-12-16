package code;

public class Zombie {
    private int health;
    private int damage;

    public Zombie(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
}

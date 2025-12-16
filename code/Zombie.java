package code;

public class Zombie {
    // initialize instance variables
    private int health;
    private int damage;

    /**
     * Constructor for Zombie class
     * @param health health of the zombie
     * @param damage damage of the zombie
     */
    public Zombie(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    /**
     * Sets the health of the zombie
     * @param health health to be set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets the damage of the zombie
     * @param damage damage to be set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Gets the damage of the zombie
     * @return damage of the zombie
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Gets the health of the zombie
     * @return health of the zombie
     */
    public int getHealth() {
        return health;
    }
}

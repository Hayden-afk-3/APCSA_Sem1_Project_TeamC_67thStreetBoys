package code;
public class Weapon {
    private String[] adjectives = {"better", "careful", "clever", "easy", "famous", "gifted", "helpful", "important", "inexpensive", "mushy", "odd", "powerful", "rich", "shy", "tender", "uninterested", "vast", "wrong", "broad", "chubby", "crooked", "curved", "deep", "flat", "high", "hollow", "low", "narrow", "round", "shallow", "skinny", "square", "steep", "straight", "wide", "big", "colossal", "fat", "gigantic", "great", "huge", "immense", "large", "mammoth", "massive", "petite", "puny", "scrawny", "tall", "teeny", "tiny"};
    private String[] weapons = {"sword", "dagger", "knive", "axe", "mace", "war hammer", "flail", "quarterstaff", "spear", "pike", "halberd", "glaive", "bill", "lance", "longbow", "short bow", "crossbow", "sling", "javelin", "hand cannon", "trebuchet", "catapult", "ballista", "battering ram"};
    private String[] verbs = {"watering", "cataloging", "hunting", "wanting", "holding", "taping", "integrating", "worrying", "loving", "spending", "fitting", "bating", "risking", "normalizing", "restructuring", "costing", "programming", "touching", "towing", "altering", "marketing", "yelling", "crushing", "beholding", "agreeing", "fencing", "sparkling", "wiping", "sparking", "slaying", "copying", "melting"};
    private String name;
    private int damage;

    public Weapon(int theDamage) {
        name = adjectives[(int)(Math.random()* adjectives.length)] + " " + weapons[(int)(Math.random() * weapons.length)] + " of " + verbs[(int)(Math.random() * verbs.length)];
        System.out.println("You have found a " + name + "!");
        damage = theDamage;
    }
    public void printInfo(){
        System.out.println("Player Information:");
        System.out.println("Weapon Name: " + this.getName());
        System.out.println("Damage: " + this.getDamage());
    }
    public String getName() {
        return name;
    }
    public int getDamage(){
        return damage;
    }
}
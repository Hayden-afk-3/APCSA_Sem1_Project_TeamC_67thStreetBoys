package code;
class Person {
    private String name;
    private int energy;
    private int health;
    /*
    * Constructor for objects of class Person
    * @param theName The name of the person
    */
    public Person(String theName) {
        name = theName;
        energy = 100;
        health = 100;
        System.out.println("Welcome " + name + " to the zombie apocalypse!");
    }
    public void toString(Person player) {
        System.out.println("Player Information:");
        System.out.println("Name: " + player.getName());
        System.out.println("Energy: " + player.getEnergy());
        System.out.println("Health: " + player.getHealth());
    }
    public String getName() {
        return name;
    }
    public int getEnergy(){
        return energy;
    }
    public int getHealth(){
        return health;
    }

}
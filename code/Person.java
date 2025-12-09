package code;
class Person {
    private String name;
    private int energy;
    private int health;
    private int happiness;
    /*
    * Constructor for objects of class Person
    * @param theName The name of the person
    */
    public Person(String theName) {
        name = theName;
        energy = 100;
        health = 100;
        happiness = 100;
        System.out.println("Welcome " + name + " to the zombie apocalypse!");
    }
}
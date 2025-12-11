package code;
class Scavenger extends Person{
    public Scavenger(String theName) {
        super(theName);
    }
    public void bassProShop(){
        if(this.getEnergy() < 15){
            System.out.println("Not enough energy to go to Bass Pro Shop!");
            return;
        }
        this.setEnergy(this.getEnergy()-15);
        // Scavenger-specific bassProShop method
        // Going to Bass Pro Shop restores more health but costs energy
        int options = (int)(Math.random()*3);
        switch (options) {
            case 0:
                this.setHealth(this.getHealth() + 20);
                System.out.println("You went to Bass Pro Shop and found food! Energy -15, Health +20.");
                break;
            case 1:
                System.out.println(
                    "You went to Bass Pro shop and found a new weapon!");
                break;
            case 2:
                this.setHealth(this.getHealth() + 25);
                System.out.println("You went to Bass Pro Shop! Energy -15, Health +25.");
                break;
            }
        }
}
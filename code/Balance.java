package code;

public class Balance {
    // sleep stats
    public static int sleepEnergy(int currentEnergy){
        return (int)(Math.random()*((currentEnergy+10)-currentEnergy+1)+currentEnergy);
    }
    public static int sleepHealth(int currentHealth){
        return (int)(Math.random()*(10+currentHealth-currentHealth+1)+currentHealth);
    }
    public static int sleepSatiation(int currentSatiation){
        return (int)(Math.random()*(1*(currentSatiation-5)-currentSatiation+1)+currentSatiation);
    }

    // nap stats
    public static int napEnergy(int currentEnergy){
        return (int)(Math.random()*((currentEnergy+20)-currentEnergy+1)+currentEnergy);
    }
    public static int napHealth(int currentHealth){
        return (int)(Math.random()*(10+currentHealth-currentHealth+1)+currentHealth);
    }

    // zombie stats
    public static double zombieFightChance(int currentDay){
        return Math.atan(currentDay/5)*2/Math.PI;
    }
    public static int zombieHealth(int currentDay){
        return (int)((7*Math.log(currentDay)+2)*((0.5*Math.random()+0.75)));
    }
    public static int zombieDamage(int currentDay){
        return (int)((4*Math.log(currentDay)+3)*(0.5*Math.random()+0.75));
    }
    public static int zombieAttack(int zombieDamage){
        return (int)(zombieDamage*(0.5*Math.random()+0.75));
    }

    // walmart stats
    public static int walmartFoodSatiation(){
        return (int)(Math.random()*(20-5+1)+5);
    }
    public static int walmartWeaponDamage(int currentDay){
        return (int)((Math.random()+0.5)*(5*Math.log(currentDay)+5));
    }
    public static int walmartDrugHealth(){
        return (int)(Math.pow(Math.random(),2)*(50-5+1)+5);
    }
    public static int walmartEnergyLoss(){
        return (int)(Math.random()*(10-1+1)+1);
    }

    // scavenger stats
    public static int bassProShopsFoodSatiation(){
        return (int)(Math.pow(Math.random(),0.5)*(30-5+1)+5);
    }
    public static int bassProShopsWeaponDamage(int currentDay){
        return (int)((Math.pow(Math.random(),0.5)+0.5)*(5*Math.log(currentDay)+7));
    }
    public static int bassProShopsEnergyLoss(){
        return (int)(Math.random()*(15-1+1)+1);
    }

    // medic stats
    public static int medicHeal(){
        return (int)(Math.random()*(20-5+1)+5);
    }

    // warrior stats
    public static int huntSeedDamageAddition(){
        return (int)(Math.random()*(5-0+1)+0);
    }
    public static double huntFoodPoisoningChance = 0.1;
    public static double huntSalmonellaChance = 0.05;
    public static double huntVeganChance = 0.01;
}

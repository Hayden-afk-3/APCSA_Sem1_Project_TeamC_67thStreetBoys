package code;

import java.util.Scanner;

public class Main {
    // initializes scanner for all methods to use in class
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // sets up null player so there's no errors relating to possibly not setting player type
        Person player = null;
        int roleChoice = 0;
        clear();

        System.out.println("1. New Game\n2. Load Game");
        int gameChoice = input.nextInt();
        // consume /n
        input.nextLine();
        clear();
        switch (gameChoice) {
            case 2:
                // all encoded in base 9
                // day9role9health9satiation9energy9weaponAdjective9weaponWeapon9weaponVerb9weaponDamage9vegan9name9
                // example: 29298195091209529591495909Cooper
                String saveDay = "";
                String saveRole = "";
                String saveHealth = "";
                String saveSatiation = "";
                String saveEnergy = "";
                String saveWeaponAdjective = "";
                String saveWeaponWeapon = "";
                String saveWeaponVerb = "";
                String saveWeaponDamage = "";
                String saveVegan = "";
                String saveName = "";
                int currentIndex = 0;

                System.out.print("Enter your saved game string: ");
                String savedGameString = input.nextLine();

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveDay += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveRole += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveHealth += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveSatiation += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveEnergy += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveWeaponAdjective += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveWeaponWeapon += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveWeaponVerb += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveWeaponDamage += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (savedGameString.charAt(currentIndex) != '9'){
                    saveVegan += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }
                currentIndex++;

                while (currentIndex < savedGameString.length()){
                    saveName += savedGameString.charAt(currentIndex);
                    currentIndex++;
                }

                switch (saveRole) {
                    case "1":
                        player = new Scavenger(Binary.decode(saveDay,9), Binary.decode(saveHealth,9), Binary.decode(saveSatiation,9), Binary.decode(saveEnergy,9), Binary.decode(saveVegan,9), saveName);
                        break;
                    case "2":
                        player = new Medic(Binary.decode(saveDay,9), Binary.decode(saveHealth,9), Binary.decode(saveSatiation,9), Binary.decode(saveEnergy,9), Binary.decode(saveVegan,9), saveName);
                        break;
                    case "3":
                        player = new Warrior(Binary.decode(saveDay,9), Binary.decode(saveHealth,9), Binary.decode(saveSatiation,9), Binary.decode(saveEnergy,9), Binary.decode(saveVegan,9), saveName);
                        break;
                }
                player.setWeapon(new Weapon(Binary.decode(saveWeaponAdjective,9), Binary.decode(saveWeaponWeapon,9), Binary.decode(saveWeaponVerb,9), Binary.decode(saveWeaponDamage,9)));
                clear();
            break;
            case 1:
                // grab name from user
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                clear();

                // grabs role from user and verifies input
                System.out.println("What character do you want to be?");
                System.out.println("1. Scavenger\n2. Medic\n3. Warrior");
                roleChoice = input.nextInt();
                // consume /n
                input.nextLine();
                while (roleChoice != 1 && roleChoice != 2 && roleChoice != 3) {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    roleChoice = input.nextInt();
                    // consume /n
                    input.nextLine();
                }
                        // switch case that uses each role's constructor to set player type
                switch (roleChoice) {
                    case 1:
                        player = new Scavenger(name);
                        break;
                    case 2:
                        player = new Medic(name);
                        break;
                    case 3:
                        player = new Warrior(name);
                        break;
                }
                clear();

                // switch case that uses each roleChoice's constructor to set player type
                switch (roleChoice) {
                    case 1:
                        player = new Scavenger(name);
                        break;
                    case 2:
                        player = new Medic(name);
                        break;
                    case 3:
                        player = new Warrior(name);
                        break;
                }
                clear();

                // player gets assigned weapon
                System.out.println(player.getName() + " has found a weapon!");
                player.setWeapon(new Weapon(5));
                player.getWeapon().weaponInfo();
                continueGame();
                break;
        }
        // main game loop
        while (true){
            // if player is dead, break loop
            if (player.checkDeath()){
                break;
            }


            // daily activities
            System.out.println("Day " + player.getDay());
            player.personStatus();
            player.printActivityList();
            System.out.print("Activity: ");
            String choice = input.nextLine();

            // activity choice is parsed into it's respective method
            if (choice.equals("Q")||choice.equals("q")){
                String gameString = encodeGame(player);
                System.out.println("Game saved! Encoded string:");
                System.out.println(gameString);
                break;
            }
            player.parseActivity(choice);
            continueGame();
            if (Math.random() <= Balance.zombieFightChance(player.getDay())){
                player.zombieFight();

                // if player died from zombie fight, break loop
                if (player.checkDeath()){
                    break;
                }
                continueGame();
            }
            
            // player sleep method increases stats and day increments
            player.sleep();
            continueGame();

        }
        input.close();
    }


    /**
    * clears the console
    */
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * pauses game until user presses enter
     */
    public static void continueGame(){
        System.out.print("Press Enter to continue...");
        // String consumeResponse = input.nextLine();
        input.nextLine();
        clear();
    }

    /**
     * encodes the game state into a string for saving
     * @param player the player object
     * @return encoded game string
     */
    public static String encodeGame(Person player){
        String returnString = "";
        // all encoded into base 9
        // day9role9health9satiation9energy9weaponNameEncode9weaponDamage9vegan9name
        // 393925094691209429692093909Hayden
        returnString += Binary.encode(player.getDay(),9) + "9";
        returnString += Binary.encode(player.getRole(),9) + "9";
        returnString += Binary.encode(player.getHealth(),9) + "9";
        returnString += Binary.encode(player.getSatiation(),9) + "9";
        returnString += Binary.encode(player.getEnergy(),9) + "9";
        returnString += player.getWeapon().encodeWeaponName() + "9";
        returnString += Binary.encode(player.getWeapon().getDamage(),9) + "9";
        if (player.getVegan()){
            returnString += "19";
        }
        else {
            returnString += "09";
        }
        returnString += player.getName();
        return returnString;
    }
}
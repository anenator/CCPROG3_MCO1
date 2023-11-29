import java.util.Random;
import java.util.Scanner;

/**
 * The BattlePhase class represents the phase where the player battles against an enemy creature.
 */
public class BattlePhase {
    /**
     * The active creature of the player.
     */
    private Creature activeCreature;
    
    /**
     * The enemy creature.
     */
    private Creature enemyCreature;
    
    /**
     * The inventory of the player.
     */
    private Inventory userInventory;
    
    /**
     * The number of actions the player can perform in the battle phase.
     */
    private int numActions;
    
    /**
     * A boolean value indicating whether the enemy creature has been caught by the player.
     */
    private boolean caughtCreature;

    /**
     * Constructs a BattlePhase object with the given active creature, enemy creature, and user inventory.
     * @param activeCreature the active creature of the player
     * @param enemyCreature the enemy creature
     * @param userInventory the inventory of the player
     */
    public BattlePhase(Creature activeCreature, Creature enemyCreature, Inventory userInventory) {
        this.activeCreature = activeCreature;
        this.enemyCreature = enemyCreature;
        this.userInventory = userInventory;
        this.numActions = 3;
        this.caughtCreature = false;
    }

    /**
     * Initiates the battle phase and allows the player to perform actions such as attacking, swapping creatures, catching creatures, and running away.
     */
    public void initiateBattle() {
        
        Scanner scanner = new Scanner(System.in);
        while (numActions > 0 && enemyCreature.getCurrentHealth() > 0) {
            System.out.println();
            System.out.println("Your Active Creature: " + activeCreature.getCreatureName());
            System.out.println("Type: " + activeCreature.getCreatureType());
            System.out.println("EL: " + activeCreature.getCreatureEvolutionLevel());
            System.out.println();
            System.out.println("Enemy Creature: " + enemyCreature.getCreatureName());
            System.out.println("Type: " + enemyCreature.getCreatureType());
            System.out.println("EL: " + enemyCreature.getCreatureEvolutionLevel());
            System.out.println("Enemy's health: " + enemyCreature.getCurrentHealth());
            System.out.println();
            System.out.println("Battle Options:");
            System.out.println("1: ATTACK");
            if (userInventory.getCapturedCreatureList().size() > 1) {
                System.out.println("2: SWAP");
            }
            System.out.println("3: CATCH");
            System.out.println("4: RUN");

            int userInput = scanner.nextInt(); 

            switch (userInput) {
                case 1:
                    performAttack();
                    break;
                case 2:
                    swapActiveCreature();
                    break;
                case 3:
                    attemptCatch();
                    break;
                case 4:
                    numActions = 0;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

            numActions--;
        }

        if (enemyCreature.getCurrentHealth() <= 0) {
            userInventory.addCreature(enemyCreature);
        }
        endBattlePhase();
    }

    /**
     * Performs an attack on the enemy creature and reduces its health.
     *
     */
    public  void performAttack() {
        Random rand = new Random();
        int damage = rand.nextInt(10) * activeCreature.getCreatureEvolutionLevel();
        if (isStrongAgainst(activeCreature.getCreatureType(), enemyCreature.getCreatureType())) {
            damage *= 1.5;
        }
        enemyCreature.reduceHealth(damage);
        System.out.println("Damage dealt: " + damage);
        System.out.println("Enemy's health: " + enemyCreature.getCurrentHealth());
    }

    /**
     * Checks if the first creature type is strong against the second creature type.
     * @param type1 the type of the first creature
     * @param type2 the type of the second creature
     * @return true if the first creature type is strong against the second creature type, false otherwise
     *
     */
    private boolean isStrongAgainst(String type1, String type2) {
        return (type1.equals("FIRE") && type2.equals("GRASS"))
                || (type1.equals("GRASS") && type2.equals("WATER"))
                || (type1.equals("WATER") && type2.equals("FIRE"));
    }

    /**
     * Swaps the active creature of the player with another creature in the inventory.
     */
    public  void swapActiveCreature() {
  
        Scanner scanner = new Scanner(System.in);

        userInventory.showActiveCreature();
        for(int i = 0; i < userInventory.getCapturedCreatureList().size(); i++) {
            System.out.println(i + 1 + ": " + userInventory.getCapturedCreatureList().get(i).getCreatureName());
        }
        int optionCreature = scanner.nextInt();
        userInventory.changeActiveCreature(userInventory.getCapturedCreatureList().get(optionCreature - 1));
        activeCreature = userInventory.getActiveCreature();

    }
    

    /**
     * This method attempts to catch the enemy creature and adds it to the player's inventory if successful.
     * @return true if the catch is successful, false otherwise
     */
    public void attemptCatch() {
        Random rand = new Random();
        int catchRate = 40 + 50 - enemyCreature.getCurrentHealth();
        if (rand.nextInt(100) < catchRate) {
            userInventory.addCreature(enemyCreature);
            System.out.println("Creature caught successfully!");
            caughtCreature = true;
        } else {
            System.out.println("Failed to catch the creature.");
            caughtCreature = false;
        }
    }

    /**
     * This method ends the battle phase and displays the result of the battle.
     */
    public  void endBattlePhase() {
        System.out.println("The battle has ended.");
        if (enemyCreature.getCurrentHealth() <= 0) {
            System.out.println("You defeated the enemy creature!");
        } else if (caughtCreature == true) {
            System.out.println();
        } else if (numActions == 0 && caughtCreature == false){
            System.out.println("You ran out of actions.");
            System.out.println("The enemy creature ran away.");
        } else {
            System.out.println("You ran away from the battle.");
        }
        System.out.println();
        System.out.println("Returning to the area.");
        numActions = 3;
    }
}

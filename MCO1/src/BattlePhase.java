import java.util.Random;
import java.util.Scanner;

public class BattlePhase {
    private Creature activeCreature;
    private Creature enemyCreature;
    private Inventory userInventory;
    private int numActions;

    public BattlePhase(Creature activeCreature, Creature enemyCreature, Inventory userInventory) {
        this.activeCreature = activeCreature;
        this.enemyCreature = enemyCreature;
        this.userInventory = userInventory;
        this.numActions = 3;
    }

    public void initiateBattle() {
        Scanner scanner = new Scanner(System.in);

        while (numActions > 0 && enemyCreature.getCurrentHealth() > 0) {
            System.out.println("Battle Options:");
            System.out.println("1: ATTACK");
            if (userInventory.getCapturedCreatureList().size() > 1) {
                System.out.println("2: SWAP");
            }
            System.out.println("3: CATCH");
            System.out.println("4: RUN");

            int userInput = scanner.nextInt(); // Get user input here

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
                    endBattlePhase();
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

    private void performAttack() {
        Random rand = new Random();
        int damage = rand.nextInt(10) * activeCreature.getCreatureEvolutionLevel();
        if (isStrongAgainst(activeCreature.getCreatureType(), enemyCreature.getCreatureType())) {
            damage *= 1.5;
        }
        enemyCreature.reduceHealth(damage);
        System.out.println("Damage dealt: " + damage);
        System.out.println("Enemy's current health: " + enemyCreature.getCurrentHealth());
    }

    private boolean isStrongAgainst(String type1, String type2) {
        return (type1.equals("FIRE") && type2.equals("GRASS"))
                || (type1.equals("GRASS") && type2.equals("WATER"))
                || (type1.equals("WATER") && type2.equals("FIRE"));
    }

    private void swapActiveCreature() {
        // Logic for swapping the active creature
        Inventory userInventory = new Inventory();
        userInventory.showChangeActiveCreature();
        Scanner scanner = new Scanner(System.in);
        String newActiveCreatureName = scanner.nextLine();
        Creature newActiveCreature = userInventory.selectCreature(newActiveCreatureName);
        if (newActiveCreature != null) {
            userInventory.swapActiveCreature(newActiveCreature);
        } else {
            System.out.println("No active creatures available. You must return to the area.");
        }
    }

    private void attemptCatch() {
        Random rand = new Random();
        int catchRate = 40 + 50 - enemyCreature.getCurrentHealth();
        if (rand.nextInt(100) < catchRate) {
            userInventory.addCreature(enemyCreature);
            System.out.println("Creature caught successfully!");
        } else {
            System.out.println("Failed to catch the creature.");
        }
    }

    private void endBattlePhase() {
        System.out.println("The battle has ended.");
        if (enemyCreature.getCurrentHealth() <= 0) {
            System.out.println("You defeated the enemy creature!");
        } else {
            System.out.println("You were unable to defeat the enemy creature.");
        }

        // Check if the active creature has fainted (health <= 0)
        if (activeCreature.getCurrentHealth() <= 0) {
            System.out.println("Your active creature has fainted!");

            // Logic to select a new active creature if available
            
            userInventory.showChangeActiveCreature();
            Scanner scanner = new Scanner(System.in);
            userInventory.showCapturedList();
            String newActiveCreatureName = scanner.nextLine();
            Creature newActiveCreature = userInventory.selectCreature(newActiveCreatureName);

            if (newActiveCreature != null) {
                // Set the new active creature
                userInventory.swapActiveCreature(newActiveCreature);
            } else {
                System.out.println("No active creatures available. You must return to the area.");
            }
        }

        // Return to the area screen or perform other actions here

        // Reset the number of actions for the next battle
        numActions = 3;
    }
}

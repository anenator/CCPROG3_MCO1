
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Area {
    private int[][] twoDArray;
    private int rows;
    private int columns;
    private int userPositionX;
    private int userPositionY;

    public Area(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.twoDArray = new int[rows][columns];
        this.userPositionX = 0;
        this.userPositionY = 0;
    }

    public void showArea() {
        // Show the tiles in the area map
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                if (i == userPositionX && j == userPositionY) {
                    System.out.print(" X |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
    }

    // public void initializeArea() {
    //     // Initialize the area map with empty tiles or terrain
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < columns; j++) {
    //             setTerrainAtCoordinate(i, j, "Empty"); // Assuming the terrain is initialized as empty
    //         }
    //     }
    // }

    public void moveUser(int direction, Inventory userInventory) {
        // Adjust the user's position according to the provided direction
        switch (direction) {
            case 1:
                if (userPositionX > 0) {
                    userPositionX--;
                }
                break;
            case 2:
                if (userPositionX < rows - 1) {
                    userPositionX++;
                }
                break;
            case 3:
                if (userPositionY > 0) {
                    userPositionY--;
                }
                break;
            case 4:
                if (userPositionY < columns - 1) {
                    userPositionY++;
                }
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }
        checkEncounter(userInventory);
    }

    public void checkEncounter(Inventory userInventory) {
        // Check if the user encounters a creature and initiate the battle phase
        Random rand = new Random();
        if (rand.nextInt(10) < 4) {
            // Encountered a creature, initiate the battle phase
            Creature enemyCreature = getEnemyCreature(); // Logic to generate an enemy creature goes here
            System.out.println(enemyCreature.getCreatureName() + " has appeared!");
            BattlePhase battlePhase = new BattlePhase(userInventory.getActiveCreature(), enemyCreature, userInventory);
            battlePhase.initiateBattle();
        }
    }



    // public String getTerrainAtCoordinate(int x, int y) {
    //     String coordinate = "(" + x + "," + y + ")";
    //     return areaMap.getOrDefault(coordinate, "Empty");
    // }

    // public void setTerrainAtCoordinate(int x, int y, String terrain) {
    //     String coordinate = "(" + x + "," + y + ")";
    //     areaMap.put(coordinate, terrain);
    // }

    private Creature getEnemyCreature() {
        // Logic to generate an enemy creature goes here
        Random random = new Random();
        int randomIndex = random.nextInt(App.creatureList.size());
        return App.creatureList.get(randomIndex);
    }

    // // Other methods and functionalities related to the Area class

    // private void swapActiveCreature() {
    //     // Logic for swapping the active creature
    //     Inventory inventory = new Inventory();
    //     inventory.showChangeActiveCreature();
    //     Scanner scanner = new Scanner(System.in);
    //     String newActiveCreatureName = scanner.nextLine();
    //     Creature newActiveCreature = inventory.selectCreature(newActiveCreatureName);
    //     if (newActiveCreature != null) {
    //         inventory.swapActiveCreature(newActiveCreature);
    //     } else {
    //         System.out.println("No active creatures available. You must return to the area.");
    //     }
    // }
}

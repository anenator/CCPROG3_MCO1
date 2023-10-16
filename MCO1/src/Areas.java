import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Areas {
    private int rows;
    private int columns;
    private int userPositionX;
    private int userPositionY;
    private HashMap<String, String> areaMap;

    public Areas(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.areaMap = new HashMap<>();
    }

    public void initializeArea() {
        // Initialize the area map with empty tiles or terrain
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                setTerrainAtCoordinate(i, j, "Empty"); // Assuming the terrain is initialized as empty
            }
        }
    }

    public void moveUser(String direction) {
        // Adjust the user's position according to the provided direction
        switch (direction) {
            case "UP":
                if (userPositionX > 0) {
                    userPositionX--;
                }
                break;
            case "DOWN":
                if (userPositionX < rows - 1) {
                    userPositionX++;
                }
                break;
            case "LEFT":
                if (userPositionY > 0) {
                    userPositionY--;
                }
                break;
            case "RIGHT":
                if (userPositionY < columns - 1) {
                    userPositionY++;
                }
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }
        checkEncounter();
    }

    public void checkEncounter() {
        // Check if the user encounters a creature and initiate the battle phase
        Random rand = new Random();
        if (rand.nextInt(10) < 4) {
            // Encountered a creature, initiate the battle phase
            Creature enemyCreature = new Creature(); // Logic to generate an enemy creature goes here
            BattlePhase battlePhase = new BattlePhase(getActiveCreature(), enemyCreature, getInventory());
            battlePhase.initiateBattle();
        }
    }

    public String getTerrainAtCoordinate(int x, int y) {
        String coordinate = "(" + x + "," + y + ")";
        return areaMap.getOrDefault(coordinate, "Empty");
    }

    public void setTerrainAtCoordinate(int x, int y, String terrain) {
        String coordinate = "(" + x + "," + y + ")";
        areaMap.put(coordinate, terrain);
    }

    // Other methods and functionalities related to the Area class

    private void swapActiveCreature() {
        // Logic for swapping the active creature
        Inventory inventory = new Inventory();
        inventory.showChangeActiveCreature();
        Scanner scanner = new Scanner(System.in);
        String newActiveCreatureName = scanner.nextLine();
        Creature newActiveCreature = inventory.selectCreature(newActiveCreatureName);
        if (newActiveCreature != null) {
            inventory.swapActiveCreature(newActiveCreature);
        } else {
            System.out.println("No active creatures available. You must return to the area.");
        }
    }
}

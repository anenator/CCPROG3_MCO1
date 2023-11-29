
import java.util.Random;

/**
 * The Area abstract class represents the game area where the player can move around and encounter creatures.
 * It contains a two-dimensional array that represents the game area, the player's position, and methods to move the player and check for creature encounters.
 */
public abstract class Area {

    /**
     * The two-dimensional array that represents the game area.
     */
    protected int[][] twoDArray;

    /**
     * The number of rows in the game area.
     */
    protected  int rows;

    /**
     * The number of columns in the game area.
     */
    protected  int columns;

    /**
     * The x-coordinate of the player's position.
     */
    protected  int userPositionX;

    /**
     * The y-coordinate of the player's position.
     */
    protected  int userPositionY;

    protected  int areaNum; 

    /**
     * Constructs an Area object with the specified number of rows and columns.
     * @param rows the number of rows in the game area
     * @param columns the number of columns in the game area
     */
    public Area(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.twoDArray = new int[rows][columns];
        this.userPositionX = 0;
        this.userPositionY = 0;
        this.areaNum = 0;
    }

    /**
     * Displays the game area with the player's position marked by an "x".
     */
    public void showArea() {
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                if (i == userPositionX && j == userPositionY) {
                    System.out.print("  x  |");
                } else {
                    System.out.print("     |");
                }
            }
            System.out.println();
        }
    }

    /**
     * Moves the player in the specified direction and checks for creature encounters.
     * @param direction the direction in which to move the player (1 = up, 2 = down, 3 = left, 4 = right)
     * @param userInventory the player's inventory
     */
    public void moveUser(int direction, Inventory userInventory) {
        boolean canCheckEncounter = true;
        switch (direction) {
            case 1:
                if (userPositionX > 0) {
                    userPositionX--;
                } else {
                    System.out.println("You have reached the edge of the area.");
                    System.out.println("Move in a different direction.");
                    canCheckEncounter = false;
                }
                break;
            case 2:
                if (userPositionX < rows - 1) {
                    userPositionX++;
                } else {
                    System.out.println("You have reached the edge of the area.");
                    System.out.println("Move in a different direction.");
                    canCheckEncounter = false;
                }
                break;
            case 3:
                if (userPositionY > 0) {
                    userPositionY--;
                } else {
                    System.out.println("You have reached the edge of the area.");
                    System.out.println("Move in a different direction.");
                    canCheckEncounter = false;
                }
                break;
            case 4:
                if (userPositionY < columns - 1) {
                    userPositionY++;
                } else {
                    System.out.println("You have reached the edge of the area.");
                    System.out.println("Move in a different direction.");
                    canCheckEncounter = false;
                }
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }
        if (canCheckEncounter == true){
            checkEncounter(userInventory);
        } 
    }

    /**
     * Checks for creature encounters and initiates a battle if a creature is encountered.
     * @param userInventory the player's inventory
     */
    public void checkEncounter(Inventory userInventory) {
        Random rand = new Random();
        if (rand.nextInt(10) < 4) {
            Creature enemyCreature = getEnemyCreature(); 
            System.out.println(enemyCreature.getCreatureName() + " has appeared!");
            System.out.println("Initiating battle...");
            BattlePhase battlePhase = new BattlePhase(userInventory.getActiveCreature(), enemyCreature, userInventory);
            battlePhase.initiateBattle();
        }
    }

    /**
     * Returns a random enemy creature from the list of available creatures.
     * @return a random enemy creature
     */
    public abstract Creature getEnemyCreature(); 

    

    public void setAreaNum(int areaNum) {
        this.areaNum = areaNum;
    }

    public int getUserPositionY() {
        return userPositionY;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }


}

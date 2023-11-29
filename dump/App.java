
import java.util.Scanner;
import java.util.ArrayList;
/**
 * The main class for the Foodémon game. Allows the user to select a starter creature and start playing the game.
 * The user's selected creature is added to their inventory, and they can interact with other creatures in the game.
 * The game world consists of different areas, each with its own set of creatures and items.
 * The user can move around the game world and encounter creatures in each area.
 * The user can also catch other creatures they encouncter and add them to their inventory.
 */

public class App {
    /**
     * The list of creatures in the game.
     */
    public static ArrayList<Creature> creatureList;
    /**
     * The user's inventory.
     */
    public static Inventory userInventory;

    /**
    * The main method of the Foodémon game. Allows the user to choose a starter creature and initializes the game.
    * 
    * @param args an array of command-line arguments for the program (not used in this program)
    * @throws Exception if an error occurs during the game
    */
    public static void main(String[] args) throws Exception {
        /**
         * The scanner object used to read user input.
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * The creature selected by the user. 
         */
        String creature = "";
        /**
         * A boolean value indicating whether the user has selected a valid creature. 
         */
        boolean isValidCreature = false;
        /**
         * A boolean value indicating whether the user has selected a valid option.
         */
        boolean isValidOption = false;
        /**
         *  The user's inventory.
         */
        userInventory = new Inventory();
        /**
         * The first area in the game.
         */
        Area area1 = new Area(1, 5);

        instantiateCreatures();
       
        while (!isValidCreature) {
            printSeparator(44);
            System.out.println("             Welcome to Foodémon!           ");
            printSeparator(44);
            System.out.println();
            System.out.println("         Choose a starter creature:         ");
            System.out.println();
            printSeparator(44);
            System.out.println("     Fire          Earth          Water     ");
            printSeparator(44);
            System.out.println("1 Strawander    4 Brownisaur   7 Squirpie   ");
            System.out.println("2 Chocowool     5 Frubat       8 Chocolite  ");
            System.out.println("3 Parfwit       6 Malts        9 Oshacone   ");
            printSeparator(44);
            System.out.println();
            creature = scanner.nextLine();

            switch (creature) {
                case "1":
                    creature = "Strawander"; 
                    System.out.println();
                    userInventory.addCreature(new Creature("Strawander", "Fire", "A", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "2":
                    creature = "Chocowool";
                    System.out.println();
                    userInventory.addCreature(new Creature("Chocowool", "Fire", "B", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "3":
                    creature = "Parfwit";
                    System.out.println();
                    userInventory.addCreature(new Creature("Parfwit", "Fire", "C", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "4":
                    creature = "Brownisaur";
                    System.out.println();
                    userInventory.addCreature(new Creature("Brownisaur", "Grass", "D", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "5":
                    creature = "Frubat";
                    System.out.println();
                    userInventory.addCreature(new Creature("Frubat", "Grass", "E", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "6":
                    creature = "Malts";
                    System.out.println();
                    userInventory.addCreature(new Creature("Malts", "Grass", "F", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "7":
                    creature = "Squirpie";
                    System.out.println();
                    userInventory.addCreature(new Creature("Squirpie", "Water", "G", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "8":
                    creature = "Chocolite";
                    System.out.println();
                    userInventory.addCreature(new Creature("Chocolite", "Water", "H", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "9":
                    creature = "Oshacone";
                    System.out.println();
                    userInventory.addCreature(new Creature("Oshacone", "Water", "I", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Creature. Please try again.");
                    break;
            }
        }

        System.out.println();

        while (!isValidOption) {
            System.out.println();
            printSeparator(44);
            System.out.println("                 Main Menu                  ");
            printSeparator(44);
            System.out.println("1. View Inventory");
            System.out.println("2. Explore an Area");
            System.out.println("3. Evolve Creature");
            System.out.println("4. Exit");
            printSeparator(44);
            System.out.println();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(); 
                    printSeparator(44); 
                    System.out.println("                 Inventory                  ");
                    printSeparator(44);
                    System.out.println("1: Show Creatures");
                    System.out.println("2: Show Active Creature");
                    System.out.println("3: Change Active Creature");
                    printSeparator(44); 
                    System.out.println();
                    int option2 = scanner.nextInt(); 
                    switch (option2) {
                        case 1:
                            System.out.println();
                            System.out.println("Available Creatures:");
                            System.out.println();
                            userInventory.showCapturedCreatureDetails();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            userInventory.showActiveCreature();
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            System.out.println("Change Active Creature");
                            for(int i = 0; i < userInventory.getCapturedCreatureList().size(); i++) {
                                System.out.println(i + 1 + ": " + userInventory.getCapturedCreatureList().get(i).getCreatureName());
                            }
                            int option5 = scanner.nextInt();
                            if (option5 > userInventory.getCapturedCreatureList().size()) {
                                System.out.println("Invalid option. Please try again.");
                                break;
                            }
                            userInventory.changeActiveCreature(userInventory.getCapturedCreatureList().get(option5 - 1));
                            System.out.println();
                            break;
                        case 4:
                            System.out.println();
                            System.out.println("Exit");
                            System.out.println();
                            break;
                        default:
                            System.out.println();
                            System.out.println("Invalid Option. Please try again.");
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    printSeparator(44); 
                    System.out.println("                    AREAS                   ");
                    printSeparator(44); 
                    System.out.println("1: Area 1");
                    printSeparator(44); 
                    System.out.println();
                    int option3 = scanner.nextInt();
                    switch (option3) {
                        case 1:
                            do {
                            System.out.println();
                            printSeparator(44); 
                            System.out.println("                    AREA 1                   ");
                            printSeparator(44);
                            System.out.println(); 
                            area1.showArea();
                            System.out.println("1: Up");
                            System.out.println("2: Down");
                            System.out.println("3: Left");
                            System.out.println("4: Right");
                            System.out.println("5: Exit");
                            System.out.println();
                            int option4 = scanner.nextInt();
                            switch (option4) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Up");
                                    System.out.println();
                                    area1.moveUser(1, userInventory);
                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println("Down");
                                    System.out.println();
                                    area1.moveUser(2, userInventory);
                                    break;
                                case 3:
                                    System.out.println();
                                    System.out.println("Left");
                                    System.out.println();
                                    area1.moveUser(3, userInventory);
                                    break;
                                case 4:
                                    System.out.println();
                                    System.out.println("Right");
                                    System.out.println();
                                    area1.moveUser(4, userInventory);
                                    break;
                                case 5:
                                    System.out.println();
                                    System.out.println("Exit");
                                    System.out.println();
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Invalid Option. Please try again.");
                                    System.out.println();
                                    break;
                            }
                                if (option4 == 5)
                                    break;
                            } while (true);
                            break;
                        default:
                            System.out.println();
                            System.out.println("Invalid Option. Please try again.");
                            System.out.println();
                            break;
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Evolution");
                    System.out.println("To be implemented.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Exit");
                    System.out.println();
                    isValidOption = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Option. Please try again.");
                    System.out.println();
                    break;

                
            }
        }
    }
    /**
    *  This method instantiates the creatues in the game.
    */
    public static void instantiateCreatures() {
        creatureList = new ArrayList<Creature>();
        creatureList.add(new Creature("Strawander", "Fire", "A", 1));
        creatureList.add(new Creature("Chocowool", "Fire", "B", 1));   
        creatureList.add(new Creature("Parfwit", "Fire", "C", 1));
        creatureList.add(new Creature("Brownisaur", "Grass", "D", 1));
        creatureList.add(new Creature("Frubat", "Grass", "E", 1));
        creatureList.add(new Creature("Malts", "Grass", "F", 1));
        creatureList.add(new Creature("Squirpie", "Water", "G", 1));
        creatureList.add(new Creature("Chocolite", "Water", "H", 1));
        creatureList.add(new Creature("Oshacone", "Water", "I", 1));
        
        
    }
    
    /**
     * Prints a separator line consisting of n dashes to the console.
     *
     * @param n the number of dashes in the separator line
     */
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}

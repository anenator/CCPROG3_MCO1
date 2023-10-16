import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static ArrayList<Creature> creatureList;
    public static Inventory userInventory;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String creature = "";
        boolean isValidCreature = false;
        boolean isValidOption = false;
        userInventory = new Inventory();
        Area area1 = new Area(1, 5);

        instantiateCreatures();
       
        while (!isValidCreature) {
            System.out.println("Select a Starter Creature:");
            System.out.println("1)Strawander");
            System.out.println("2)Brownisaur");
            System.out.println("3)Squirpie");
            System.out.println("4)Chocowool");
            System.out.println("5)Frubat");
            System.out.println("6)Malts");
            System.out.println("7)Chocolite");
            System.out.println("8)Oshacone");
            System.out.println("9)Parfwit");
            creature = scanner.nextLine();

            switch (creature) {
                case "1":
                    creature = "Strawander"; 
                    userInventory.addCreature(new Creature("Strawander", "Fire", "A", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "2":
                    creature = "Brownisaur";
                    userInventory.addCreature(new Creature("Brownisaur", "Grass", "D", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "3":
                    creature = "Squirpie";
                    userInventory.addCreature(new Creature("Squirpie", "Water", "G", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "4":
                    creature = "Chocowool";
                    userInventory.addCreature(new Creature("Chocowool", "Fire", "B", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "5":
                    creature = "Frubat";
                    userInventory.addCreature(new Creature("Frubat", "Grass", "E", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "6":
                    creature = "Malts";
                    userInventory.addCreature(new Creature("Malts", "Green", "F", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "7":
                    creature = "Chocolite";
                    userInventory.addCreature(new Creature("Chocolite", "Water", "H", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "8":
                    creature = "Oshacone";
                    userInventory.addCreature(new Creature("Oshacone", "Water", "I", 1));
                    userInventory.selectCreature(creature);
                    System.out.println();
                    System.out.println("Selected " + creature);
                    isValidCreature = true;
                    break;
                case "9":
                    creature = "Parfwit";
                    userInventory.addCreature(new Creature("Parfwit", "Fire", "C", 1));
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
            System.out.println("Options:");
            System.out.println("1: Inventory");
            System.out.println("2: Areas");
            System.out.println("3: Evolution");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println();  
                    System.out.println("Inventory");
                    System.out.println("1: Show Creatures");
                    System.out.println("2: Show Active Creature");
                    System.out.println("3: Change Active Creature");
                    int option2 = scanner.nextInt(); 
                    switch (option2) {
                        case 1:
                            System.out.println();
                            System.out.println("Show Creatures");
                            userInventory.showCapturedCreatureDetails();
                            break;
                        case 2:
                            System.out.println();
                            System.out.println("Show Active Creature");
                            userInventory.showActiveCreature();
                            break;
                        case 3:
                            System.out.println();
                            System.out.println("Change Active Creature");
                            userInventory.changeActiveCreature(null);
                            break;
                        default:
                            System.out.println();
                            System.out.println("Invalid Option. Please try again.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Areas");
                    System.out.println("1: Area 1");
                    int option3 = scanner.nextInt();
                    switch (option3) {
                        case 1:
                            do {
                            System.out.println();
                            System.out.println("Area 1");
                            area1.showArea();
                            System.out.println("1: Up");
                            System.out.println("2: Down");
                            System.out.println("3: Left");
                            System.out.println("4: Right");
                            System.out.println("5: Exit");
                            int option4 = scanner.nextInt();
                            switch (option4) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Up");
                                    area1.moveUser(1, userInventory);
                                    area1.showArea();
                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println("Down");
                                    area1.moveUser(2, userInventory);
                                    area1.showArea();
                                    break;
                                case 3:
                                    System.out.println();
                                    System.out.println("Left");
                                    area1.moveUser(3, userInventory);
                                    area1.showArea();
                                    break;
                                case 4:
                                    System.out.println();
                                    System.out.println("Right");
                                    area1.moveUser(4, userInventory);
                                    area1.showArea();
                                    break;
                                case 5:
                                    System.out.println();
                                    System.out.println("Exit");
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Invalid Option. Please try again.");
                                    break;
                            }
                                if (option4 == 5)
                                    break;
                            } while (true);
                            break;
                        default:
                            System.out.println();
                            System.out.println("Invalid Option. Please try again.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Evolution");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Exit");
                    isValidOption = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Option. Please try again.");
                    break;

                
            }
        }
    }
    
    public static void instantiateCreatures() {
        creatureList = new ArrayList<Creature>();
        creatureList.add(new Creature("Strawander", "Fire", "A", 1));
        creatureList.add(new Creature("Chocowool", "Water", "A", 1));   
        creatureList.add(new Creature("Parfwit", "Grass", "A", 1));
        creatureList.add(new Creature("Brownisaur", "Fire", "B", 2));
        creatureList.add(new Creature("Frubat", "Water", "B", 2));
        creatureList.add(new Creature("Malts", "Grass", "B", 2));
        creatureList.add(new Creature("Squirpie", "Fire", "C", 3));
        creatureList.add(new Creature("Chocolite", "Water", "C", 3));
        creatureList.add(new Creature("Oshacone", "Grass", "C", 3));
        
        
    }
}

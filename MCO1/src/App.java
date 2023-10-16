import java.util.Scanner;
import java.util.ArrayList;

public class App {
    private ArrayList<Creature> creatureList;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String creature = "";
        boolean isValidCreature = false;
        boolean isValidOption = false;

       

        while (!isValidCreature) {
            System.out.println("Select a Starter Creature:");
            System.out.println("Creature1");
            System.out.println("Creature2");
            System.out.println("Creature3");
            creature = scanner.nextLine();

            switch (creature) {
                case "Creature1":
                case "Creature2":
                case "Creature3":
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
                    isValidOption = true;
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Areas");
                    isValidOption = true;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Evolution");
                    isValidOption = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid Option. Please try again.");
                    break;
            }
        }
    }

    public void instantiateCreatures() {
        creatureList = new ArrayList<Creature>();
        new Creature("Strawander", "Fire", "A", 1);
        new Creature("Chocowool", "Fire", "B", 1);
        new Creature("Parfwit", "Fire", "C", 1);
        new Creature("Brownisaur", "Earth", "D", 1);
        new Creature("Frubat", "Earth", "E", 1);
        new Creature("Malts", "Earth", "F", 1);
        new Creature("Squirpie", "Water", "G", 1);
        new Creature("Chocolite", "Water", "H", 1);
        new Creature("Oshacone", "Water", "I", 1);
    }
}

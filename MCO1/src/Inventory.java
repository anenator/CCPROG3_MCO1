import java.util.ArrayList;

public class Inventory {
    private 
    private ArrayList<Creature> capturedCreatureList;
    private Creature activeCreature; // Update the attribute
    private int maxCapacity;

    public Inventory() {
        capturedCreatureList = new ArrayList<>();
        maxCapacity = 10; 
    }

    public void showCapturedList() {
        for (Creature creature : capturedCreatureList) {
            System.out.println(creature.getCreatureName());
        }
    }

    public void showActiveCreature() {
        System.out.println("Active Creature: " + activeCreature.getCreatureName());
    }

    public void showChangeActiveCreature() {
        System.out.println("Select a new active creature.");
        // Add logic for changing the active creature
    }

    public ArrayList<Creature> getCapturedCreatureList() {
        return capturedCreatureList;
    }

    public void addCreature(Creature creature) {
        if (capturedCreatureList.size() < maxCapacity) {
            capturedCreatureList.add(creature);
        } else {
            System.out.println("Inventory is full. Cannot add more creatures.");
        }
    }

    public void removeCreature(Creature creature) {
        capturedCreatureList.remove(creature);
    }

    public void swapActiveCreature(Creature newActiveCreature) {
        activeCreature = newActiveCreature;
        System.out.println("Active creature has been swapped to: " + activeCreature.getCreatureName());
    }

    public Creature selectCreature(String creatureName) {
        for (Creature creature : capturedCreatureList) {
            if (creature.getCreatureName().equals(creatureName)) {
                System.out.println("Creature " + creatureName + " has been selected.");
                changeActiveCreature(creature);
                return Creature;
            }
        }
        System.out.println("Creature " + creatureName + " not found in the inventory.");
    }

    public void showCapturedCreatureDetails() {
        for (Creature creature : capturedCreatureList) {
            System.out.println("Name: " + creature.getCreatureName() +
                    ", Type: " + creature.getCreatureType() +
                    ", Family: " + creature.getCreatureFamily() +
                    ", Evolution Level: " + creature.getCreatureEvolutionLevel());
        }
    }

    public void showActiveCreatureDetails() {
        if (activeCreature != null) {
            System.out.println("Active Creature: " + activeCreature.getCreatureName() +
                    ", Type: " + activeCreature.getCreatureType() +
                    ", Family: " + activeCreature.getCreatureFamily() +
                    ", Evolution Level: " + activeCreature.getCreatureEvolutionLevel());
        } else {
            System.out.println("No active creature set.");
        }
    }

    public void changeActiveCreature(Creature newActiveCreature) {
        activeCreature = newActiveCreature;
        System.out.println("Active creature has been changed to: " + activeCreature.getCreatureName());
    }

    
}
  


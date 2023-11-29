import java.util.ArrayList;

/**
 * This class represents an inventory of captured creatures.
 */
public class Inventory {

    /**
     * The list of captured creatures in the inventory.
     */
    private ArrayList<Creature> capturedCreatureList;
    
    /**
     * The active creature in the inventory.
     */
    private Creature activeCreature;
    
    /**
     * The maximum capacity of the inventory.
     */
    private int maxCapacity;

    /** 
     * This constructor creates an inventory with an empty list of captured creatures and a maximum capacity of 10.
     * 
    */
    public Inventory() {
        capturedCreatureList = new ArrayList<>();
        maxCapacity = 10; 
    }

    /** 
     *  This method shows the list of captured creatures.
     * 
    */
    public void showCapturedList() {
        for (Creature creature : capturedCreatureList) {
            System.out.println(creature.getCreatureName());
        }
    }

    /** 
     *  This method shows the active creature.
     * 
    */
    public void showActiveCreature() {
        System.out.println("Active Creature: " + activeCreature.getCreatureName());
    }

    /** 
     * This method shows the list of captured creatures.
     * 
    */
    public void showChangeActiveCreature() {
        System.out.println("Select a new active creature.");
        

    }

    /** 
     * This method returns the list of captured creatures.
     * @return The list of captured creatures
     * 
    */
    public ArrayList<Creature> getCapturedCreatureList() {
        return capturedCreatureList;
    }

    /** 
     * This method adds a creature to the inventory.
     * @param creature The creature to be added
     * 
    */
    public void addCreature(Creature creature) {
        if (capturedCreatureList.size() < maxCapacity) {
            capturedCreatureList.add(creature);
        } else {
            System.out.println("Inventory is full. Cannot add more creatures.");
        }
    }


    /** 
     * This method swaps the active creature.
     * @param newActiveCreature The new active creature
     * 
    */
    public void swapActiveCreature(Creature newActiveCreature) {
        activeCreature = newActiveCreature;
        System.out.println("Active creature has been swapped to: " + activeCreature.getCreatureName());
    }

    /** 
     * This method selects a creature from the inventory.
     * @param creatureName The creature to be selected
     * @return The creature to be selected
     * 
    */
    public Creature selectCreature(String creatureName) {
        for (Creature creature : capturedCreatureList) {
            if (creature.getCreatureName().equals(creatureName)) {
                System.out.println("Creature " + creatureName + " has been selected.");
                changeActiveCreature(creature);
                return creature;
            }
        }
        System.out.println("Creature " + creatureName + " not found in the inventory.");
        return null;
    }

    /** 
     * This method shows the details of the captured creatures.
     * 
    */
    public void showCapturedCreatureDetails() {
        for (Creature creature : capturedCreatureList) {
            System.out.println("Name: " + creature.getCreatureName() +
                    ", Type: " + creature.getCreatureType() +
                    ", Family: " + creature.getCreatureFamily() +
                    ", Evolution Level: " + creature.getCreatureEvolutionLevel());
        }
    }

    /**
     *  This method shows the details of the active creature.
     *  
     */
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

    /** 
     *  This method changes the active creature.
     * @param newActiveCreature The new active creature
     * 
    */
    public void changeActiveCreature(Creature newActiveCreature) {
        activeCreature = newActiveCreature;
        System.out.println("Active creature has been changed to: " + activeCreature.getCreatureName());
    }

    /** 
     * This method returns the active creature.
     * @return The active creature
     * 
    */
    public Creature getActiveCreature() {
        return activeCreature;
    }
    
}
  



import java.net.URL;
/**
 * The Creature class represents a creature with a name, type, family, evolution level, and current health.
 * It also keeps track of the number of creatures created.
 * 
 */
public class Creature {
    /**
    *  The path to the image of the creature.
    */ 
    private String creatureImage;

    /**
    * The name of the creature.
    */
    private String creatureName;
    
    /**
    * The type of the creature.
    */
    private String creatureType;
    
    /**
    * The family of the creature.
    */
    private String creatureFamily;
    
    /**
    * The evolution level of the creature.
    */
    private int creatureEvolutionLevel;
    
    /**
    * The number of creatures created.
    */
    private static int numCreatures = 0;
    
    /**
    * The current health of the creature.
    */
    private int currentHealth;

    /**
     * This constructor creates a creature with the given name, type, family, and evolution level.
     * It also initializes the current health to 50.
     * 
     * @param creatureName The name of the creature
     * @param creatureType The type of the creature
     * @param creatureFamily The family of the creature
     * @param creatureEvolutionLevel The evolution level of the creature
     */
    public Creature (String creatureImage, String creatureName, String creatureType, String creatureFamily, int creatureEvolutionLevel) {
        this.creatureImage = creatureImage;
        this.creatureName = creatureName;
        this.creatureType = creatureType;
        this.creatureFamily = creatureFamily;
        this.creatureEvolutionLevel = creatureEvolutionLevel;
        this.currentHealth = 50;
        numCreatures++;
        
    }

    /**  
     * This method returns the name of the creature.
     * @return The name of the creature
     * 
    */
    public String getCreatureName() {
        return this.creatureName;
    }

    /**  
     * This method sets the name of the creature.
     * @param creatureName The name of the creature
     * 
    */
    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    /**  
     * This method returns true if there is at least one creature created.
     * @return True if there is at least one creature created, false otherwise
     * 
    */
    public static boolean isThereCreature() {
        return numCreatures > 0;
    }

    /**  
     * This method returns the type of the creature.
     * @return The type of the creature
     * 
    */
    public String getCreatureType() {
        return creatureType;
    }

    /**  
     * This method returns the family of the creature.
     * @return The family of the creature
     * 
    */
    public String getCreatureFamily() {
        return creatureFamily;
    }

    /**  
     * This method returns the evolution level of the creature.
     * @return The evolution level of the creature
     * 
    */
    public int getCreatureEvolutionLevel() {
        return creatureEvolutionLevel;
    }

    /**  
     * This method returns the current health of the creature.
     * @return The current health of the creature
     * 
    */
    public int getCurrentHealth() {
        return currentHealth;
    }

    /**
     * This method reduces the current health of the creature by the given damage amount.
     * @param damage The amount of damage to reduce the current health by
     */
    public void reduceHealth(int damage) {
        currentHealth -= damage;
    }

    public String getCreatureImage() {
        return creatureImage;
    }

    public void setCreatureImage(String creatureImage) {
        this.creatureImage = creatureImage;
    }

}

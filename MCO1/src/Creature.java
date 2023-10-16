
public class Creature {
    private String creatureName;
    private String creatureType;
    private String creatureFamily;
    private int creatureEvolutionLevel;
    private static int numCreatures = 0;
    private int currentHealth;

    public Creature (String creatureName, String creatureType, String creatureFamily, int creatureEvolutionLevel) {
        this.creatureName = creatureName;
        this.creatureType = creatureType;
        this.creatureFamily = creatureFamily;
        this.creatureEvolutionLevel = creatureEvolutionLevel;
        this.currentHealth = 50;
        numCreatures++;
        
    }


    public String getCreatureName() {
        return this.creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public static boolean isThereCreature() {
        return numCreatures > 0;
    }

  
    public String getCreatureType() {
        return creatureType;
    }

   
    public String getCreatureFamily() {
        return creatureFamily;
    }

   
    public int getCreatureEvolutionLevel() {
        return creatureEvolutionLevel;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void reduceHealth(int damage) {
        currentHealth -= damage;
    }

}

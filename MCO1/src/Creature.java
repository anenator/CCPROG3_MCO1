import java.net.*;
import java.io.*;

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
        this.currentHealth = 100;
        numCreatures++;
        
        if (this.creatureName.equals("Strawander")) {
            this.creatureType = "Fire";
            this.creatureFamily = "A";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Chocowool")) {
            this.creatureType = "Fire";
            this.creatureFamily = "B";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Parfwit")) {
            this.creatureType = "Fire";
            this.creatureFamily = "C";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Brownisaur")) {
            this.creatureType = "Earth";
            this.creatureFamily = "D";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Frubat")) {
            this.creatureType = "Earth";
            this.creatureFamily = "E";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Malts")) {
            this.creatureType = "Earth";
            this.creatureFamily = "F";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Squirpie")) {
            this.creatureType = "Water";
            this.creatureFamily = "G";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Chocolite")) {
            this.creatureType = "Water";
            this.creatureFamily = "H";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        } else if (this.creatureName.equals("Oshacone")) {
            this.creatureType = "Water";
            this.creatureFamily = "I";
            this.creatureEvolutionLevel = 1;
            numCreatures += 1;
        }
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

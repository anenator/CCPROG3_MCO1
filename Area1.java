import java.util.ArrayList;
import java.util.Random;
/** 
 *  This class serves as the first area of the game. 
*/
public class Area1 extends Area implements CreatureFactory {
    /** 
     *  This constructor creates an Area1 object with 1 row and 5 columns.
    */
    public Area1(int areaNum) {
        super(1, 5);
        setAreaNum(areaNum);
    }
    /** 
     *  This method randomly generates an enemy creature that is EL level 1.
     *  @return the enemy creature
     *  @see CreatureFactory#getEnemyCreature()
    */
    @Override
    public Creature getEnemyCreature() {
    Random random = new Random();
    ArrayList<Creature> el1Creatures = new ArrayList<Creature>();

    // Filter creatures with EL level of 1
    for (Creature creature : CreatureFactory.creatureList) {
        if (creature.getCreatureEvolutionLevel() == 1) {
            el1Creatures.add(creature);
        }
    }

    // Check if there are any creatures to select from
    if (el1Creatures.isEmpty()) {
        // Handle the case where there are no creatures
        System.err.println("No creatures available!");
        // Return a default Creature
        return new Creature("default.png", "Default", "Type", "Family", 1);
    } else {
        // Select a random creature from the filtered list
        int randomIndex = random.nextInt(el1Creatures.size());
        Creature selectedCreature = el1Creatures.get(randomIndex);

        return new Creature(
            selectedCreature.getCreatureImage(),
            selectedCreature.getCreatureName(), 
            selectedCreature.getCreatureType(), 
            selectedCreature.getCreatureFamily(), 
            selectedCreature.getCreatureEvolutionLevel()
        );
    }
}


    @Override
    public void moveUser(int direction, Inventory userInventory) {
        if (direction == 3 || direction == 4) { // 3 = left, 4 = right
            if (direction == 3 && userPositionY > 0) {
                userPositionY--;
                checkEncounter(userInventory);
            } else if (direction == 4 && userPositionY < columns - 1) {
                userPositionY++;
                checkEncounter(userInventory);
            } else {
                System.out.println("You have reached the edge of the area.");
                System.out.println("Move in a different direction.");
            }
        } else {
            System.out.println("Invalid direction. You can only move left or right in Area1.");
        }
    }
}

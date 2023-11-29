import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Area3 extends Area implements CreatureFactory {

    public Area3(int areaNum) {
        super(4, 4);
        setAreaNum(areaNum);
    }

    @Override
        public Creature getEnemyCreature() {
        Random random = new Random();
        List<Creature> combinedList = new ArrayList<>();

        // Filter creatures with EL level of 1, 2, and 3
        for (Creature creature : CreatureFactory.creatureList) {
            if (creature.getCreatureEvolutionLevel() >= 1 && creature.getCreatureEvolutionLevel() <= 3) {
                combinedList.add(creature);
            }
        }

        int randomIndex = random.nextInt(combinedList.size());
        Creature selectedCreature = combinedList.get(randomIndex);
        
        return new Creature(
            selectedCreature.getCreatureImage(),
            selectedCreature.getCreatureName(), 
            selectedCreature.getCreatureType(), 
            selectedCreature.getCreatureFamily(), 
            selectedCreature.getCreatureEvolutionLevel()
        );
}

}
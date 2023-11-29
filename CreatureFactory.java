import java.util.ArrayList;
/**
 * This interface represents a factory that creates creatures.
 * 
 */
public interface CreatureFactory {
    /** 
     * This method creates a creature with the given image, name, type, family, and evolution level.
    */
    ArrayList<Creature> creatureList = new ArrayList<Creature>(); // Declare and initialize creatureList

    public static void instantiateCreatures() {
    
        creatureList.add(new Creature("resources/strawander.png", "Strawander", "Fire", "A", 1));
        creatureList.add(new Creature("resources/strawleon.png", "Strawleon", "Fire", "A", 2));
        creatureList.add(new Creature("resources/strawizard.png", "Strawizard", "Fire", "A", 3));

        creatureList.add(new Creature("resources/chocowool.png", "Chocowool", "Fire", "B", 1));
        creatureList.add(new Creature("resources/chocofluff.png", "Chocofluff", "Fire", "B", 2));
        creatureList.add(new Creature("resources/candaros.png", "Candaros", "Fire", "B", 3));

        creatureList.add(new Creature("resources/parfwit.png", "Parfwit", "Fire", "C", 1));
        creatureList.add(new Creature("resources/parfure.png", "Parfure", "Fire", "C", 2));
        creatureList.add(new Creature("resources/parfelure.png", "Parfelure", "Fire", "C", 3));

        creatureList.add(new Creature("resources/brownisaur.png", "Brownisaur", "Grass", "D", 1));
        creatureList.add(new Creature("resources/chocosaur.png", "Chocosaur", "Grass", "D", 2));
        creatureList.add(new Creature("resources/fudgasaur.png", "Fudgasaur", "Grass", "D", 3));

        creatureList.add(new Creature("resources/frubat.png", "Frubat", "Grass", "E", 1));
        creatureList.add(new Creature("resources/golberry.png", "Golberry", "Grass", "E", 2));
        creatureList.add(new Creature("resources/croberry.png", "Croberry", "Grass", "E", 3));

        creatureList.add(new Creature("resources/malts.png", "Malts", "Grass", "F", 1));
        creatureList.add(new Creature("kirlicake.png", "Kirlicake", "Grass", "F", 2));
        creatureList.add(new Creature("resources/velvevoir.png", "Velvevoir", "Grass", "F", 3));

        creatureList.add(new Creature("resources/squirpie.png", "Squirpie", "Water", "G", 1));
        creatureList.add(new Creature("tartorle.png", "Tartortle", "Water", "G", 2));
        creatureList.add(new Creature("resources/piestoise.png", "Piestoise", "Water", "G", 3));

        creatureList.add(new Creature("resources/chocolite.png", "Chocolite", "Water", "H", 1));
        creatureList.add(new Creature("resources/chocolish.png", "Chocolish", "Water", "H", 2));
        creatureList.add(new Creature("icesundai.png", "Icesundae", "Water", "H", 3));

        creatureList.add(new Creature("resources/oshacone.png", "Oshacone", "Water", "I", 1));
        creatureList.add(new Creature("resources/dewice.png", "Dewice", "Water", "I", 2));
        creatureList.add(new Creature("resources/samurcone.png", "Samurcone", "Water", "I", 3));
    }
}

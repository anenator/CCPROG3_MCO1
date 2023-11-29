/** 
 * This class is used to store the evolution requirements, available evolutions, 
 * and evolved form of a creature.
*/
public class Evolution {
    /** 
     *  The evolution requirements of the creature.
    */
    private String evolutionRequirements;
    /** 
     *  The available evolutions of the creature.
    */
    private String availableEvolutions;
    /** 
     *  The evolved form of the creature.
    */
    private String evolvedForm;

    /** 
     * This constructor creates an evolution with the given evolution requirements,
    */
    public Evolution(String evolutionRequirements, String availableEvolutions, String evolvedForm) {
        this.evolutionRequirements = evolutionRequirements;
        this.availableEvolutions = availableEvolutions;
        this.evolvedForm = evolvedForm;
    }


    /** 
     * This method returns the evolution requirements of the creature.
    */
    public String getEvolutionRequirements() {
        return this.evolutionRequirements;
    }

    /** 
     *  This method sets the evolution requirements of the creature.
    */
    public void setEvolutionRequirements(String evolutionRequirements) {
        this.evolutionRequirements = evolutionRequirements;
    }

    /** 
     *  This method returns the available evolutions of the creature.
    */
    public String getAvailableEvolutions() {
        return this.availableEvolutions;
    }

    /** 
     *  This method sets the available evolutions of the creature.
    */
    public void setAvailableEvolutions(String availableEvolutions) {
        this.availableEvolutions = availableEvolutions;
    }

    /** 
     *  This method returns the evolved form of the creature.
    */
    public String getEvolvedForm() {
        return this.evolvedForm;
    }

    /** 
     *  This method sets the evolved form of the creature.
    */
    public void setEvolvedForm(String evolvedForm) {
        this.evolvedForm = evolvedForm;
    }

    /** 
     *  This method returns the evolution level of the creature.
    */
    public int getEvolutionLevel(String creatureName) {
        switch (creatureName) {
            case "Strawander":
            case "Chocowool":
            case "Parfwit":
            case "Brownisaur":
            case "Frubat":
            case "Malts":
            case "Squirpie":
            case "Chocolite":
            case "Oshacone":
                return 1; 
 
            default:
                return 1; 
        }
    }
}

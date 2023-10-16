public class Evolution {
    private String evolutionRequirements;
    private String availableEvolutions;
    private String evolvedForm;

    public Evolution(String evolutionRequirements, String availableEvolutions, String evolvedForm) {
        this.evolutionRequirements = evolutionRequirements;
        this.availableEvolutions = availableEvolutions;
        this.evolvedForm = evolvedForm;
    }


    public String getEvolutionRequirements() {
        return this.evolutionRequirements;
    }

    public void setEvolutionRequirements(String evolutionRequirements) {
        this.evolutionRequirements = evolutionRequirements;
    }

    public String getAvailableEvolutions() {
        return this.availableEvolutions;
    }

    public void setAvailableEvolutions(String availableEvolutions) {
        this.availableEvolutions = availableEvolutions;
    }

    public String getEvolvedForm() {
        return this.evolvedForm;
    }

    public void setEvolvedForm(String evolvedForm) {
        this.evolvedForm = evolvedForm;
    }


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

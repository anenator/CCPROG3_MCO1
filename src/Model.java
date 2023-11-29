public class Model {
    private BattlePhase battlePhase;
    private Evolution evolution;
    private Inventory inventory;
    private Area activeArea;
    

    public Model() {
        inventory = new Inventory();
        // this.creatureFactory = factory;
        // this.inventory = new Inventory();
        // this.battlePhase = new BattlePhase(creature, area.getEnemyCreature(), inventory);
        // this.evolution = new Evolution(creature);
    }

    public void addCreatureToInventory(Creature creature) {
        inventory.addCreature(creature);
    }

    // Getters
    public Creature getActiveCreature() {
        return inventory.getActiveCreature();
    }
    
    public Inventory getInventory() {
        return inventory;
    }

    public BattlePhase getBattlePhase() {
        return battlePhase;
    }

    public Evolution getEvolution() {
        return evolution;
    }
    
    public void setActiveArea(Area area) {
        this.activeArea = area;
    }

    public Area getActiveArea() {
        return activeArea;
    }

}
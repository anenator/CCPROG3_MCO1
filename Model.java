public class Model {
    private BattlePhase battlePhase;
    private Evolution evolution;
    private Inventory inventory;
    private Area activeArea;
    

    public Model() {
 
        inventory = new Inventory();
       // battlePhase = new BattlePhase(inventory.getActiveCreature(), activeArea.getEnemyCreature(), inventory);

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements CreatureFactory{
    private final Model model;  // Reference to the model
    private final View view;  // Reference to the view

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;

        setUpStarterCreatureListeners();
        setUpActionListeners();
        setUpAreaChoiceListeners();
        setUpAreaMovementListeners();
        // Set the action listener for the view's setCreature method
    }


    private void setUpActionListeners() {

        view.getButtonEncounter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.encounterScreen();
            }
        });

        view.getButtonExitGame().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        view.setButtonViewInventoryListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Creature> creatureList = model.getInventory().getCapturedCreatureList();
                String[][] arrayOfArrays = new String[creatureList.size()][5];
                for(Creature creature : creatureList) {
                    arrayOfArrays[creatureList.indexOf(creature)][0] = creature.getCreatureImage();
                    arrayOfArrays[creatureList.indexOf(creature)][1] = creature.getCreatureName();
                    arrayOfArrays[creatureList.indexOf(creature)][2] = creature.getCreatureType();
                    arrayOfArrays[creatureList.indexOf(creature)][3] = creature.getCreatureFamily();
                    arrayOfArrays[creatureList.indexOf(creature)][4] = Integer.toString(creature.getCreatureEvolutionLevel());
                }

                String[] activeCreature = new String[5];
                Creature active = model.getInventory().getActiveCreature();
                activeCreature[0] = active.getCreatureImage();
                activeCreature[1] = active.getCreatureName();
                activeCreature[2] = active.getCreatureType();
                activeCreature[3] = active.getCreatureFamily();
                activeCreature[4] = Integer.toString(active.getCreatureEvolutionLevel());

                view.viewInventory(arrayOfArrays, activeCreature);
                
            }
        });

        
    }

    private void setUpStarterCreatureListeners() {
        view.getButtonCreatureStrawander().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/strawander.png", "Strawander", "Fire", "A", 1));
                model.getInventory().selectCreature("Strawander");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureChocowool().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/chocowool.png", "Chocowool", "Fire", "B", 1));
                model.getInventory().selectCreature("Chocowool");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureParfwit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/parfwit.png", "Parfwit", "Fire", "C", 1));
                model.getInventory().selectCreature("Parfwit");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureBrownisaur().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/brownisaur.png", "Brownisaur", "Grass", "D", 1));
                model.getInventory().selectCreature("Brownisaur");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureFrubat().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/frubat.png", "Frubat", "Grass", "E", 1));
                model.getInventory().selectCreature("Frubat");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureMalts().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/malts.png", "Malts", "Grass", "F", 1));
                model.getInventory().selectCreature("Malts");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureSquirpie().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/squirpie.png", "Squirpie", "Water", "G", 1));
                model.getInventory().selectCreature("Squirpie");
                view.creatureSelected(0);
            }
        });

        view.getButtonCreatureChocolite().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/chocolite.png", "Chocolite", "Water", "H", 1));
                model.getInventory().selectCreature("Chocolite");
                view.creatureSelected(0);
            }
        });


        view.getButtonCreatureOshacone().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addCreatureToInventory(new Creature("resources/oshacone.png", "Oshacone", "Water", "I", 1));
                model.getInventory().selectCreature("Oshacone");
                view.creatureSelected(0);


            }
        });
    }

    private void setUpAreaChoiceListeners() {
        view.getButtonArea1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.exploreArea(1);
                model.setActiveArea(new Area1(1));
            }
        });
        view.getButtonArea2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.exploreArea(2);
                model.setActiveArea(new Area2(2));
            }
        });
        view.getButtonArea3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.exploreArea(3);
                model.setActiveArea(new Area3(3));
            }
        });
    }

    private void setUpAreaMovementListeners() {
    view.getButtonUp().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    });
    view.getButtonDown().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    view.getButtonLeft().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (model.getActiveArea().getUserPositionY() > 0) {
                    // Update the player's position in the model
                    model.getActiveArea().moveUser(3, model.getInventory());
                    // Update the player's position in the view
                    view.updatePlayerPosition(model.getActiveArea().getUserPositionY());
                } else {
                    throw new OutOfBoundsException("You have reached the left edge of the area. Move in a different direction.");
                }
            } catch (OutOfBoundsException ob) {
                // Handle the exception (e.g., show an error message)
                System.err.println(ob.getMessage());
            }
        }
    });
    
    view.getButtonRight().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Check if the player is at the right edge of the area
                if (model.getActiveArea().getUserPositionY() < model.getActiveArea().getColumns() - 1) {
                    // Update the player's position in the model
                    model.getActiveArea().moveUser(4, model.getInventory());
                    // Update the player's position in the view
                    view.updatePlayerPosition(model.getActiveArea().getUserPositionY());
                } else {
                    throw new OutOfBoundsException("You have reached the right edge of the area. Move in a different direction.");
                }
            } catch (OutOfBoundsException ob) {
                // Handle the exception (e.g., show an error message)
                System.err.println(ob.getMessage());
            }
        }
    });
    

    }
}

    



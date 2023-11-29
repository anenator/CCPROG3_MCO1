import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements CreatureFactory{
    private final Model model;  // Reference to the model
    private final View view;  // Reference to the view

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;

        CreatureFactory.instantiateCreatures(); 

        setUpStarterCreatureListeners();
        setUpActionListeners();
        setUpAreaChoiceListeners();
        setUpAreaMovementListeners();
        setUpEncounterListeners();
        // Set the action listener for the view's setCreature method
    }


    private void setUpActionListeners() {

        view.getButtonExitGame().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        view.getButtonExit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in Area class to handle exit
                view.exitArea();
            }
        });
    
        view.getButtonExploreArea().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in Area class to explore area
                view.exploreArea();
            }
        });
    
        view.getButtonEvolveCreature().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in Area class to evolve creature
                view.evolutionScreen("creature1.png", "Creature One", 10, "creature2.png", "Creature Two", 15);
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
                Area1 area1 = new Area1(1);  // Create an Area1 instance
                area1.setView(view);  // Set the View instance for Area1
                model.setActiveArea(area1);  // Set the active area in your model
            }
        });
        view.getButtonArea2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.exploreArea(2);
                Area2 area2 = new Area2(2);  // Create an Area2 instance
                area2.setView(view);  // Set the View instance for Area2
                model.setActiveArea(area2);  // Set the active area in your model
            }
        });
        view.getButtonArea3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.exploreArea(3);
                Area3 area3 = new Area3(3);  // Create an Area3 instance
                area3.setView(view);  // Set the View instance for Area3
                model.setActiveArea(area3);  // Set the active area in your model
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

    private void setUpEncounterListeners() {
        view.getButtonAttack().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in BattlePhase class to handle attack
                model.getBattlePhase().performAttack();

            }
        });
    
        view.getButtonSwap().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in BattlePhase class to handle swap
                model.getBattlePhase().swapActiveCreature();

            }
        });
    
        view.getButtonCatch().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in BattlePhase class to handle catch
                model.getBattlePhase().attemptCatch();
      
            }
        });
    
        view.getButtonRun().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the method in BattlePhase class to handle run
                model.getBattlePhase().endBattlePhase();
                view.closeEncounterScreen(); // Close the encounter screen
            }
        });
        
    }
    
}

    



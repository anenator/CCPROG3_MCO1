import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class View {
    // Add a horizontal toolbar at the bottom of the main encounter frame with icons
    private final JToolBar encounterToolBar = new JToolBar();
    // ImageIcon for Enemy during encounter
    private final ImageIcon enemyImageIcon = new ImageIcon();
    // For Inventory Pane scrolling functionality
    private final JScrollPane scrollablePanel = new JScrollPane();
    // Main Panel
    private final JPanel panel = new JPanel();
    // Inventory Panels
    private final JPanel creatureInfoPanel = new JPanel();
    private final JPanel viewInventoryPanel = new JPanel();
    private final JPanel headerPanel = new JPanel();
    // private final JPanel individualCreaturePanel = new JPanel();
    private final JPanel inventoryPanel = new JPanel();
    // Creature Selection Panel
    private final JPanel creaturePanel = new JPanel();
    // Area Panels
    private final JPanel playerbox = new JPanel();
    private JPanel[] area1Boxes = new JPanel[5];
    private final JPanel areaButtonPanel = new JPanel();
    private final JPanel area1Panel = new JPanel();
    private final JPanel area2Panel = new JPanel();
    private final JPanel area3Panel = new JPanel();
    // Inside Area Screen Panels
    private final JPanel exitButtonPanel = new JPanel();
    private final JPanel buttonPanel = new JPanel();
    private final JPanel blackBoxLeft = new JPanel();
    private final JPanel rightPanel = new JPanel();
    private final JPanel leftPanel = new JPanel();
    // Main Menu Panels
    private final JPanel inventoryButtonPanel = new JPanel();
    private final JPanel mainMenuPanel = new JPanel();
    private final JPanel evoMainPanel = new JPanel();
    // Encounter Panels 
    private final JPanel encounterInfoPanel = new JPanel();
    private final JPanel encounterButtonPanel = new JPanel();
    private final JPanel encounterMainPanel = new JPanel();
    private final JPanel enemyInfoPanel = new JPanel();
    // Evolution Panels
    private final JPanel evoInfoPanel = new JPanel();    
    private final JPanel evoButtonPanel = new JPanel();
    // Area Buttons
    private final JButton area1Button = new JButton("Area 1");
    private final JButton area2Button = new JButton("Area 2");
    private final JButton area3Button = new JButton("Area 3");
    // Evolution Buttons
    private JButton buttonChooseCreatureOne = new JButton();
    private JButton buttonChooseCreatureTwo = new JButton();
    private JButton buttonStartEvolution = new JButton();
    // Movement Buttons
    private final JButton buttonUp = new JButton();
    private final JButton buttonDown = new JButton();
    private final JButton buttonLeft = new JButton();
    private final JButton buttonRight = new JButton();
    // Main Menu Buttons
    private final JButton buttonViewInventory = new JButton();
    private final JButton buttonExploreArea = new JButton();
    private final JButton buttonEvolveCreature = new JButton();
    private final JButton buttonEncounter = new JButton();
    private final JButton buttonExitGame = new JButton();
    //Creature Buttons
    private final JButton buttonCreatureStrawander = new JButton();
    private final JButton buttonCreatureChocowool = new JButton();
    private final JButton buttonCreatureParfwit = new JButton();
    private final JButton buttonCreatureBrownisaur = new JButton();
    private final JButton buttonCreatureFrubat = new JButton();
    private final JButton buttonCreatureMalts = new JButton();
    private final JButton buttonCreatureSquirpie = new JButton();
    private final JButton buttonCreatureChocolite = new JButton();
    private final JButton buttonCreatureOshacone = new JButton();
    //Encounter Buttons
    private final JButton buttonExit = new JButton();
    private final JButton buttonAttack = new JButton();
    private final JButton buttonSwap = new JButton();
    private final JButton buttonCatch = new JButton();
    private final JButton buttonRun = new JButton();
    //Inventory Buttons
    private final JButton buttonShowActiveCreature = new JButton();
    private final JButton buttonChangeActiveCreature = new JButton();
    //Creature Labels
    private final JLabel labelStrawander = new JLabel();
    private final JLabel labelChocowool = new JLabel();
    private final JLabel labelParfwit = new JLabel();
    private final JLabel labelBrownisaur = new JLabel();
    private final JLabel labelFrubat = new JLabel();
    private final JLabel labelMalts = new JLabel();
    private final JLabel labelSquirpie = new JLabel();
    private final JLabel labelChocolite = new JLabel();
    private final JLabel labelOshacone = new JLabel();
    //Inventory Labels
    private final JLabel labelCreatureImage = new JLabel();
    private final JLabel labelCreatureName = new JLabel();
    private final JLabel labelCreatureType = new JLabel();
    private final JLabel labelCreatureFamily = new JLabel();
    private final JLabel labelEvolutionLevel = new JLabel();
    //Encounter Labels
    private final JLabel labelEnemyHealth = new JLabel();
    private final JLabel labelEnemyImage = new JLabel();
    private final JLabel labelEnemyName = new JLabel();
    private final JLabel labelEnemyType = new JLabel();
    private final JLabel labelEnemyEL = new JLabel();
    private final JLabel labelActiveCreatureName = new JLabel();
    private final JLabel labelActiveCreatureEL = new JLabel(); 
    private final JLabel labelActiveCreatureType = new JLabel();
    //Evolution Labels
    private final JLabel labelCreatureOneImage = new JLabel();
    private final JLabel labelCreatureOneName = new JLabel();
    private final JLabel labelCreatureOneEL = new JLabel();
    private final JLabel labelCreatureTwoImage = new JLabel();
    private final JLabel labelCreatureTwoName = new JLabel();
    private final JLabel labelCreatureTwoEL = new JLabel();
    // Main Frame
    private final JFrame mainFrame = new JFrame("Foodémon");;
    // Encounter Frame
    private final JFrame encounterFrame = new JFrame("Encounter");
    // Evolution Frame
    private final JFrame evolutionFrame = new JFrame("Evolution Screen");

    private final ArrayList<JButton> inventoryButtonList = new ArrayList<>();

    public View() {
        // Create the main frame
        initializeMainFrame();

        // Hide the console output
        // System.setOut(null);
        // System.setErr(null);

        // Display the welcome message
        JOptionPane.showMessageDialog(null, "Welcome to Foodémon!");
        
        // Create the main panel

        // Initialize the starter creature selection panel
        initializeCreaturePanel();

        initializeMainMenuPanel();

        initalizeMAINPanel();

        // Create the view inventory panel
        initializeViewInventoryPanel();

        // Create the Encounter Frame and encounter stuff
        initializeEncounterFrame();

    
        // Create the evolution frame
        initializeEvolutionFrame();


        // Create a scrollable view for the creatureInfoPanel
        // this.scrollablePanel = new JScrollPane(creatureInfoPanel);
        // this.scrollablePanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // this.scrollablePanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        // this.scrollablePanel.setPreferredSize(new Dimension(500, 300));


        // exit panel button

        
        // Create the area1 panel
        initializeArea1Panel();

        // Create the area2 panel
        initializeArea2Panel();

        // Create the area3 panel
        initializeArea3Panel();

        // Create the exit button panel
        initializeExitButtonPanel();


        // Create the right panel
        initializeRightPanel();

        // Create the left panel
        initializeLeftPanel();

        // Create the main menu panel
        
        creaturePanel.setVisible(true);
        mainMenuPanel.setVisible(false);
               
        // Add all panels to the main panel

        mainFrame.add(panel);
        mainFrame.setVisible(true);

        setUpActionListeners();
    }


        public void encounterScreen() {
        encounterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        encounterFrame.setSize(900, 600);
        encounterFrame.setLocationRelativeTo(null);
        encounterFrame.setResizable(false);
        encounterFrame.setLayout(new BorderLayout());
    
        // Create the smaller window (JPanel) for enemy information

        enemyInfoPanel.setLayout(new BoxLayout(enemyInfoPanel, BoxLayout.Y_AXIS)); // Set layout to BoxLayout
        enemyInfoPanel.setPreferredSize(new Dimension(300, 300));
        enemyInfoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Add an image to the smaller window (placeholder, replace with actual path)
        enemyImageIcon.setImage(new ImageIcon("enemy.png").getImage());
        JLabel labelEnemyImage = new JLabel(enemyImageIcon);
        labelEnemyImage.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the image
        enemyInfoPanel.add(labelEnemyImage);

        // Add the enemy information labels
        labelEnemyName.setText("Name: " + labelEnemyName.getText());
        labelEnemyName.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label
        enemyInfoPanel.add(labelEnemyName);

        labelEnemyType.setText("Type: " + labelEnemyType.getText());
        labelEnemyType.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label
        enemyInfoPanel.add(labelEnemyType);

        labelEnemyEL.setText("EL: " + labelEnemyEL.getText());
        labelEnemyEL.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label
        enemyInfoPanel.add(labelEnemyEL);

        // Add the enemy's health
        labelEnemyHealth.setText("Health: " + labelEnemyHealth.getText());
        labelEnemyHealth.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label
        enemyInfoPanel.add(labelEnemyHealth);

        // Add the smaller window to the main encounter frame
        encounterFrame.add(enemyInfoPanel, BorderLayout.CENTER);
    
        // Add the active creature's name, EL, and type to the toolbar
        encounterToolBar.add(new JLabel("Active Creature: " + labelActiveCreatureName.getText()));
        encounterToolBar.add(new JLabel("EL: " + labelActiveCreatureEL.getText()));
        encounterToolBar.add(new JLabel("Type: " + labelActiveCreatureType.getText()+ " "));
        encounterToolBar.add(new JSeparator(SwingConstants.VERTICAL));
        encounterToolBar.add(buttonAttack);
        encounterToolBar.add(buttonSwap);
        encounterToolBar.add(buttonCatch);
        encounterToolBar.add(buttonRun);
        encounterFrame.add(encounterToolBar, BorderLayout.SOUTH);

        // Set preferred size for buttons
        buttonAttack.setPreferredSize(new Dimension(100, 100));
        buttonSwap.setPreferredSize(new Dimension(100, 100));
        buttonCatch.setPreferredSize(new Dimension(100, 100));
        buttonRun.setPreferredSize(new Dimension(100, 100));

            

        // Set up action listeners for buttons
        buttonAttack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle attack button click
            }
        });
    
        buttonSwap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle swap button click
            }
        });
    
        buttonCatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle catch button click
            }
        });
    
        buttonRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle run button click
                encounterFrame.dispose(); // Close the encounter screen
            }
        });
    
        // Make the frame visible
        encounterFrame.setVisible(true);
    }

    public void creatureSelected(int creatureNumber) {
        creaturePanel.setVisible(false);
        mainMenuPanel.setVisible(true);
    }

    public void viewInventory(String[][] creatures, String[] activeCreature) {
        // Clear existing components in the viewInventoryPanel
        viewInventoryPanel.removeAll();
        headerPanel.removeAll();
        creatureInfoPanel.removeAll();
        inventoryPanel.removeAll();
        inventoryButtonPanel.removeAll();

        headerPanel.setLayout(new GridLayout(1, 5, 10, 10));
        headerPanel.add(new JLabel("Creature"));
        headerPanel.add(new JLabel("Name"));
        headerPanel.add(new JLabel("Type"));
        headerPanel.add(new JLabel("Family"));
        headerPanel.add(new JLabel("Evolution Level"));

        creatureInfoPanel.setLayout(new BoxLayout(creatureInfoPanel, BoxLayout.Y_AXIS));
        String imagePath;

       // inventoryButtonList.

        // Loop through each creature
        for (int i = 0; i < creatures.length; i++) {
            // Create a panel to hold the creature image and information labels
            JPanel individualCreaturePanel = new JPanel();
            individualCreaturePanel.setLayout(new GridLayout(1, 5, 30, 10));
            imagePath = creatures[i][0];
            System.out.println(getClass().getResource(imagePath));
            individualCreaturePanel.add(new JLabel((new ImageIcon(imagePath))));
            individualCreaturePanel.add(new JButton(creatures[i][1]));
            individualCreaturePanel.add(new JLabel(creatures[i][2]));
            individualCreaturePanel.add(new JLabel(creatures[i][3]));
            individualCreaturePanel.add(new JLabel(creatures[i][4]));

            // Add individual creature panel to the main creatureInfoPanel
            creatureInfoPanel.add(individualCreaturePanel);
        }

        // Create a panel to hold the headers and scrollable panel

        inventoryPanel.setLayout(new BoxLayout(inventoryPanel, BoxLayout.Y_AXIS));
        inventoryPanel.add(headerPanel);

        // Create a scrollable view for the creatureInfoPanel
        JScrollPane scrollablePanel = new JScrollPane(creatureInfoPanel);
        scrollablePanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollablePanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollablePanel.setPreferredSize(new Dimension(800, 300));
        inventoryPanel.add(scrollablePanel);

        // Add the main panel to the main viewInventoryPanel
        viewInventoryPanel.add(inventoryPanel);
       
        // Set the preferred size for the buttons to make them smaller
        buttonShowActiveCreature.setPreferredSize(new Dimension(200, 80));
        buttonChangeActiveCreature.setPreferredSize(new Dimension(200, 80));

        // Add action listeners to the new buttons
        buttonShowActiveCreature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showActiveCreature();
            }
        });

        buttonChangeActiveCreature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeActiveCreature();
            }
        });

        // Create a button panel
        inventoryButtonPanel.add(buttonShowActiveCreature);
        inventoryButtonPanel.add(buttonChangeActiveCreature);

        // Add the button panel to the main viewInventoryPanel
        viewInventoryPanel.add(inventoryButtonPanel);

        // Display the viewInventoryPanel in a JOptionPane
        JOptionPane.showMessageDialog(null, viewInventoryPanel, "Inventory", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void exploreArea() {

        areaButtonPanel.add(area1Button);
        areaButtonPanel.add(area2Button);
        areaButtonPanel.add(area3Button);
    
        JOptionPane.showOptionDialog(null, areaButtonPanel, "Explore Area",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
    }
    
    public void exploreArea(int area) {
        panel.remove(area1Panel); 
        panel.remove(area2Panel); 
        panel.remove(area3Panel); 
        panel.remove(mainMenuPanel); 
    
        if (area == 1) {
            JOptionPane.showMessageDialog(null, "Exploring " + area);
            panel.add(area1Panel, BorderLayout.CENTER);
            mainFrame.setSize(800, 325);
            area1Panel.setVisible(true);
            buttonUp.setVisible(false);
            buttonDown.setVisible(false);
            buttonPanel.setVisible(true);
            rightPanel.setVisible(true);
            exitButtonPanel.setVisible(true);
    
        } else if (area == 2) {
            JOptionPane.showMessageDialog(null, "Exploring " + area);
            panel.add(area2Panel, BorderLayout.CENTER);   
            mainFrame.setSize(800, 325);
            area2Panel.setVisible(true);       
            buttonUp.setVisible(true);
            buttonDown.setVisible(true);
            buttonPanel.setVisible(true);
            rightPanel.setVisible(true);
            exitButtonPanel.setVisible(true);
    
        } else if (area == 3) {
            JOptionPane.showMessageDialog(null, "Exploring " + area);
            panel.add(area3Panel, BorderLayout.CENTER);
            mainFrame.setSize(800, 325);
            area3Panel.setVisible(true);
            buttonUp.setVisible(true);
            buttonDown.setVisible(true);
            buttonPanel.setVisible(true);
            rightPanel.setVisible(true);
            exitButtonPanel.setVisible(true);
    
        } else {
            panel.add(mainMenuPanel); 
        }
    
        panel.revalidate();
        panel.repaint();
    
        // Close the JOptionPane dialog
        JOptionPane.getRootFrame().dispose();
    }
    
    
    public void evolutionScreen(String creatureOneImage, String creatureOneName, int creatureOneEL, String creatureTwoImage, String creatureTwoName, int creatureTwoEL) {
        // Create the evolution frame
            evolutionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            evolutionFrame.setSize(600, 350);
            evolutionFrame.setLocationRelativeTo(null);
            evolutionFrame.setResizable(false);
    
            labelCreatureOneImage.setIcon(new ImageIcon(creatureOneImage));
            labelCreatureOneName.setText(creatureOneName);
            labelCreatureOneEL.setText(Integer.toString(creatureOneEL));
            labelCreatureTwoImage.setIcon(new ImageIcon(creatureTwoImage));
            labelCreatureTwoName.setText(creatureTwoName);
            labelCreatureTwoEL.setText(Integer.toString(creatureTwoEL));
    
            evoButtonPanel.add(buttonChooseCreatureOne);
            evoButtonPanel.add(buttonStartEvolution);
            evoButtonPanel.add(buttonChooseCreatureTwo);
    
            // Add components to the main panel
            evoMainPanel.add(evoInfoPanel, BorderLayout.CENTER);
            evoMainPanel.add(evoButtonPanel, BorderLayout.SOUTH);
    
            // Add the main panel to the frame
            evolutionFrame.add(evoMainPanel);
    
            // Set up action listeners for buttons
            buttonChooseCreatureOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // Handle choose creature ONE button click
            }
            });
    
            buttonChooseCreatureTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // Handle choose creature TWO button click
            }
            });
    
            buttonStartEvolution.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // Handle start evolution button click
            evolutionFrame.dispose(); // Close the evolution screen
            }
            });
    
            // Make the frame visible
            evolutionFrame.setVisible(true);
        }

    public void showActiveCreature() {
        // Assuming activeCreatureNumber is the active creature's number (e.g., 5)
        int activeCreatureNumber = 5;
    
        // Calculate the y-coordinate to scroll to based on the activeCreatureNumber
        int yCoordinate = (activeCreatureNumber - 1) * 120; // Adjust 120 based on your creature panel height
    
        // Get the JViewport associated with the scrollablePanel
        JViewport viewport = scrollablePanel.getViewport();
    
        // Scroll to the specified position (0 for x-coordinate, yCoordinate for y-coordinate)
        viewport.setViewPosition(new Point(0, yCoordinate));
    }
    

    public void changeActiveCreature() {
        // Implementation for changing the active creature
        // You can customize this based on your model and controller
    }
    
    public void evolveCreature() {
        JOptionPane.showMessageDialog(null, "Evolve Creature functionality not implemented yet.");
    }

    public void exitGame() {
        System.exit(0);
    }

    public void exitArea() {
        // Hide the current area panel and exit button panel
        panel.remove(area1Panel); 
        panel.remove(area2Panel); 
        panel.remove(area3Panel); 
        panel.add(mainMenuPanel); 
        rightPanel.setVisible(false);
        buttonPanel.setVisible(false);
        exitButtonPanel.setVisible(false);
        mainFrame.setSize(700, 360);
        
        panel.revalidate();
        panel.repaint();
    }


    public void initializeCreaturePanel() {
        creaturePanel.setLayout(new GridLayout(3, 3, 10, 10));

        // Set image icons for each creature button
        buttonCreatureStrawander.setIcon(new ImageIcon("resources/strawander.png"));
        buttonCreatureChocowool.setIcon(new ImageIcon("resources/chocowool.png"));
        buttonCreatureParfwit.setIcon(new ImageIcon("resources/parfwit.png"));
        buttonCreatureBrownisaur.setIcon(new ImageIcon("resources/brownisaur.png"));
        buttonCreatureFrubat.setIcon(new ImageIcon("resources/frubat.png"));
        buttonCreatureMalts.setIcon(new ImageIcon("resources/malts.png"));
        buttonCreatureSquirpie.setIcon(new ImageIcon("resources/squirpie.png"));
        buttonCreatureChocolite.setIcon(new ImageIcon("resources/chocolite.png"));
        buttonCreatureOshacone.setIcon(new ImageIcon("resources/oshacone.png"));

        // Set the preferred size of each creature button to make them square
        buttonCreatureStrawander.setPreferredSize(new Dimension(100, 100));
        buttonCreatureChocowool.setPreferredSize(new Dimension(100, 100));
        buttonCreatureParfwit.setPreferredSize(new Dimension(100, 100));
        buttonCreatureBrownisaur.setPreferredSize(new Dimension(100, 100));
        buttonCreatureFrubat.setPreferredSize(new Dimension(100, 100));
        buttonCreatureMalts.setPreferredSize(new Dimension(100, 100));
        buttonCreatureSquirpie.setPreferredSize(new Dimension(100, 100));
        buttonCreatureChocolite.setPreferredSize(new Dimension(100, 100));
        buttonCreatureOshacone.setPreferredSize(new Dimension(100, 100));

        // Set labels for creatures
        labelStrawander.setText("Strawander");
        labelChocowool.setText("Chocowool");
        labelParfwit.setText("Parfwit");
        labelBrownisaur.setText("Brownisaur");
        labelFrubat.setText("Frubat");
        labelMalts.setText("Malts");
        labelSquirpie.setText("Squirpie");
        labelChocolite.setText("Chocolite");
        labelOshacone.setText("Oshacone");

        // Adding to the panel
        creaturePanel.add(buttonCreatureStrawander);
        creaturePanel.add(labelStrawander);
        creaturePanel.add(buttonCreatureChocowool);
        creaturePanel.add(labelChocowool);
        creaturePanel.add(buttonCreatureParfwit);
        creaturePanel.add(labelParfwit);
        creaturePanel.add(buttonCreatureBrownisaur);
        creaturePanel.add(labelBrownisaur);
        creaturePanel.add(buttonCreatureFrubat);
        creaturePanel.add(labelFrubat);
        creaturePanel.add(buttonCreatureMalts);
        creaturePanel.add(labelMalts);
        creaturePanel.add(buttonCreatureSquirpie);
        creaturePanel.add(labelSquirpie);
        creaturePanel.add(buttonCreatureChocolite);
        creaturePanel.add(labelChocolite);
        creaturePanel.add(buttonCreatureOshacone);
        creaturePanel.add(labelOshacone);
    }

    public void initializeViewInventoryPanel() {
        viewInventoryPanel.setLayout(new GridLayout(6, 1, 10, 10));
        // Info Panel of pokemon
        labelCreatureImage.setIcon(new ImageIcon("resources/strawander.png"));
        labelCreatureName.setText("Strawander");
        labelCreatureType.setText("Fire");
        labelCreatureFamily.setText("A");
        labelEvolutionLevel.setText("1");
    
        // Create headers for the table
        headerPanel.setLayout(new GridLayout(1, 5, 10, 10));
        inventoryButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Button Panel for inventory
        buttonShowActiveCreature.setText("Show Active Creature");
        buttonChangeActiveCreature.setText("Change Active Creature");

        // Creature info panel
        creatureInfoPanel.setLayout(new BoxLayout(creatureInfoPanel, BoxLayout.Y_AXIS));
        scrollablePanel.setViewportView(creatureInfoPanel);
        scrollablePanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollablePanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollablePanel.setPreferredSize(new Dimension(500, 300));

    }

    public void initializeEncounterFrame() {
        encounterInfoPanel.setLayout(new GridLayout(3, 2));
        // Info Panel of pokemon
        labelEnemyImage.setIcon(new ImageIcon("enemy.png"));
        labelEnemyName.setText("Enemy Name");
        labelEnemyType.setText("Enemy Type");
        labelEnemyEL.setText("Enemy EL");
        labelActiveCreatureName.setText("Active Creature Name");
        labelActiveCreatureType.setText("Active Creature Type");
        labelActiveCreatureEL.setText("Active Creature EL");

        // Button Panel for encounter
        encounterButtonPanel.setLayout(new GridLayout(1, 4));
        buttonAttack.setText("Attack");
        buttonSwap.setText("Swap");
        buttonCatch.setText("Catch");
        buttonRun.setText("Run");

        // encounter panel
        encounterMainPanel.setLayout(new BorderLayout());
    }

    public void initializeMainFrame() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(700, 360);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
    }

    public void initializeEvolutionFrame() {
        evoMainPanel.setLayout(new BorderLayout());
        evoInfoPanel.setLayout(new GridLayout(3, 2));
        evoButtonPanel.setLayout(new GridLayout(1, 3));
        buttonChooseCreatureOne.setText("Choose");
        buttonChooseCreatureTwo.setText("Choose");
        buttonStartEvolution.setText("Evolve");
    }

    public void initializeArea1Panel() {
        area1Panel.setLayout(new GridLayout(1, 5, 0, 0));
        for (int i = 0; i < 5; i++) {
            JPanel whiteBox1 = new JPanel();
            whiteBox1.setBackground(Color.WHITE);
            whiteBox1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            int boxWidth = 50;
            int boxHeight = 50;
            whiteBox1.setPreferredSize(new Dimension(boxWidth, boxHeight));
            area1Panel.add(whiteBox1);
            area1Boxes[i] = playerbox; // Store the JPanel object in the array
        }
        area1Panel.setVisible(false); // Initially hide the area1 panel
    }
    
    public void updatePlayerPosition(int position) {
        // Reset all boxes to white
        for (JPanel playerBox : area1Boxes) {
            playerBox.setBackground(Color.WHITE);
        }
        // Set the player's box to blue
        area1Boxes[position].setBackground(Color.BLUE);
    }
    
    public void initializeArea2Panel() {
        area2Panel.setLayout(new GridLayout(3, 3, 0, 0));
        for (int i = 1; i <= 9; i++) {
            JPanel whiteBox2 = new JPanel();
            whiteBox2.setBackground(Color.WHITE);
            whiteBox2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            int boxSize = 166;
            whiteBox2.setPreferredSize(new Dimension(boxSize, boxSize));
            area2Panel.add(whiteBox2);
        }
        area2Panel.setVisible(false); // Initially hide the area2 panel
    }

    public void initializeArea3Panel() {
        area3Panel.setLayout(new GridLayout(4, 4, 0, 0));
        for (int i = 1; i <= 16; i++) {
            JPanel whiteBox3 = new JPanel();
            whiteBox3.setBackground(Color.WHITE);
            whiteBox3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            int boxSize = 125;
            whiteBox3.setPreferredSize(new Dimension(boxSize, boxSize));
            area3Panel.add(whiteBox3);
        }
        area3Panel.setVisible(false); // Initially hide the area3 panel
    }

    public void initializeExitButtonPanel() {
        buttonExit.setText("Exit");
        buttonExit.setPreferredSize(new Dimension(100, 100));
        exitButtonPanel.setLayout(new GridLayout(1, 1, 10, 10));
        buttonExit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exitButtonPanel.add(buttonExit);
        exitButtonPanel.setVisible(false); // Initially hide the exit button panel
    }

    public void initializeRightPanel() {
        rightPanel.setLayout(new GridLayout(3, 1, 10, 10));
        rightPanel.add(new JPanel());
        rightPanel.add(new JPanel());
        rightPanel.add(exitButtonPanel);
        rightPanel.setVisible(false);
    }

    public void initializeLeftPanel() {
        leftPanel.setLayout(new BorderLayout());

        buttonUp.setText("Up");
        buttonDown.setText("Down");
        buttonLeft.setText("Left");
        buttonRight.setText("Right");

        // set size
        buttonUp.setPreferredSize(new Dimension(100, 100));
        buttonDown.setPreferredSize(new Dimension(100, 100));
        buttonLeft.setPreferredSize(new Dimension(100, 100));
        buttonRight.setPreferredSize(new Dimension(100, 100));


        // settingup button panel
        buttonPanel.setLayout(new GridLayout(3, 3, 0, 0));
        buttonPanel.add(new JLabel());
        buttonPanel.add(buttonUp);
        buttonPanel.add(new JLabel());
        buttonPanel.add(buttonLeft);
        blackBoxLeft.setBackground(Color.BLACK);
        blackBoxLeft.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        blackBoxLeft.setPreferredSize(new Dimension(100, 100));
        buttonPanel.add(blackBoxLeft);
        buttonPanel.add(buttonRight);
        buttonPanel.add(new JLabel());
        buttonPanel.add(buttonDown);
        buttonPanel.add(new JLabel());
        buttonPanel.setVisible(false); // Initially hide the button panel

   
        leftPanel.add(buttonPanel, BorderLayout.CENTER);
    }

    public void initializeMainMenuPanel() {
        mainMenuPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonViewInventory.setText("View Inventory");
        buttonExploreArea.setText("Explore an Area");
        buttonEvolveCreature.setText("Evolve Creature");
        buttonEncounter.setText("Encounter");
        buttonExitGame.setText("Exit");

        
        mainMenuPanel.add(buttonViewInventory);
        mainMenuPanel.add(buttonExploreArea);
        mainMenuPanel.add(buttonEvolveCreature);
        mainMenuPanel.add(buttonEncounter);
        mainMenuPanel.add(buttonExitGame);
        mainMenuPanel.setVisible(false); // Initially hide the main menu panel
    }

    public void initalizeMAINPanel() {
        panel.setLayout(new BorderLayout());
        panel.add(creaturePanel, BorderLayout.NORTH);
        panel.add(rightPanel, BorderLayout.EAST);
        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(mainMenuPanel, BorderLayout.CENTER);
    }

    public void setButtonViewInventoryListener(ActionListener action) {
        buttonViewInventory.addActionListener(action);
    }

    // To be removed
    public void setUpActionListeners() {
        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exitArea();
            }
        });

        // buttonViewInventory.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         viewInventory();
        //     }
        // });

        buttonExploreArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exploreArea();
            }
        });

        buttonEvolveCreature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                evolutionScreen("creature1.png", "Creature One", 10, "creature2.png", "Creature Two", 15);
            }
        });

    }

    // Button Getters
    public JButton getButtonEncounter() {
        return buttonEncounter;
    }

    public JButton getButtonExitGame() {
        return buttonExitGame;
    }

    // Starter Creature Buttons
    public JButton getButtonCreatureStrawander() {
        return buttonCreatureStrawander;
    }

    public JButton getButtonCreatureChocowool() {
        return buttonCreatureChocowool;
    }

    public JButton getButtonCreatureParfwit() {
        return buttonCreatureParfwit;
    }

    public JButton getButtonCreatureBrownisaur() {
        return buttonCreatureBrownisaur;
    }

    public JButton getButtonCreatureFrubat() {
        return buttonCreatureFrubat;
    }

    public JButton getButtonCreatureMalts() {
        return buttonCreatureMalts;
    }

    public JButton getButtonCreatureSquirpie() {
        return buttonCreatureSquirpie;
    }

    public JButton getButtonCreatureChocolite() {
        return buttonCreatureChocolite;
    }

    public JButton getButtonCreatureOshacone() {
        return buttonCreatureOshacone;
    }

    //Area Button Getters

    public JButton getButtonArea1() {
        return area1Button;
    }

    public JButton getButtonArea2() {
        return area2Button;
    }

    public JButton getButtonArea3() {
        return area3Button;
    }

    //Area Movement Button Getters

    public JButton getButtonUp() {
        return buttonUp;
    }
    public JButton getButtonDown() {
        return buttonDown;
    }
    public JButton getButtonLeft() {
        return buttonLeft;
    }
    public JButton getButtonRight() {
        return buttonRight;
    }

}

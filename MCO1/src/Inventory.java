import java.util.ArrayList;

 /**
  * This class represents an inventory of weapons.
  */
 public class Inventory {

     /**
      * The list of owned weapons in the inventory.
      */
     private ArrayList<Weapons> ownedWeaponsList;

     /**
      * The equipped weapon in the inventory.
      */
     private Weapons equippedWeapon;

    /**
     * Creates a character to compare the user's dexterity to a weapon.
     */
     private Character character = new Character();

     /**
      * The maximum capacity of the inventory.
      */
     private int maxCapacity;

     /** 
      * This constructor creates an inventory with an empty list of owned weapons and a maximum capacity of 16.
      * 
     */
     public Inventory() {
         ownedWeaponsList = new ArrayList<>();
         maxCapacity = 16; 
     }

     /** 
      *  This method shows the list of owned Weapons.
      * 
     */
     public void showWeaponsList() {
         for (Weapons weapons : ownedWeaponsList) {
            System.out.println(weapons.getWeaponName());
         }
     }

     /** 
      *  This method shows the equipped weapon.
      * 
     */
     public void showEquippedWeapon() {
         System.out.println("Equipped Weapon: " + equippedWeapon.getWeaponName());
     }


     /** 
      * This method returns the list of owned weapons.
      * @return The list of owned weapons
      * 
     */
     public ArrayList<Weapons> getOwnedWeaponsList() {
         return ownedWeaponsList;
     }

     /** 
      * This method adds a weapon to the inventory.
      * @param weapons The weapon to be added
      * 
     */
     public void addWeapon(Weapons weapons) {
         if (ownedWeaponsList.size() < maxCapacity) {
            ownedWeaponsList.add(weapons);
         } else {
             System.out.println("Inventory is full. Cannot add more weapons.");
         }
     }


     /** 
      * This method swaps the equipped weapon.
      * @param newEquippedWeapon The new Equipped Weapon
      * 
     */
     public void swapEquippedWeapon(Weapons newEquippedWeapon) {
        if(character.getLevelDexterity() >= newEquippedWeapon.getWeaponDexterity()){
            equippedWeapon = newEquippedWeapon;
            System.out.println("Equipped Weapon has been swapped to: " + equippedWeapon.getWeaponName());
        }
        else{
            System.out.println("The weapon's dexterity is too high. ");
        }
     }

     /** 
      * This method selects a weapon from the inventory.
      * @param weaponName The weapon to be selected
      * @return The weapon to be selected
      * 
     */
     public Weapons selectWeapon(String weaponName) {
         for (Weapons weapons : ownedWeaponsList) {
             if (weapons.getWeaponName().equals(weaponName)){
                if(character.getLevelDexterity() >= weapons.getWeaponDexterity()){
                    System.out.println("Weapon" + weaponName + " has been selected.");
                    changeEquippedWeapon(weapons);
                    return weapons;
                }
                else{
                    System.out.println("The weapon's dexterity is too high. ");
                }
             }
         }
         System.out.println("Weapon " + weaponName + " not found in the inventory.");
         return null;
     }

     /** 
      * This method shows the details of the owned Weapons.
      * 
     */
     public void showOwnedWeaponsDetails() {
         for (Weapons weapons : ownedWeaponsList) {
            System.out.println("---------------------------------");
            System.out.println("Index: " + weapons.getWeaponIndex());
            System.out.println("Name: " + weapons.getWeaponName());
            System.out.println("Dex: " + weapons.getWeaponDexterity());
            System.out.println("HP: " + weapons.getWeaponHp());
            System.out.println("End: " + weapons.getWeaponEndurance());
            System.out.println("Str: " + weapons.getWeaponStrength());
            System.out.println("Int: " + weapons.getWeaponIntelligence());
            System.out.println("Fth: " + weapons.getWeaponFaith());
            System.out.println("---------------------------------");
         }
     }

     /**
      *  This method shows the details of the Equipped Weapon.
      *  
      */
     public void showEquippedWeaponDetails() {
         if (equippedWeapon != null) {
            System.out.println("---------------------------------");
            System.out.println("Index: " + equippedWeapon.getWeaponIndex());
            System.out.println("Name: " + equippedWeapon.getWeaponName());
            System.out.println("Dex: " + equippedWeapon.getWeaponDexterity());
            System.out.println("HP: " + equippedWeapon.getWeaponHp());
            System.out.println("End: " + equippedWeapon.getWeaponEndurance());
            System.out.println("Str: " + equippedWeapon.getWeaponStrength());
            System.out.println("Int: " + equippedWeapon.getWeaponIntelligence());
            System.out.println("Fth: " + equippedWeapon.getWeaponFaith());
            System.out.println("---------------------------------");
         } else {
             System.out.println("No Equipped Weapon set.");
         }
     }

     /** 
      *  This method changes the equipped weapon.
      * @param newEquippedWeapon The new equipped weapon
      * 
     */
     public void changeEquippedWeapon(Weapons newEquippedWeapon) {
       
         if(character.getLevelDexterity() >= newEquippedWeapon.getWeaponDexterity()){
            equippedWeapon = newEquippedWeapon;
            System.out.println("Equipped Weapon has been changed to: " + equippedWeapon.getWeaponName());
        }
        else{
            System.out.println("The weapon's dexterity is too high. ");
        }
     }

     /** 
      * This method returns the Equipped Weapon.
      * @return The equipped weapon
      * 
     */
     public Weapons getEquippedWeapon() {
         return equippedWeapon;
     }

 }

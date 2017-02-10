/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;




/**
 *
 * @author Justen
 */
public class SwordsAndHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player newGuy=new Player();
       newGuy.setName("falk firebeard");
       newGuy.setProgress(0);
       
       CharacterTrait dragon= new CharacterTrait();
       dragon.setCoordinateX(1);
       dragon.setCoordinateY(1);
       dragon.setDexterity(1);
       dragon.setHealth(1);
       dragon.setMana(1);
       dragon.setStrength(1);
       dragon.setWisdom(1);
       
       Armor Helmet=new Armor();
       Helmet.setDefenseBonus(3);
       
        Weapon sword= new Weapon();
        sword.setDamage(1);
        
        Item scroll= new Item();
        scroll.setCost(1);
        scroll.setInventorySpace(2);
        
        Map gameMap=new Map();
        gameMap.setHexColumn(2);
        gameMap.setHexRow(1);
        
        Location beach= new Location();
        beach.setColumn(1);
        beach.setHasItem(0);
        beach.setRow(1);
        
       Scene boatBuild= new Scene();
       boatBuild.setDescription("crazyness");
       boatBuild.setPassable(1);
       
       Inventory playOne= new Inventory();
       playOne.setGold(10);
       playOne.setSpaces(1);
       
       String testChar= dragon.toString();
       String testPlayer=newGuy.toString();
       
       String testWeapon=sword.toString();
       String testItem=scroll.toString();
       String testMap=gameMap.toString();
       String testLocation=beach.toString();
       String testScene=boatBuild.toString();
       String testInventory=playOne.toString();
       
       System.out.println(testChar);
        System.out.println(testPlayer);
        
        System.out.println(testWeapon);
        System.out.println(testItem);
        System.out.println(testMap);
        System.out.println(testLocation);
        System.out.println(testScene);
       System.out.println(testInventory);
        
      CharacterTrait ranger= new CharacterTrait();
        ranger.setStrength(3);
        ranger.setDexterity(5);
        ranger.setWisdom(1);
        ranger.setType("ranger");
        ranger.setHealth(50);
        ranger.setMana(0);
        ranger.setCoordinateX(0);
        ranger.setCoordinateY(0);
        ranger.setDefenseValue(15);
        
        CharacterTrait warrior = new CharacterTrait();
        warrior.setStrength(5);
        warrior.setDexterity(3);
        warrior.setWisdom(1);
        warrior.setHealth(70);
        warrior.setMana(0);
        warrior.setType("warrior");
        warrior.setCoordinateX(0);
        warrior.setCoordinateY(0);
        warrior.setDefenseValue(15);
        
        CharacterTrait wizard = new CharacterTrait();
        wizard.setWisdom(5);
        wizard.setDexterity(3);
        wizard.setStrength(1);
        wizard.setHealth(40);
        wizard.setMana(100);
        wizard.setCoordinateX(0);
        wizard.setCoordinateY(0);
        wizard.setType("wizard");
        wizard.setDefenseValue(13);
        
        CharacterTrait cyclops= new CharacterTrait();
        cyclops.setStrength(5);
        cyclops.setDexterity(1);
        cyclops.setWisdom(3.5);
        cyclops.setDefenseValue(20);
        cyclops.setHealth(80);
        cyclops.setMana(30);
        cyclops.setType("cyclops");
        cyclops.setCoordinateX(0);
        cyclops.setCoordinateY(0);
            }
    
        
      
       
       
       
       
       
    }
    


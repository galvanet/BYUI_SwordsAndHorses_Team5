/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.model;

import byui.cit260.swords.control.CastCreator;




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
        
     CastCreator testA= new CastCreator();
        
     System.out.println();
    
        
      
       
       
       
       
    }   
    }
    


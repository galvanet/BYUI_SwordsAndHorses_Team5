/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swordsandhorses;

import byui.cit260.swords.model.CharacterTrait;
import byui.cit260.swords.model.Location;
import byui.cit260.swords.model.Map;
import byui.cit260.swords.model.Player;
import byui.cit260.swords.model.Scene;
import byui.cit260.swordsAndHorses.model.Armor;
import byui.cit260.swordsAndHorses.model.Item;
import byui.cit260.swordsAndHorses.model.Weapon;

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
       dragon.setCoordinates(1,1);
       dragon.setDexterity(1);
       dragon.setHealth(1);
       dragon.setMana(1);
       dragon.setStrength(1);
       dragon.setWisdom(1);
       
       Armor helmet=new Armor();
       helmet.setDefenseBonus(1);
       
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
       
       String testChar= dragon.toString();
       String testPlayer=newGuy.toString();
       String testArmor=helmet.toString();
       String testWeapon=sword.toString();
       String testItem=scroll.toString();
       String testMap=gameMap.toString();
       String testLocation=beach.toString();
       String testScene=boatBuild.toString();
       
       System.out.println(testChar);
        System.out.println(testPlayer);
        System.out.println(testArmor);
        System.out.println(testWeapon);
        System.out.println(testItem);
        System.out.println(testMap);
        System.out.println(testLocation);
        System.out.println(testScene);
        
        
        
       
       
       
       
       
    }
    
}

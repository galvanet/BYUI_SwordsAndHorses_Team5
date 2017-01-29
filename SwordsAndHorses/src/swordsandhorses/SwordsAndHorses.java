/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swordsandhorses;

import byui.cit260.swords.model.Location;
import byui.cit260.swords.model.Map;
import byui.cit260.swordsAndHorses.model.Armor;
import byui.cit260.swordsAndHorses.model.Item;
import byui.cit260.swordsAndHorses.model.Player;

/**
 *
 * @author Justen
 */
public class SwordsAndHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map gameMap= new Map();
       gameMap.setHexColumn(1);
       gameMap.setHexRow(1);
       
       String gameMapInfo= gameMap.toString();
       System.out.println(gameMapInfo); 
       
       Armor chestpiece= new Armor();
       chestpiece.setDefenseBonus(1);
        
       String chestpieceInfo= chestpiece.toString();
       System.out.println(chestpieceInfo);
       
       Item scroll= new Item();
       scroll.setCost(1);
       scroll.setInventorySpace(10);
       
       String scrollInfo= scroll.toString();
       System.out.println(scrollInfo);
       
       Location tower=new Location();
       tower.setColumn(01);
       tower.setHasItem(1);
       tower.setRow(1);
       
       String towerInfo= tower.toString();
       System.out.println(towerInfo);
       
       Player newGuy= new Player();
       newGuy.setName
       
       
       
    }
    
}

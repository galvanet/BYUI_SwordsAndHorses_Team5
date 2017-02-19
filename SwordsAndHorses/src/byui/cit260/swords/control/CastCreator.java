/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swords.control;

import byui.cit260.swords.model.CharacterTrait;

/**
 *
 * @author Justen
 */
public class CastCreator {

    public CastCreator() {
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

    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.GameControl;
import byui.cit260.swordsAndHorses.model.Player;
import byui.cit260.swordsAndHorses.model.SwordsAndHorses;
import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){ 
        
    this.promptMessage = "Please enter your name:";
    
    this.displayBanner();
    
    this.getPlayersName();
    

    }

    public void displayBanner() {
          
        System.out.println(
                 "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
               + "\n~                                                     ~"
               + "\n~ This is the game of Swords & Horses. You are about  ~"
               + "\n~ to go on a quest to save the King's daughter. The   ~"
               + "\n~ only way to do so, is to go into the Dragon Wilds   ~"
               + "\n~ to slay a dragon and bring back its heart. The      ~"
               + "\n~ heart will break a witches curse placed upon the    ~"
               + "\n~ the King's daughter.                                ~"
               + "\n~                                                     ~"
               + "\n~ You will select a character class: Wizard, Ranger   ~"
               + "\n~ or Warrior.                                         ~"
               + "\n~                                                     ~"
               + "\n~ You will visit several locations on your way        ~"
               + "\n~ to the Dragaon Wilds.                               ~"
               + "\n~                                                     ~"
               + "\n~ You will face many challenges that will test your   ~"
               + "\n~ abilities.                                          ~"
               + "\n~                                                     ~"
               + "\n~ Good luck and have fun on your adventure!           ~"
               + "\n~                                                     ~"
               + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"        
               );
    }

    public void displayStartProgramView() {
        //System.out.println("\n*** displayStartProgram() function called***");
        
        boolean done = false;
        
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        } while (!done);
        
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }   
            
            break;           
        }
        
        return value;
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
        return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
        
        
    }

    private void displayNextView(Player player) {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         );
        
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.displayMainMenuView();
        
        
        
        
        
    }
    
   
    
    
}



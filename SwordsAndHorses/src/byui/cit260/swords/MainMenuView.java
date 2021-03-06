/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.GameControl;
import byui.cit260.swordsAndHorses.model.SwordsAndHorses;
import java.util.Scanner;

import byui.cit260.swordsAndHorses.view.HelpMenuView;

/**
 *
 * @author andre_000
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        
        this.menu = "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n| Main Menu                              |"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nI - Go to the Inventory Menu"
                  + "\n6 - Go to Story #6"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
    
    
    

    public void displayMainMenuView() {
        
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "N":
                this.startNewGame();
                break;      
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "I":
                this.displayInventoryMenu();
                break;
            case "6":
                this.displayStorySix();
                break;    
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                        
        return false;
        
        
    }

    private void startNewGame() {
        GameControl.createNewGame(SwordsAndHorses.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        //System.out.println("*** displayHelpMenu function called ***");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
        
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayInventoryMenu() {
        InventoryMenuView inventoryMenuView = new InventoryMenuView();
        inventoryMenuView.displayInventoryMenuView();
    }

    private void displayStorySix() {
        //System.out.println("*** displayStorySix function called ***");
        StorySixView storySixView = new StorySixView();
        storySixView.displayStorySix();
    }
    

}

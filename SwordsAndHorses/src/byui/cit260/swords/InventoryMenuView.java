/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class InventoryMenuView {
    
    private String menu;
    
    public InventoryMenuView() {
    
    this.menu = "\n"
              + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
              + "\n| Inventory Menu                         |"
              + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
              + "\nG - Get current inventory list"
              + "\nA - Add item to the inventory"
              + "\nR - Remove item from the inventory"
              + "\nQ - Quit"
              + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    
    }
    
    public void displayInventoryMenuView() {
        
        boolean done = false;
        do{
            String inventoryMenuOption = this.getInventoryMenuOption();
            if (inventoryMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doInventoryAction(inventoryMenuOption);
            
        } while (!done);
        
    }
    
    private String getInventoryMenuOption() {
        
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
    
    public boolean doInventoryAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "G":
                this.getInventoryList();
                break;
            case "A":
                this.addToInventory();
                break;
            case "R":
                this.removeFromInventory();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                        
        return false;
        
        
    }

    private void getInventoryList() {
        System.out.println("*** getInventoryList function called ***");
    }

    private void addToInventory() {
        System.out.println("*** addToInventory function called ***");
    }

    private void removeFromInventory() {
        System.out.println("*** removeFromInventory function called ***");
    }
    
    
}

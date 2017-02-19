/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui_swordsandhorses_team5;
import cit260.byui.swordsAndHorses.model.Player.setBestTime;
/**
 *
 * @author Eduardo y Sandra
 */
public class Byui_SwordsAndHorses_Team5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Player playerOne = new Player();
    
    playerOne.setName("Eduardo");
    playerOne.setBestTime(7.00);
    
    String playerInfo = playerOne.toString();
    System.out.println(playerInfo);
    
    }
    
}

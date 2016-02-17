/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author jacob bloomfield
 */
public class StartProgramView {
    String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name :";
        //display banner when class is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println("\n");
    }

    public void displayStartProgramView() {
        System.out.println("\n***displayStartProgramView function called***");
    }
    
    
}

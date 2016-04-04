/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author Andrew
 */
public class BlacksmithView extends View {
    
    public BlacksmithView(){
        super("\n************************************************************\n" +
                "*----Blacksmith Menu---------------------------------------*\n" +
                "*--------What can I do for you?----------------------------*\n" +
                "*----------------------------------------------------------*\n" +
                "*----[A] - Enhance your Armor (Armor bonus)?---------------*\n" +
                "*----[W] - Enhance your Weapon (Weapon bonus)?-------------*\n" +
                "*----[Q] - Return to town----------------------------------*\n" +
                "************************************************************");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "A": // create and start a new game
                this.addArmorBonus();
                break;
            case "W": // display the help menu
                this.addWeaponBonus();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void addArmorBonus() {
        ArmorBonusView ab = new ArmorBonusView();
        ab.display();
        
    }

    private void addWeaponBonus() {
        WeaponBonusView wb = new WeaponBonusView();
        wb.display();
    }


}

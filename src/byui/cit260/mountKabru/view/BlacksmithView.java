/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import byui.cit260.mountKabru.control.QuestControl;
import byui.cit260.mountKabru.model.Game;
import byui.cit260.mountKabru.model.QuestList;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public class BlacksmithView extends View {
    
    Game game = MountKabru.getCurrentGame();
    
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
                if (game.getActor().getInventory().getShillings() >= 100)
                    this.addArmorBonus();
                else
                    this.console.println("Not enough Shillings");
                break;
                
            case "W": // display the help menu
                if (game.getActor().getInventory().getShillings() >= 100)
                    this.addWeaponBonus();
                else
                    this.console.println("Not enough shillings");
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
        if (game.getLocations().getBlacksmith().getArmorBonus() == 2){
            QuestControl qc = new QuestControl();
            qc.updateQuest(QuestList.UpgradeArmor.getQUESTDETAILS());
        }
        
    }

    private void addWeaponBonus() {
        WeaponBonusView wb = new WeaponBonusView();
        wb.display();
        if (game.getLocations().getBlacksmith().getWeaponBonus() == 2){
            QuestControl qc = new QuestControl();
            qc.updateQuest(QuestList.UpgradeWeapon.getQUESTDETAILS());
        }
    }


}

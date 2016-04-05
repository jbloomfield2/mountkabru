/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author jacob bloomfield
 */
public enum QuestList implements Serializable {
    
    KillSpiders("kill 5 spiders",5,100,200),
    UpgradeArmor("Upgrade your Armor",1,25,75),
    UpgradeWeapon("Upgrade your Weapon",1,25,75),
    Win20Battles("Win 20 battles",20,100,200),
    UseAnAbility("Use an ability 5 times in battle",5,100,200);
    
    
    private final String QUESTDETAILS;
    private final double REWARDSHILLINGS;
    private final double REWARDXP;
    private final int objective;

     QuestList(String questDetails,int objective, double rewardShillings, double rewardXp) {
         this.QUESTDETAILS = questDetails;
         this.REWARDSHILLINGS = rewardShillings;
         this.REWARDXP = rewardXp;
         this.objective = objective;
    }

    public String getQUESTDETAILS() {
        return QUESTDETAILS;
    }

    public double getREWARDSHILLINGS() {
        return REWARDSHILLINGS;
    }

    public int getObjective() {
        return objective;
    }

    public double getREWARDXP() {
        return REWARDXP;
    }

    
    


    @Override
    public String toString() {
        return "Quest{" + "QUESTDETAILS=" + QUESTDETAILS + ", progress="  + ", REWARDSHILLINGS=" + REWARDSHILLINGS + ", REWARDXP=" + REWARDXP + '}';
    }

    
    

    

   
    
    
}

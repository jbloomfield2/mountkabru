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
public enum Quest implements Serializable {
    
    KillSpiders("kill 5 spiders",0,100,200),
    UpgradeArmor("Upgrade your Armor",0,100,200),
    UpgradeWeapon("Upgrade your Weapon",0,100,200),
    Win20Battles("Win 20 battles",0,100,200),
    UseAnAbility("Use an ability 5 times in battle",0,100,200);
    
    
    private final String QUESTDETAILS;
    private String progress;
    private final double REWARDSHILLINGS;
    private final double REWARDXP;

     Quest(String questDetails, double progress, double rewardShillings, double rewardXp) {
         this.QUESTDETAILS = questDetails;
         this.progress = this.progress;
         this.REWARDSHILLINGS = rewardShillings;
         this.REWARDXP = rewardXp;
    }

    public String getQUESTDETAILS() {
        return QUESTDETAILS;
    }

    public double getREWARDSHILLINGS() {
        return REWARDSHILLINGS;
    }

    public double getREWARDXP() {
        return REWARDXP;
    }

    
    

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Quest{" + "QUESTDETAILS=" + QUESTDETAILS + ", progress=" + progress + ", REWARDSHILLINGS=" + REWARDSHILLINGS + ", REWARDXP=" + REWARDXP + '}';
    }

    
    

    

   
    
    
}

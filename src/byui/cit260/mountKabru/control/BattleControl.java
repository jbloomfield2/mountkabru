/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.control;
import java.util.Random;

/**
 *
 * @author jacob bloomfield
 */
public class BattleControl {
    
    public int attack(int atk,int atkBonus,int def){
        Random rng = new Random();
        int totalAttack = 0;
        
        //check for vaild range
        if (atk < 1)
            return -1;
        
        if (atk > 50)
            return 50; //50 is the highest possible damage
        
        if (atkBonus < 1)
            return -1;
        
        if (atkBonus > 50)
            return 50;
        
        if (def < 1)
            return -1;
        
        if (def > 50)
            return -1;
            
        //now we know data is within acceptable bounds
        totalAttack = atk + atkBonus;
        totalAttack -= def;
        
        //return a 0 if defense causes damge to be negative
        if (totalAttack < 0)
            return 0;
    
        return totalAttack;
    }
    
    public int spell(int mana,int manaBonus,int def){
        Random rng = new Random();
        int totalSpell = 0;
        
        //check for vaild range
        if (mana < 1)
            return -1;
        
        if (mana > 50)
            return 50; //50 is the highest possible damage
        
        if (manaBonus < 1)
            return -1;
        
        if (manaBonus > 50)
            return 50;
        
        if (def < 1)
            return -1;
        
        if (def > 50)
            return -1;
            
        //now we know data is within acceptable bounds
        totalSpell = mana + manaBonus;
        totalSpell -= def;
        
        //return a 0 if defense causes damge to be negative
        if (totalSpell < 0)
            return 0;
    
        return totalSpell;
    }
}

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
public class ActorControl {
    
    public int talkToActor(int level){
          Random rng = new Random();
           int responce = 0;
           
           if (level == 2)
               return 1;
           
           if (level == 4)
               return 2;
                       
           if (level == 6)
               return 3;
                       
           if (level == 8)
               return 4;
           
           if (level == 10)
               return 5;
           
           if (level == 12)
               return 6;
           
           if (level == 14)
               return 7;
           
           if (level == 16)
               return 8;
           
           if (level == 18)
               return 9;
           
           if (level == 20)
               return 10;
           
          int respond = rng.nextInt(10);
          respond += 10;
          
          return respond;
          
    }
}

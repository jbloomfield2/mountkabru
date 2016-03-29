/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 *
 * @author jacob bloomfield
 */
public enum TavernKeepResponses implements Serializable {
    Response1("Don't forget to check out the Pit to train a little bit."),
    Response2("Check out the blacksmith. He can upgrade your weapons and armor."),
    Response3("I'm having a sell on potions. They are the same price but I'm still selling them."),
    Response4("Thanks for fighting all those monsters for us."),
    Response5("I love going to the plains. Despite the monsters it is still beautiful."),
    Response6("Where is everyone in town, you ask? They are hiding for the monsters."),
    Response7("Like the guy in the 100 shillings armor is going to talk to the guy that makes that much in a month."),
    Response8("Take a break and get some sleep."),
    Response9("Hows the adventure going? You make it to the Jungle, yet?"),
    Response10("That master on the top of the mountain is a real jerk. He created all these monsters."),
    Response11("Some one should do something about that guy on the top of the mountain."),
    Response12("Thanks for talking to me. No one in town ever comes and visits anymore."),
    Response13("Hows the blacksmith doing? Can you believe his name is actually 'Smith'?"),
    Response14("You make it to the High Forest, yet? I have never gotten that high up the mountain."),
    Response15("How did you get that strong? You do crossfit?"),
    Response16("I feel like I am doing all the talking in our relationship"),
    Response17("Do monsters have families? Or are they just created?"),
    Response18("You want anything to drink? Just kidding. All I have are potions"),
    Response19("You enjoying our town that is being terrorized by monsters"),
    Response20("If you ever get tired, feel free to take a nap");
    
    
    
    private final String RESPONSE;

    private TavernKeepResponses(String RESPONSE) {
        this.RESPONSE = RESPONSE;
    }

    public String getRESPONSE() {
        return RESPONSE;
    }
    
    
    

}

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
    Response1(""),
    Response2(""),
    Response3(""),
    Response4(""),
    Response5(""),
    Response6(""),
    Response7(""),
    Response8(""),
    Response9(""),
    Response10(""),
    Response11("1"),
    Response12("2"),
    Response13("3"),
    Response14("4"),
    Response15("5"),
    Response16("6"),
    Response17("7"),
    Response18("8"),
    Response19("9"),
    Response20("10");
    
    
    
    private final String RESPONSE;

    private TavernKeepResponses(String RESPONSE) {
        this.RESPONSE = RESPONSE;
    }

    public String getRESPONSE() {
        return RESPONSE;
    }
    
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mountkabru.MountKabru;

/**
 *
 * @author Andrew
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = MountKabru.getInFile();
    protected final PrintWriter console = MountKabru.getOutFile();
    
    public View(){   
    }
    
    public View (String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        
        boolean done = false;
        do{
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            // do the requested action and display the nest view
            done = this.doAction(value);
            
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput(){
        
        
        boolean valid = false;
        String value = null;
        try {
            //while a valid name has not been retrieved
            while (!valid){
            
            
                // prompt for the player's name
                this.console.println("\n" + this.displayMessage);
                
                // get the value entered from the keyboard
                value = this.keyboard.readLine();
                value = value.trim();
                
                if(value.length() < 1){ // blank value entered
                    this.console.println("\n*** You must enter a value ***");
                    continue;
                }
                
                    break;
                }
            } catch (Exception e) {
                this.console.println("Error reading input: " + e.getMessage());
            }
        
        
        return value; // return name
    }
    
    }


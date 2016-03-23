/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountkabru;

import byui.cit260.mountKabru.model.*;
import byui.cit260.mountKabru.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



/**
 *
 * @author jacob bloomfield
 */
public class MountKabru {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            //open charcter stream files for end user input and output
            MountKabru.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            MountKabru.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            MountKabru.logFile = new PrintWriter(filePath);
            
        StartProgramView start = new StartProgramView();    
        start.display();
        } catch (Throwable te){
            MountKabru.getOutFile().println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
        }
        
        finally {
            try {
               if (MountKabru.inFile != null) 
                   MountKabru.inFile.close();
                
               if (MountKabru.outFile != null)
                   MountKabru.outFile.close();
               
               if (MountKabru.logFile != null)
                   MountKabru.logFile.close();
               
            } catch (IOException ex) {
                MountKabru.getOutFile().println("Error closing files");
            }
        }
        
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MountKabru.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MountKabru.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MountKabru.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MountKabru.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MountKabru.logFile = logFile;
    }
    
    

    
}

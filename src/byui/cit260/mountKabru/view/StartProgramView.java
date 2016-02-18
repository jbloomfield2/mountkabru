/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.view;

/**
 *
 * @author jacob bloomfield
 */
public class StartProgramView {
    String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name :";
        //display banner when class is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println("\n************************************************************\n" +
                            "*--------------------------Welcome-------------------------*\n" +
                            "*-----------------------------to---------------------------*\n" +
                            "*-------------------------Mount Kabru----------------------*\n" +
                            "*----------------------------------------------------------*\n" +
                            "*------------You must protect the town of Kabru------------*\n" +
                            "*----------from evil monsters in the surrounding-----------*\n" +
                            "*----------lands. To end the onslaught of monsters---------*\n" +
                            "*-----------you must find the mysterious master------------*\n" +
                            "*------------that created them and destroy him.------------*\n" +
                            "*----------------------------------------------------------*\n" +
                            "************************************************************\n"
                          + "                       ,sdPBbs.\n" +
                            "                      ,d$$$$$$$$b.                          \n" +
                            "                     d$P'`Y'`Y'`?$b\n" +
                            "                    d'    `  '  \\ `b\n" +
                            "                   /    |        \\  \\\n" +
                            "                  /    / \\       |   \\                      \n" +
                            "             _,--'        |      \\    |\n" +
                            "           /' _/          \\   |        \\\n" +
                            "        _/' /'             |   \\        `-.__\n" +
                            "    __/'       ,-'    /    |    |     \\      `--...__      \n" +
                            "  /'          /      |    / \\     \\     `-.           `\\\n" +
                            " /                   /   /    \\            \\            `-.");
    }

    public void displayStartProgramView() {
        System.out.println("\n***displayStartProgramView function called***");
    }
    
    
}

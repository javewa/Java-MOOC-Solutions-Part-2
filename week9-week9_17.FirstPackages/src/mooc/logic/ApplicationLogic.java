/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author nacht
 */

import mooc.ui.UserInterface;

public class ApplicationLogic {
    
    private UserInterface userInterface;
    
    public ApplicationLogic(UserInterface ui) {
        this.userInterface = ui;
    }
    
    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i ++) {
            System.out.println("The application logic works");
            this.userInterface.update();
        }
    }
    
}

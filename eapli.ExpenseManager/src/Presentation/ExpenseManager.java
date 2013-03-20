/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.ExpenseBootstarpper;

/**
 *
 * @author
 */
public class ExpenseManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpenseBootstarpper boot = new ExpenseBootstarpper();
        MainMenu menu = new MainMenu();
        menu.mainLoop();

    }
}

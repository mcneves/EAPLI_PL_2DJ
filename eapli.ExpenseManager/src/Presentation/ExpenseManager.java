/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.*;

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
        ExpenseTypeBootStrapper bootType = new ExpenseTypeBootStrapper();
        IncomeBootstrapper bootIncome = new IncomeBootstrapper();
        IncomeTypeBootstrapper bootinctype = new IncomeTypeBootstrapper();
        MainMenu menu = new MainMenu();
        menu.mainLoop();

    }
}

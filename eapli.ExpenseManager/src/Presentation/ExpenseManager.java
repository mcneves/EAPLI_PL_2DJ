/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

<<<<<<< HEAD
import eapli.ExpenseBootstarpper;
import eapli.ExpenseTypeBootStrapper;
import eapli.PaymentMeansBootStrapper;
=======
import eapli.*;
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f

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
<<<<<<< HEAD
        PaymentMeansBootStrapper bootMean=new PaymentMeansBootStrapper();
=======
        IncomeBootstrapper bootIncome = new IncomeBootstrapper();
        IncomeTypeBootstrapper bootinctype = new IncomeTypeBootstrapper();
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }
}

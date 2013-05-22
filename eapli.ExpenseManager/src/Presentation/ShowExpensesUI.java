/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ShowExpensesController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author
 */
public class ShowExpensesUI extends BaseUI {

    public ShowExpensesUI() {
    }
    ShowExpensesController controller = new ShowExpensesController();

    public BaseController controller() {
        return controller;
    }

    public void run() {
        int op;
        Expense exp;
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println(" End show expenses");
                    break;
                case 1:
                    List<Expense> list = controller.getAllExpenses();
                    displayList(list);
                    break;
                case 2:
                    exp = controller.getLastExpense();
                    System.out.println("Last Expense" + exp);
                    break;
                default:
                    System.out.println("Wrong option. Please repeat");
                    break;
            }
        } while (op != 0);
    }

    private int menu() {
        System.out.println("1. All expenses");
        System.out.println("2. Last expense");
        System.out.println("0. End show expenses\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }

    private void displayList(List<Expense> list) {
        int i = 0;
        System.out.println("List of Expenses\n");
        for (Expense exp : list) {
            i = i + 1;
            System.out.println("Expense " + i + "\n" + exp);
        }
    }

    @Override
    public void header() {
        System.out.println("* * *  SHOW EXPENSES  * * *\n");
    }
}

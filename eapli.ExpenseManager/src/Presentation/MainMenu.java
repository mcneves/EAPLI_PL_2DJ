/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author
 */
public class MainMenu {

    public MainMenu() {
    }

    public void mainLoop() {
        int op;
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println("bye bye ...");
                    break;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.run();
                    break;
                case 2:
                    ShowExpensesUI showExpensesUI = new ShowExpensesUI();
                    showExpensesUI.loop();
                    break;
                case 3:
                    ExpenseTypeUI expenseTypeUI = new ExpenseTypeUI();
                    expenseTypeUI.run();
                    break;
                case 4:
                    DefPaymentMeansUI defPaymentMeansUI = new DefPaymentMeansUI();
<<<<<<< HEAD
                    defPaymentMeansUI.loop();
=======
                    defPaymentMeansUI.run();
                    break;
                case 5:
                    ExpenseConsultMonthUI expConsultMonthUI = new ExpenseConsultMonthUI();
                    expConsultMonthUI.DisplayTotalExpensesMonth();
                    break;
                case 6:
                    IncomeRegisterUI incui = new IncomeRegisterUI();
                    incui.run();
                    break;
                case 7:
                    ShowIncomesUI showIncomeUI = new ShowIncomesUI();
                    showIncomeUI.loop();
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
                    break;
            }
        } while (op != 0);

    }

    private static int menu() {
        System.out.println("===================");
        System.out.println("  EXPENSE MANAGER  ");
        System.out.println("===================\n");
        System.out.println("1. Register an expense");
        System.out.println("2. Show expenses");
        System.out.println("3. Define Expense Type");
        System.out.println("4. Define Payment Means");
<<<<<<< HEAD
=======
        System.out.println("5. Consult Expenses a Month");
        System.out.println("6. Register an income");
        System.out.println("7. Show incomes");
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
        System.out.println("0. Exit\n\n");

        int option = Console.readInteger("Please choose an option");
        return option;
    }
}

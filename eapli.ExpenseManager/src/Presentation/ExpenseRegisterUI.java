/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;

/**
 *
 * @author
 */
public class ExpenseRegisterUI {

      public ExpenseRegisterUI() {
      }

      public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            BigDecimal amount = new BigDecimal(value);

            ExpenseRegisterController controller = new ExpenseRegisterController();
            controller.registerExpense(desc, date, amount);

            System.out.println("expense recorded.");
      }
}

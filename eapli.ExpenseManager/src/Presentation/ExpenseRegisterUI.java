/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;
import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author
 */
public class ExpenseRegisterUI {//extends BaseUI

      public ExpenseRegisterUI() {
      }

      public void run() {
            System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
            String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            BigDecimal amount = new BigDecimal(value);
            System.out.println("Expense Type:");
            
            ExpenseTypeController expTypeController=new ExpenseTypeController();
            List<ExpenseType> list=expTypeController.ListAllTypes();
            
            ExpenseTypeUI ui = new ExpenseTypeUI();
            
            ui.displayList(list);
            
            int op=Console.readInteger("Choose an option");
            
            ExpenseType exptype=new ExpenseType(list.get(op-1));
            
            System.out.println("Do you wish to leave a comment?");
            String opComment=Console.readLine("(y/n)");
            
            String comment="";
            if("y".equals(opComment))
            {
                comment=Console.readLine("");
            }
            
            ExpenseRegisterController expRegController = new ExpenseRegisterController();
            expRegController.registerExpense(desc, date, amount, exptype, comment);

            System.out.println("expense recorded.");
      }
      
//      public BaseController controller()
//      {
//          return expRegController;
//      }
      
      public void header()
      {
          System.out.println("EXPENSE REGISTER");
      }
}

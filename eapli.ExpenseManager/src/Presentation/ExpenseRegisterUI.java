/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefPaymentMeansController;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import Controllers.ExpenseRegisterController;
import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import Model.PaymentMeans;
import Persistence.PaymentMeansRepository;
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
            String desc = Console.readLine("\nDescription:");
            Date date = Console.readDate("\nWhen (dd-MM-yyyy):");
            double value = Console.readDouble("\nAmount:");
            BigDecimal amount = new BigDecimal(value);
            System.out.println("\nExpense Type:");
            
            ExpenseTypeController expTypeController=new ExpenseTypeController();
            List<ExpenseType> list=expTypeController.ListAllTypes();
            
            ExpenseTypeUI ui = new ExpenseTypeUI();
            
            ui.displayList(list);
            
            int op=Console.readInteger("\nChoose an option");
            
            ExpenseType exptype=new ExpenseType(list.get(op-1));
            
            System.out.println("\nPayment mean:");
            
            DefPaymentMeansController dpmc = new DefPaymentMeansController();
            List<PaymentMeans> listMeans = dpmc.ListAllMeans();
            
            DefPaymentMeansUI defui = new DefPaymentMeansUI();
            
            defui.displayList(listMeans);
            
            int opPM = Console.readInteger("\nChoose an option");
            
            PaymentMeans pay=new PaymentMeansImpl(listMeans.get(opPM-1));
                        
            System.out.println("\nDo you wish to leave a comment?");
            String opComment=Console.readLine("\n(y/n)");
            
            String comment="";
            if("y".equals(opComment))
            {
                comment=Console.readLine("");
            }
            
            ExpenseRegisterController expRegController = new ExpenseRegisterController();
            expRegController.registerExpense(desc, date, amount, exptype, comment, pay);

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

    private static class PaymentMeansImpl extends PaymentMeans {

        public PaymentMeansImpl(PaymentMeans get) {
            super();
        }
    }
      
}

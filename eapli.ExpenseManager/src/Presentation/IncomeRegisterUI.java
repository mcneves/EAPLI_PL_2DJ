/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeRegisterController;
import Controllers.IncomeTypeController;
import Model.IncomeType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class IncomeRegisterUI {
    public IncomeRegisterUI() {
      }

      public void run() {
            System.out.println("* * *  REGISTER AN INCOME  * * *\n");
            String desc = Console.readLine("Description:");
            Date date = Console.readDate("When (dd-MM-yyyy):");
            double value = Console.readDouble("Amount:");
            BigDecimal amount = new BigDecimal(value);
            System.out.println("Income Type:");
            
            IncomeTypeController incTypeController=new IncomeTypeController();
            List<IncomeType> list=incTypeController.ListAllTypes();
            
            IncomeTypeUI ui = new IncomeTypeUI();
            
            ui.displayList(list);
            
            int op=Console.readInteger("Choose an option");
            
            IncomeType inctype=new IncomeType(list.get(op-1));
            
            System.out.println("Do you wish to leave a comment?");
            String opComment=Console.readLine("(y/n)");
            
            String comment="";
            if("y".equals(opComment))
            {
                comment=Console.readLine("");
            }
            
            IncomeRegisterController incRegController = new IncomeRegisterController();
            incRegController.registerIncome(desc, date, amount, inctype, comment);

            System.out.println("income recorded.");
      }
      
//      public BaseController controller()
//      {
//          return expRegController;
//      }
      
      public void header()
      {
          System.out.println("INCOME REGISTER");
      }
}

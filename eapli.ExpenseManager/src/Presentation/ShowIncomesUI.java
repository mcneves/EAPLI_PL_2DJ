/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ShowIncomeController;
import Model.Income;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class ShowIncomesUI extends BaseUI{
    
    BaseController controller = new ShowIncomeController();
    
    public ShowIncomesUI() {
      }

    @Override
    protected BaseController controller() {
        return controller;
    }

    @Override
    public void header() {
        System.out.println("SHOW INCOMES");
        
    }    
    
    
    @Override
      public void run() {
            int op;
            Income income=null;
            ShowIncomeController controller = new ShowIncomeController();
            do {
                  op = menu();              
                  switch (op) {
                        case 0:
                              System.out.println(" End show Income");
                              break;
                        case 1:
                              List<Income> list= controller.getAllIncome();
                              displayList(list);
                              break;
                        case 2:
                                 income = controller.getLastIncome();
                              System.out.println("Last Income\n"+income);
                              break;
                        default:
                              System.out.println("Wrong option. Please repeat");
                              break;
                  }
            } while (op != 0);
      }

      private int menu() {
            System.out.println("* * *  SHOW INCOMES  * * *\n");
            System.out.println("1. All incomes");
            System.out.println("2. Last income");
            System.out.println("0. End show incomes\n\n");
            int op = Console.readInteger("Choose an option");
            return op;
      }

 
      private void displayList(List<Income> list) {
            int i=0;
            System.out.println("List of Incomes\n");
            for (Income inc : list) {
                  i=i+1;
                  System.out.println("Income "+i+"\n" + inc);
            }
      }
    
}

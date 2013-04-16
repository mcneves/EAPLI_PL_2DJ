/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeUI extends BaseUI{
    
    public ExpenseTypeUI(){}
    
    ExpenseTypeController controller = new ExpenseTypeController();
    
    public BaseController controller(){
        return controller;
    }
    
    @Override
    public void run()
    {
        String desc = Console.readLine("Description:\n");
        
        ExpenseTypeController controller = new ExpenseTypeController();
        controller.defineExpenseType(desc);
        
        System.out.println("Expense Type Recorded\n");
        List<ExpenseType> list = controller.ListAllTypes();
        displayList(list);
    }
    
    public void displayList(List<ExpenseType> list)
    {
        int i=0;
        System.out.println("List of Types\n");
        for (ExpenseType exptype : list) {
            i=i+1;
            System.out.println("Type "+i+"\n" + exptype);
        }
    }
    
    //      public BaseController controller()
//      {
//          return controller;
//      }
    
    public void header()
    {
        System.out.println("*** REGISTER A TYPE OF EXPENSE ***");
    }
}

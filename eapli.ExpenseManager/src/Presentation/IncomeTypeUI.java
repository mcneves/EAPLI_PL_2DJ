/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeTypeController;
import Model.IncomeType;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class IncomeTypeUI extends BaseUI{
    
    private BaseController controller = new IncomeTypeController();
    
    public IncomeTypeUI(){}

    @Override
    protected BaseController controller() {
        return controller;
    }
    
    
    
    @Override
    public void run()
    {
        System.out.println("***Define Income Type***\n");
        String desc = Console.readLine("Description:\n");
        
        IncomeTypeController controller = new IncomeTypeController();
        controller.defineIncomeType(desc);
        
        System.out.println("Income Type Recorded\n");
        List<IncomeType> list = controller.ListAllTypes();
        displayList(list);
    }
    
    public void displayList(List<IncomeType> list)
    {
        int i=0;
        System.out.println("List of Types\n");
        for (IncomeType inctype : list) {
            i=i+1;
            System.out.println("Type "+i+"\n" + inctype);
        }
    }
    
    //      public BaseController controller()
//      {
//          return controller;
//      }
    
    @Override
    public void header()
    {
        System.out.println("INCOME TYPES");
    }
}

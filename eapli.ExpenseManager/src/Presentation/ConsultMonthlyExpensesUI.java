/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ConsultMonthlyExpensesController;
import Controllers.ExpenseTypeController;
import Model.Expense;
import Model.ExpenseType;
import Model.MonthExpensesByType;
import eapli.util.Console;
import java.util.*;
    

/**
 *
 * @author i121096
 */
public class ConsultMonthlyExpensesUI {
    
    public ConsultMonthlyExpensesUI(){}
    
    public void run(){
    
    int mes = Console.readInteger("Introduza o mês que quer consultar:" );
    ConsultMonthlyExpensesController controller = new ConsultMonthlyExpensesController();
    List<MonthExpensesByType> expenses = controller.getMonthExpensesByType(mes);
    
    for(int i = 0; i < expenses.size(); i++){
        System.out.println(expenses.get(i).getExpenseType() + "-" + expenses.get(i).getTotal());
    }
    
    }
}

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
import java.math.BigDecimal;
import java.util.*;
    

/**
 *
 * @author i121096
 */
public class ConsultMonthlyExpensesUI {
    
    public ConsultMonthlyExpensesUI(){}
    
    public void run(){
    
        int month = Console.readInteger("Introduce the month you want to consult:" );
        String texto;
        ConsultMonthlyExpensesController controller = new ConsultMonthlyExpensesController();
        List<MonthExpensesByType> expenses = controller.getMonthExpensesByType(month);

        texto = String.format("===================\nExpenses of month %d\n===================\n",month);
        System.out.println(texto);
        for(int i = 0; i < expenses.size(); i++){
            texto = String.format("%s: %.2f €", expenses.get(i).getExpenseType(), expenses.get(i).getTotal());
            System.out.println(texto);

        }
        System.out.println("\n");
    }
    
    public void displayGraph(){
        int month = Console.readInteger("Introduce the month you want to consult:" );
        String texto;
        String unidade = "*";
        ConsultMonthlyExpensesController controller = new ConsultMonthlyExpensesController();
        List<MonthExpensesByType> expenses = controller.getMonthExpensesByType(month);

        texto = String.format("===================\nExpenses of month %d\n===================\n",month);
        System.out.println(texto);
        if(expenses.size()!= 0){
            for(int i = 0; i < expenses.size(); i++){
                texto = String.format("%s: %s", expenses.get(i).getExpenseType(), somaUnidades(expenses.get(i).getTotal()));
                System.out.println(texto);
            }
        }else{
            System.out.println("You have no expenses registered in this month");
        }
        System.out.println("\n");
    }
   
    private String somaUnidades(BigDecimal quantidade){
        String texto ="";
        
        for (int i = 0; i < quantidade.intValue(); i++) {
            texto += "*";
        }
        return texto;
    }
}

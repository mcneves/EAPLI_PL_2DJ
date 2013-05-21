/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import java.util.List;
import Model.MonthExpensesByType;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceRegistry;
import java.util.ArrayList;

/**
 *
 * @author i121096
 */
public class ConsultMonthlyExpensesController {
    
    public ConsultMonthlyExpensesController(){
    }
    
  
    public List<MonthExpensesByType> getMonthExpensesByType(int month){
          
        //ShowExpensesController controller = new ShowExpensesController();
        List<Expense> listaTotal = PersistenceRegistry.getInstance().expenseRepository().getAllExpenses();
        ExpenseRecord recorder = new ExpenseRecord(listaTotal);
        //ExpenseTypeRepository repository = new ExpenseTypeRepository();
        
        
        
        List<Expense> monthExpenses = recorder.getListOfExpensesMonth(month);
        List<ExpenseType> expensesTypes = PersistenceRegistry.getInstance().expenseTypeRepository().ListAllTypes();
        
        List<MonthExpensesByType> listMonthExpensesByType = new ArrayList<MonthExpensesByType>();
        
        for(int i = 0; i < expensesTypes.size(); i++){
         listMonthExpensesByType.add(new MonthExpensesByType(expensesTypes.get(i).getDescription()));
        }
        
        for(int i = 0; i < monthExpenses.size(); i++){
            for(int j = 0; j < listMonthExpensesByType.size(); j++){
             if(monthExpenses.get(i).getExpenseType().getDescription().equals(listMonthExpensesByType.get(j).getExpenseType())){
                 listMonthExpensesByType.get(j).addExpense(monthExpenses.get(i));
             }
            }
        }
        
        
        
        return listMonthExpensesByType;
    }
}

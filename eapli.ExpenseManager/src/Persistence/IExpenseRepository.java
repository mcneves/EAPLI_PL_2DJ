/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author
 */
public interface IExpenseRepository {

    void saveExpense(Expense exp);

    List<Expense> getAllExpenses();

    Expense getLastExpense();
    
    ExpenseType getByDescription(String desc);
}

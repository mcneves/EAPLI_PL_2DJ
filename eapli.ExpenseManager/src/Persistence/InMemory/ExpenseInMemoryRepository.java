/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Expense;
import Model.ExpenseType;
import Persistence.IExpenseRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class ExpenseInMemoryRepository implements IExpenseRepository {
    // class member

    private static List<Expense> listExpense = new ArrayList<>();

    public ExpenseInMemoryRepository() {
    }
    
    @Override
    public void saveExpense(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);

    }
    
    @Override
    public List<Expense> getAllExpenses() {
        return Collections.unmodifiableList(listExpense);
    }
    
    @Override
    public Expense getLastExpense() {
        Expense exp = null;
        Expense copy = null;
        int size = listExpense.size();
        if (size > 0) {
            exp = listExpense.get(size - 1);
        }
        if (exp != null) {
            copy = new Expense(exp);
        }
        return copy;
    }
    
    @Override
    public ExpenseType getByDescription(String desc){
        return null;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i121096
 */
public class MonthExpensesByType {
    
    private String expenseType;
    private List<Expense> listExpenses;
    private BigDecimal total;
    
    
    public MonthExpensesByType(String expenseType){
        total = new BigDecimal("0");
        this.expenseType = expenseType;
        this.listExpenses = new ArrayList<Expense>();
    }
    
    public void addExpense(Expense expense){
        getListExpenses().add(expense);
    }
    
    public BigDecimal getTotal(){
        for(Expense e : getListExpenses()){
        total = total.add(e.getAmount());
        }
        return total;
   }

    /**
     * @return the expenseType
     */
    public String getExpenseType() {
        return expenseType;
    }

    /**
     * @param expenseType the expenseType to set
     */
    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    /**
     * @return the listExpenses
     */
    public List<Expense> getListExpenses() {
        return listExpenses;
    }
}

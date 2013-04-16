/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMeans;
import Persistence.PersistenceRegistry;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author 
 */
public class ExpenseRegisterController {
    
    public ExpenseRegisterController() {
    }
    
    public void registerExpense(String desc, Date date, BigDecimal amount, ExpenseType exptype, String comment, PaymentMeans pay) {
            Expense expense = new Expense(desc, date, amount, exptype, comment, pay);
            PersistenceRegistry.getInstance().expenseRepository().saveExpense(expense);
    }
}
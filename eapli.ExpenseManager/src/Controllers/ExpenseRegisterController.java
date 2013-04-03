/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author
 */
public class ExpenseRegisterController {

    public ExpenseRegisterController() {
    }

    public void registerExpense(String desc, Date date, BigDecimal amount) {
        Expense expense = new Expense(desc, date, amount);
        ExpenseRepository controller = new ExpenseRepository();
        controller.saveExpense(expense);
    }
}

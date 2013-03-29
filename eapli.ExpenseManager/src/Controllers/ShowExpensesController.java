/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import java.util.List;

/**
 *
 * @author
 */
public class ShowExpensesController {

      public ShowExpensesController() {
      }

      public List<Expense> getAllExpenses() {
            ExpenseRepository repo = new ExpenseRepository();
            return repo.getAllExpenses();
      }

      public Expense getLastExpense() {
            ExpenseRepository repo = new ExpenseRepository();
            return repo.getLastExpense();
      }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.PersistenceRegistry;
import java.util.List;

/**
 *
 * @author
 */
public class ShowExpensesController extends BaseController{

      public ShowExpensesController() {
      }

      public List<Expense> getAllExpenses() {
          return PersistenceRegistry.getInstance().expenseRepository().getAllExpenses();
      }

      public Expense getLastExpense() {
          return PersistenceRegistry.getInstance().expenseRepository().getLastExpense();
      }
}

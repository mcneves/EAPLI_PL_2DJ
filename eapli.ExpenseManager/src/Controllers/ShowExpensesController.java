/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.PersistenceFactory;
import java.util.List;

/**
 *
 * @author
 */
public class ShowExpensesController extends BaseController{

      public ShowExpensesController() {
      }

      public List<Expense> getAllExpenses() {
          return PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository().getAllExpenses();
      }

      public Expense getLastExpense() {
          return PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository().getLastExpense();
      }
}

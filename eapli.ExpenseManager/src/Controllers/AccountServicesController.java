/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Income;
import Persistence.PersistenceFactory;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class AccountServicesController extends BaseController {

    public AccountServicesController() {
    }

    public List<Income> getAllIncomes() {
        List<Income> listIncome = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository().getAllIncome();
        return listIncome;
    }

    public List<Expense> getAllExpenses() {
        List<Expense> listExp = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository().getAllExpenses();
        return listExp;
    }
}

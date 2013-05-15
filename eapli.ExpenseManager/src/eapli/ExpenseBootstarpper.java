/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Expense;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMeansRepository;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;

/**
 *
 * @author
 */
public class ExpenseBootstarpper {

    static {
        IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
        IExpenseTypeRepository trepo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        IPaymentMeansRepository prepo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();

        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4), trepo.ListAllTypes().get(2), "", prepo.getAllMeans().get(1)));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4), trepo.ListAllTypes().get(1), "", prepo.getAllMeans().get(2)));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4), trepo.ListAllTypes().get(0), "", prepo.getAllMeans().get(4)));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0), trepo.ListAllTypes().get(3), "", prepo.getAllMeans().get(6)));

    }
}

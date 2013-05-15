/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMeans;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMeansRepository;
import Persistence.PaymentMeansRepository;
import java.math.BigDecimal;

/**
 *
 * @author
 */
public class ExpenseBootstarpper {

    static {
        IExpenseRepository repo = new ExpenseRepository();
        IExpenseTypeRepository trepo = new ExpenseTypeRepository();
        IPaymentMeansRepository prepo = new PaymentMeansRepository();

       /* ExpenseType vec[] = new ExpenseType[4];
        PaymentMeans arr[] = new PaymentMeans[7];

        for (int i = 0; i < 7; i++) {
            while (i < 4) {
                vec[i] = trepo.ListAllTypes().get(i);
            }
            arr[i] = prepo.getAllMeans().get(i);
        }*/

        repo.saveExpense(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4), trepo.ListAllTypes().get(2), "", prepo.getAllMeans().get(1)));
        repo.saveExpense(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4), trepo.ListAllTypes().get(1), "", prepo.getAllMeans().get(2)));
        repo.saveExpense(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4), trepo.ListAllTypes().get(0), "", prepo.getAllMeans().get(4)));
        repo.saveExpense(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0), trepo.ListAllTypes().get(3), "", prepo.getAllMeans().get(6)));

    }
}


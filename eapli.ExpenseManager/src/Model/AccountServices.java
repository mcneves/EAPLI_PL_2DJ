/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.AccountServicesController;
import Persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class AccountServices {

    public AccountServices() {
    }

    public BigDecimal getBalance() {
        BigDecimal amount = new BigDecimal("0"), expenseCount = new BigDecimal("0"), incomeCount = new BigDecimal("0");
       
        AccountServicesController accSevController = new AccountServicesController();
        
        List<Expense> listExp = accSevController.getAllExpenses();
        List<Income> listIncome = accSevController.getAllIncomes();

        for (Expense exp : listExp) {
            expenseCount = expenseCount.add(exp.getAmount());
        }
        for (Income inc : listIncome) {
            incomeCount = incomeCount.add(inc.getAmount());
        }

        amount = round(incomeCount,2,true).subtract(round(expenseCount,2,true));

        //prints testes
        //System.out.println("Soma Expenses: " + expenseCount);
        //System.out.println("Soma Incomes: " + incomeCount);
        //System.out.println("Saldo: " + amount);

        return amount;
    }

    //metodo para arredondar BigDecimal
    private static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
        int mode = (roundUp) ? BigDecimal.ROUND_UP : BigDecimal.ROUND_DOWN;
        return d.setScale(scale, mode);
    }
}

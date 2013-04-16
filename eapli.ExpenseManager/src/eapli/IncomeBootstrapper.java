/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;

/**
 *
 * @author André Pinto
 */
public class IncomeBootstrapper {
    static {
        IIncomeRepository repo = new IncomeRepository();

        repo.saveIncome(new Income("Ordenado", 2013, 3, 4, new BigDecimal(567.4),new IncomeType("Salário"),""));
        repo.saveIncome(new Income("Abono", 2013, 3, 5, new BigDecimal(123.4),new IncomeType("Subsidio"),""));
        repo.saveIncome(new Income("Ind_trabalho", 2013, 3, 4, new BigDecimal(1235.4),new IncomeType("indemnização"),""));
        repo.saveIncome(new Income("Bolsa", 2013, 3, 4, new BigDecimal(300.0),new IncomeType("Subsidio"),""));

    }
}

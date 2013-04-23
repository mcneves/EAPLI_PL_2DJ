/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import Persistence.PersistenceRegistry;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author André Pinto
 */
public class IncomeRegisterController extends BaseController{
     public IncomeRegisterController() {
      }

      public void registerIncome(String desc, Date date, BigDecimal amount, IncomeType exptype, String comment) {
            Income income = new Income(desc, date, amount, exptype, comment);
            PersistenceRegistry.getInstance().incomeRepository().saveIncome(income);
      }
}

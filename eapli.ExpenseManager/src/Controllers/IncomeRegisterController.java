/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import Persistence.IncomeRepository;
import Persistence.PersistenceFactory;
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
            IIncomeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository();
            repo.saveIncome(income);
            
      }
}

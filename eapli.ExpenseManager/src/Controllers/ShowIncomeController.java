/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IncomeRepository;
import Persistence.PersistenceRegistry;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class ShowIncomeController extends BaseController{
    
    public ShowIncomeController() {
      }

      public List<Income> getAllIncome() {
            return PersistenceRegistry.getInstance().incomeRepository().getAllIncome();
      }

      public Income getLastIncome() {
            return PersistenceRegistry.getInstance().incomeRepository().getLastIncome();
      }
}

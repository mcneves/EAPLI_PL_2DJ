/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IncomeRepository;
import Persistence.PersistenceFactory;
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
          return PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository().getAllIncome();
            
      }

      public Income getLastIncome() {
            return PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeRepository().getLastIncome();
      }
}

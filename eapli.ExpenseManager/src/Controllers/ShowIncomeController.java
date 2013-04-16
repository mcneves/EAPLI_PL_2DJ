/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class ShowIncomeController {
    
    public ShowIncomeController() {
      }

      public List<Income> getAllIncome() {
            IncomeRepository repo = new IncomeRepository();
            return repo.getAllIncome();
      }

      public Income getLastIncome() {
            IncomeRepository repo = new IncomeRepository();
            return repo.getLastIncome();
      }
}

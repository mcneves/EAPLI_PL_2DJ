/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;
import Model.Income;
import Model.IncomeType;
import Persistence.IIncomeRepository;
import java.util.List;
import javax.persistence.EntityManager;
/**
 *
 * @author André Pinto
 */
public class IncomeJpaRepository extends JpaGeneric<Income, Integer> implements IIncomeRepository {
    @Override
      public void saveIncome(Income inc){
            save(inc);
      }

      @Override
      public List<Income> getAllIncome(){
            return super.all(); //ou apenas return all();
      }
      
      @Override
      public Income getLastIncome(){
            return null;
      }
      
      @Override
      public IncomeType getByDescription(String description){
          EntityManager em=getEntityManager();
          //Query q=
          return null;
      }
}

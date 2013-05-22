/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;
import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import java.util.List;
/**
 *
 * @author André Pinto
 */
public class IncomeTypeJpaRepository extends JpaGeneric<IncomeType, Integer> implements IIncomeTypeRepository{
    @Override
      public void defineIncomeType(IncomeType eT){
            save(eT);
      }

      @Override
     public List<IncomeType> ListAllTypes(){
            return all();
      }
}

package Persistence.Jpa;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author i060752
 */
public class ExpenseTypeJpaRepository extends JpaGeneric<ExpenseType, Long> implements IExpenseTypeRepository{
      @Override
      public void defineExpenseType(ExpenseType eT){
            save(eT);
      }

      @Override
     public List<ExpenseType> ListAllTypes(){
            return all();
      }
}
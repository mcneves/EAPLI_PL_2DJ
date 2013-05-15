/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author i060752
 */
public class JpaRepositoryFactory implements IRepositoryFactory{
    
    @Override
    public IExpenseRepository getExpenseRepository(){
            return new Persistence.Jpa.ExpenseJpaRepository();
    }
      
    @Override
    public IExpenseTypeRepository getExpenseTypeRepository(){
        return new Persistence.Jpa.ExpenseTypeJpaRepository();
    }
    
    @Override
    public IPaymentMeansRepository getPaymentMeansRepository(){
        return new Persistence.Jpa.PaymentMeansJpaRepository();
    }
}

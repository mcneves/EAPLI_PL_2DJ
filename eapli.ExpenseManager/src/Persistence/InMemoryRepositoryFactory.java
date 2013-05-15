/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author i060752
 */
public class InMemoryRepositoryFactory implements IRepositoryFactory{
    
    @Override
    public IExpenseRepository getExpenseRepository(){
            return new Persistence.InMemory.ExpenseInMemoryRepository();
    }
      
    @Override
    public IExpenseTypeRepository getExpenseTypeRepository(){
        return new Persistence.InMemory.ExpenseTypeInMemoryRepository();
    }
    
    @Override
    public IPaymentMeansRepository getPaymentMeansRepository(){
        return new Persistence.InMemory.PaymentMeansInMemoryRepository();
    }
}

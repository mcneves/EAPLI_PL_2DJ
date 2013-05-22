/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author i060752
 */
@Deprecated
public class PersistenceRegistry {
    
    //SINGLETON
    private PersistenceRegistry()
    {
    }
    
    private static PersistenceRegistry instance=new PersistenceRegistry();
    
    public static PersistenceRegistry getInstance()
    {
        return instance;
    }
    
    public IExpenseRepository expenseRepository()
    {
        return new ExpenseRepository();
    }
    
    public IExpenseTypeRepository expenseTypeRepository()
    {
        return new ExpenseTypeRepository();
    }
    
    public IPaymentMeansRepository paymentMeansRepository()
    {
        return new PaymentMeansRepository();
    }
    
    public IIncomeRepository incomeRepository()
    {
        return new IncomeRepository();
    }
    
    public IIncomeTypeRepository incomeTypeRepository()
    {
        return new IncomeTypeRepository();
    }
}

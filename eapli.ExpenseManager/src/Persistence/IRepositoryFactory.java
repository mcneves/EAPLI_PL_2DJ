/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author i060752
 */
public interface IRepositoryFactory {
    
    IExpenseTypeRepository getExpenseTypeRepository();
    IExpenseRepository getExpenseRepository();
    IPaymentMeansRepository getPaymentMeansRepository();
    IIncomeTypeRepository getIncomeTypeRepository();
    IIncomeRepository getIncomeRepository();
}

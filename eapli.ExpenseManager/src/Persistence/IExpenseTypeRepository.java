/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author Pedro
 */
public interface IExpenseTypeRepository {
 
    void defineExpenseType(ExpenseType exptype);
    
    List<ExpenseType> ListAllTypes();
}

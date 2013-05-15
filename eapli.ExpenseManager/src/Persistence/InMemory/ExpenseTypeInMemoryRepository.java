/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeInMemoryRepository implements IExpenseTypeRepository{
    
    private static List<ExpenseType> listExpenseType = new ArrayList();
    
    @Override
    public void defineExpenseType(ExpenseType exptype)
    {
        if(exptype==null)
        {
            throw new IllegalArgumentException();
        }
        
        listExpenseType.add(exptype);
    }
    
    @Override
    public List<ExpenseType> ListAllTypes()
    {
        return Collections.unmodifiableList(listExpenseType);
    }
}

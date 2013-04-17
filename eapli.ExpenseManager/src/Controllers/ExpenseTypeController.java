/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.PersistenceRegistry;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeController extends BaseController{
    
    public ExpenseTypeController(){}
    
    public void defineExpenseType(String desc){
        ExpenseType exptype = new ExpenseType(desc);
        PersistenceRegistry.getInstance().expenseTypeRepository().defineExpenseType(exptype);
    }
    
    public List<ExpenseType> ListAllTypes()
    {
        return PersistenceRegistry.getInstance().expenseTypeRepository().ListAllTypes();
    }
}

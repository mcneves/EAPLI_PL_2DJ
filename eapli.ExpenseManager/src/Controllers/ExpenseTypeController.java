/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.*;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeController extends BaseController{
    
    public ExpenseTypeController(){}
    
    public void defineExpenseType(String desc){
        ExpenseType exptype = new ExpenseType(desc);        
        IExpenseTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository();
        repo.defineExpenseType(exptype);
        
    }
    
    public List<ExpenseType> ListAllTypes()
    {
        return PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseTypeRepository().ListAllTypes();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class ExpenseTypeController {
    
    public ExpenseTypeController(){}
    
    public void defineExpenseType(String desc){
        ExpenseType exptype = new ExpenseType(desc);
        ExpenseTypeRepository repository = new ExpenseTypeRepository();
        repository.defineExpenseType(exptype);
    }
    
    public List<ExpenseType> ListAllTypes()
    {
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        return repo.ListAllTypes();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class IncomeTypeController {
    public IncomeTypeController(){}
    
    public void defineIncomeType(String desc){
        IncomeType inctype = new IncomeType(desc);
        IncomeTypeRepository repository = new IncomeTypeRepository();
        repository.defineIncomeType(inctype);
    }
    
    public List<IncomeType> ListAllTypes()
    {
        IncomeTypeRepository repo = new IncomeTypeRepository();
        return repo.ListAllTypes();
    }
}

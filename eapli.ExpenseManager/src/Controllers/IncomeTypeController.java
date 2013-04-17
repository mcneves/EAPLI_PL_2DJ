/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceRegistry;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class IncomeTypeController extends BaseController{
    public IncomeTypeController(){}
    
    public void defineIncomeType(String desc){
        IncomeType inctype = new IncomeType(desc);
        PersistenceRegistry.getInstance().incomeTypeRepository().defineIncomeType(inctype);
    }
    
    public List<IncomeType> ListAllTypes()
    {
        return PersistenceRegistry.getInstance().incomeTypeRepository().ListAllTypes();
    }
}

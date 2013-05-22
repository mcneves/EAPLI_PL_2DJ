/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceFactory;
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
        IIncomeTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        repo.defineIncomeType(inctype);
    }
    
    public List<IncomeType> ListAllTypes()
    {
        return PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository().ListAllTypes();
    }
}

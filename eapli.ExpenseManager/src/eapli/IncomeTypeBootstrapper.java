/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.IIncomeTypeRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author André Pinto
 */
public class IncomeTypeBootstrapper {
    static{
        IIncomeTypeRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getIncomeTypeRepository();
        
        repo.defineIncomeType(new IncomeType("Salário"));
        repo.defineIncomeType(new IncomeType("Subsidio"));
        repo.defineIncomeType(new IncomeType("indminização"));
        
    }
}

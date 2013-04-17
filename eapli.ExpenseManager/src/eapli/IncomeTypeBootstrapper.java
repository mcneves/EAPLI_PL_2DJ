/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.IIncomeTypeRepository;

/**
 *
 * @author André Pinto
 */
public class IncomeTypeBootstrapper {
    static{
        IIncomeTypeRepository repo = new IncomeTypeRepository();
        
        repo.defineIncomeType(new IncomeType("Salário"));
        repo.defineIncomeType(new IncomeType("Subsidio"));
        repo.defineIncomeType(new IncomeType("indminização"));
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public interface IIncomeTypeRepository {
    void defineIncomeType(IncomeType inctype);
    
    List<IncomeType> ListAllTypes();
}

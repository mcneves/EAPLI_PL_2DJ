/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;
import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author André Pinto
 */
public class IncomeTypeInMemoryRepository implements IIncomeTypeRepository{
    private static List<IncomeType> listIncomeType = new ArrayList();
    
    @Override
    public void defineIncomeType(IncomeType inctype)
    {
        if(inctype==null)
        {
            throw new IllegalArgumentException();
        }
        
        listIncomeType.add(inctype);
    }
    
    @Override
    public List<IncomeType> ListAllTypes()
    {
        return Collections.unmodifiableList(listIncomeType);
    }
}

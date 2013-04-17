/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public class IncomeRepository implements IIncomeRepository{
    
     private static List<Income> listIncome = new ArrayList<>();

    public IncomeRepository() {
    }

      @Override
    public void saveIncome(Income inc) {
        if (inc == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(inc);

    }

      @Override
    public List<Income> getAllIncome() {
        return Collections.unmodifiableList(listIncome);
    }

      @Override
    public Income getLastIncome() {
        Income inc = null;
        Income copy = null;
        int size = listIncome.size();
        if (size > 0) {
            inc = listIncome.get(size - 1);
        }
        if (inc != null) {
            copy = new Income(inc);
        }
        return copy;
    }
    
}

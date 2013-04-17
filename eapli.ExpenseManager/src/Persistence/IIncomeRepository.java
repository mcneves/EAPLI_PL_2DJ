/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;
import java.util.List;

/**
 *
 * @author André Pinto
 */
public interface IIncomeRepository {
    void saveIncome(Income inc);

    List<Income> getAllIncome();

    Income getLastIncome();
}

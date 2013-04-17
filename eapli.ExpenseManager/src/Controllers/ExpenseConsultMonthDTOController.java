/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseDTO;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author FGCM
 */
public class ExpenseConsultMonthDTOController {
    
     public ExpenseConsultMonthDTOController() {
    }
    
    public List<ExpenseDTO> getExpensesMonth(int month )
    {
        
        List<ExpenseDTO> listDTO = new ArrayList<ExpenseDTO>();
        List<Expense> listExpenses;
        
        // vai buscar todas as despesas ao repositorio
        ExpenseRepository repo = new ExpenseRepository();
        listExpenses = repo.getAllExpenses();
        
        //envia a lista de despesas par ao ExpenseRecord e pede-lhe o total de um determinado mês
        ExpenseRecord expRec = new ExpenseRecord(listExpenses);
        listExpenses =  expRec.getListOfExpensesMonth(month);
        
        for (Expense e : listExpenses) {
            listDTO.add(new ExpenseDTO(e));
        }
        
        return listDTO;
    }
    
}

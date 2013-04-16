
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import java.math.BigDecimal;
import java.util.List;


public class ExpenseConsultMonthController {
    public ExpenseConsultMonthController() {
    }
    
    public BigDecimal getExpensesMonth(int month )
    {
        BigDecimal total;        
        
        List<Expense> list ;
        
        // vai buscar todas as despesas ao repositorio
        ExpenseRepository repo = new ExpenseRepository();
        list = repo.getAllExpenses();
        
        //envia a lista de despesas par ao ExpenseRecord e pede-lhe o total de um determinado mês
        ExpenseRecord expRec = new ExpenseRecord(list);
        total = expRec.getExpenseMonth(month);
           
        return total;
        
    }
}

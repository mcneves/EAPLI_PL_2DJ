
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import Persistence.PersistenceFactory;
import Persistence.PersistenceRegistry;
import java.math.BigDecimal;
import java.util.List;


public class ExpenseConsultMonthController extends BaseController{
    public ExpenseConsultMonthController() {
    }
    
    public BigDecimal getExpensesMonth(int month )
    {
        BigDecimal total;        
        
        List<Expense> list ;
        
        // vai buscar todas as despesas ao repositorio
        //list = PersistenceRegistry.getInstance().expenseRepository().getAllExpenses();
        list = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository().getAllExpenses();
        //envia a lista de despesas par ao ExpenseRecord e pede-lhe o total de um determinado mês
              
        
            ExpenseRecord expRec = new ExpenseRecord(list);
            total = expRec.getExpenseMonth(month);
        
        
        return total;
        
    }
}

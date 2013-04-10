
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ExpenseRecord {
    
    private List < Expense> list = new ArrayList <>();
    
    
    public ExpenseRecord() {
    }
    
    public ExpenseRecord(List<Expense> list)
    {        
        this.list= list;        
    }
    
    public BigDecimal getExpenseMonth(int month)
    {
        BigDecimal total= new BigDecimal("0");
       
        
        for(Expense exp : list)
        {            
            Calendar cal;
            cal = DateTime.dateToCalendar(exp.getDateOccurred());            
            
            int temp = cal.get(Calendar.MONTH);            
            if (temp == (month-1)) {
                total = total.add(exp.getAmount());
            }
        }     
               
        return total;
    }
}

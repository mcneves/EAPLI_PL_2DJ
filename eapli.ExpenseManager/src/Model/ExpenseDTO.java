/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author FGCM
 */
public class ExpenseDTO {
    private String description;
    private String dateOccurred;
    private double amount;
    private String exptype;
    private String comment;
    private String pay;
    
    
    public ExpenseDTO(Expense ex){
        
        this.description = ex.getDescription();
    
        Calendar cal = Calendar.getInstance();
        cal.setTime(ex.getDateOccurred());
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        this.dateOccurred = day + "-" + month + "-" + year ;

        this.amount = ex.getAmount().doubleValue();
        this.exptype = ex.getExpenseType().getDescription();
        this.comment = ex.getComment();
        this.pay = ex.getDescription();
   
    }

    public String getDescription() {
        return description;
    }

    public String getDateOccurred() {
        return dateOccurred;
    }

    public double getAmount() {
        return amount;
    }

    public String getExptype() {
        return exptype;
    }

    public String getComment() {
        return comment;
    }

    public String getPay() {
        return pay;
    }
    
    
           
    
    

}

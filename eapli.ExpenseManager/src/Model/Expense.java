/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author
 */
public class Expense extends Transaction{
    
    private PaymentMeans pay;

    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType exptype, String comment, PaymentMeans pay) {
        super(description, dateOccurred, amount, exptype, comment);
        this.pay=pay;
    }

    public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType exptype, String comment, PaymentMeans pay) {
        this(description, DateTime.newDate(year, month, day), amount, exptype, comment, pay);
    }
    
    public Expense(Expense exp) {
        super(exp);
        pay=exp.pay;

    }
    @Override
      public String toString() {
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double doubleAmount = super.getAmount().doubleValue();
            String s = "Description:" + super.getDescription() + 
                    "\nAmount:" + n.format(doubleAmount)+
                    "\nType: "+(ExpenseType)super.getTranstype()+"\nComment: "+super.getComment()+
                    "\nDate created: " + super.getDateOccurred();
            return s;

    }
    
    @Override
    public Date getDateOccurred(){   
        return super.getDateOccurred();
    }
    
    public ExpenseType getExpenseType(){   
        return (ExpenseType)super.getTranstype();
    }
    
    @Override
      public BigDecimal getAmount() {
        return super.getAmount();
    }
      
    @Override
       public String getDescription() {
        return super.getDescription();
    }
       
        public PaymentMeans getPaymentMeans() {
        return pay;
    }

    @Override
         public String getComment() {
        return super.getComment();
    }
        
}

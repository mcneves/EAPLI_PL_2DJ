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
public class Expense {

    private String description;
    private Date dateOccurred;
    private BigDecimal amount;
    private ExpenseType exptype;
    private String comment;
<<<<<<< HEAD
    private PaymentMeans pay;
    
    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType exptype, String comment, PaymentMeans pay) {
=======

    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount, ExpenseType exptype, String comment) {
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.dateOccurred=dateOccurred;
        this.exptype=exptype;
        this.amount = amount;
        this.comment=comment;
<<<<<<< HEAD
        this.pay=pay;
    }

    public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType exptype, String comment, PaymentMeans pay) {
        this(description, DateTime.newDate(year, month, day), amount, exptype, comment, pay);
=======
    }

    public Expense(String description, int year, int month, int day, BigDecimal amount, ExpenseType exptype, String comment) {
        this(description, DateTime.newDate(year, month, day), amount, exptype, comment);
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
    }

    public Expense(Expense exp) {
        description = exp.description;
        dateOccurred=exp.dateOccurred;
        amount = exp.amount;
        exptype=exp.exptype;
        comment=exp.comment;
<<<<<<< HEAD
        pay=exp.pay;
=======
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
    }
    @Override
      public String toString() {
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double doubleAmount = this.amount.doubleValue();
            String s = "Description:" + this.description + 
                    "\nAmount:" + n.format(doubleAmount)+
                    "\nType: "+this.exptype+"\nComment: "+this.comment+
                    "\nDate created: " + this.dateOccurred;
            return s;
<<<<<<< HEAD
      }
=======

      }
    
    public Date getDateOccurred(){   
        return dateOccurred;
    }
    
    public ExpenseType getExpenseType(){   
        return exptype;
    }
    
      public BigDecimal getAmount() {
        return amount;
    }

    
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
}

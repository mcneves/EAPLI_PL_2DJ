package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Transaction {
    
    private String description;
    private Date dateOccurred;
    private BigDecimal amount;
    private TransactionType transtype;
    private String comment;
    
    protected Transaction() {
        
    }
    
    

    public Transaction(String description, Date dateOccurred, BigDecimal amount, TransactionType transtype, String comment) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.dateOccurred=dateOccurred;
        this.transtype=transtype;
        this.amount = amount;
        this.comment=comment;
    }

    public Transaction(String description, int year, int month, int day, BigDecimal amount, TransactionType transtype, String comment) {
        this(description, DateTime.newDate(year, month, day), amount, transtype, comment);
    }

    public Transaction(Transaction trans) {
        description = trans.description;
        dateOccurred=trans.dateOccurred;
        amount = trans.amount;
        transtype=trans.transtype;
        comment=trans.comment;
    }
    @Override
      public String toString() {
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double doubleAmount = this.amount.doubleValue();
            String s = "Description:" + this.description + 
                    "\nAmount:" + n.format(doubleAmount)+
                    "\nType: "+this.transtype+"\nComment: "+this.comment+
                    "\nDate created: " + this.dateOccurred;
            return s;

      }
    
   
    public Date getDateOccurred() {
        return dateOccurred;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    
}

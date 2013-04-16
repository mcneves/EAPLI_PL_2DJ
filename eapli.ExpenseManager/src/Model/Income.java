
package Model;

import java.math.BigDecimal;
import java.util.Date;


public class Income extends Transaction{

    protected Income() {
    }

    public Income(Transaction trans) {
        super(trans);
    }

    public Income(String description, Date dateOccurred, BigDecimal amount, TransactionType transtype, String comment) {
        super(description, dateOccurred, amount, transtype, comment);
    }

    public Income(String description, int year, int month, int day, BigDecimal amount, TransactionType transtype, String comment) {
        super(description, year, month, day, amount, transtype, comment);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}

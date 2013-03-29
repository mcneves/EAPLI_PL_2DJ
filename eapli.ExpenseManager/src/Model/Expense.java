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
    private BigDecimal amount;

    protected Expense() {
    }

    public Expense(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
    }

    public Expense(String description, int year, int month, int day, BigDecimal amount) {
        this(description, DateTime.newDate(year, month, day), amount);
    }

    public Expense(Expense exp) {
        description = exp.description;
        amount = exp.amount;
    }
    @Override
      public String toString() {
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            double doubleAmount = this.amount.doubleValue();
            String s = "Description:" + this.description + 
                                       "\nAmount:" + n.format(doubleAmount);
            return s;

      }
}

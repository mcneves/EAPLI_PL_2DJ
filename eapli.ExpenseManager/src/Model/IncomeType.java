
package Model;

import javax.persistence.Entity;

@Entity
public class IncomeType extends TransactionType{

    public IncomeType() {
    }

    
    public IncomeType(String description) {
        super(description);
    }

    public IncomeType(TransactionType transtype) {
        super(transtype);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

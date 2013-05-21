
package Model;

import javax.persistence.Entity;

@Entity
public class IncomeType extends MovementType{

    public IncomeType() {
    }

    
    public IncomeType(String description) {
        super(description);
    }

    public IncomeType(MovementType transtype) {
        super(transtype);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

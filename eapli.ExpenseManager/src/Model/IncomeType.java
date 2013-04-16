
package Model;


public class IncomeType extends TransactionType{

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

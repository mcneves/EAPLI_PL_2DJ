/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pedro
 */
public class ExpenseType extends TransactionType{
    
    
    
    public ExpenseType(String description)
    {
        super(description);
    }
    
    public ExpenseType(ExpenseType exptype)
    {
        super(exptype);
    }
   
     @Override
     public String toString()
     {
         String s = "Description:" + super.getDescription();
         return s;
     }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
     
     
    
}

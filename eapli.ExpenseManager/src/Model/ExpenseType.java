/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Pedro
 */
public class ExpenseType {
    
    private String description;    
    
    public ExpenseType(String description)
    {
        this.description = description;
    }
    
    public ExpenseType(ExpenseType exptype)
    {
        description = exptype.description;
    }
   
     @Override
     public String toString()
     {
         String s = "Description:" + this.description;
         return s;
     }
}

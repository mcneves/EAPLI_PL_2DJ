/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Pedro
 */

@Entity
public class ExpenseType implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

    public ExpenseType() {
    }
    
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

     
    public String getDescription() {
        return description;
    }
     
     
    
}

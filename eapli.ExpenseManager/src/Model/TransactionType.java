
package Model;


public abstract class TransactionType {
    private String description;
    
    public TransactionType(String description)
    {
        this.description = description;
    }
    
    public TransactionType(TransactionType transtype)
    {
        description = transtype.description;
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

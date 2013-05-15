package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class TransactionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

    public TransactionType() {
    }

    public TransactionType(String description) {
        if (description.equals("")) {
            throw new IllegalArgumentException("Error: description empty!");
        }

        this.description = description;
    }

    public TransactionType(TransactionType transtype) {
        description = transtype.description;
    }

    @Override
    public String toString() {
        String s = "Description:" + this.description;
        return s;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
    
}

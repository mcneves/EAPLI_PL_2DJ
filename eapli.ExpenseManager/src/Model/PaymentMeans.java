/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class PaymentMeans implements Serializable
    {

    private static int cont = 0;
    @Id
    private int meansID;
    protected int typeID;
    protected String description;

    public PaymentMeans() {
        meansID = ++cont;
    }

    //distinguir dois cartões de crédito
    public int getMeansID() {
        return meansID;
    }

    //tipos de pagamento: cash, creditcard, debitcard, check
    public int getTypeID() {
        return typeID;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String s = "Payment Mean: " + this.description;
        return s;
    }
    }

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;

/**
 *
 * @author
 */
@Entity
public class Cash extends PaymentMeans
    {

    public Cash() {
        super();
        typeID = 1;
        description = "Cash";
    }
    }
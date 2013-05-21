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
public class DebitCard extends PaymentMeans {

    private int num;
    private String bank;
    
    public DebitCard(){
        
    }

    public DebitCard(int num, String desc, String bank) {
        super();
        typeID = 3;
        this.num = num;
        description = desc;
        this.bank = bank;
    }

    public int getNum() {
        return num;
    }

    public String getBank() {
        return bank;
    }
}

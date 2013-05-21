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
public class Cheque extends PaymentMeans {

    private String bank;
    private int num = -1;

    public Cheque(){
        
    }
    
    public Cheque( int num, String desc, String bank) {
        super();
        typeID = 4;
        description = desc;
        this.num = num;
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }
    
    public int getNum(){
        return num;
    }
    
    
/*
    public ChequeDetails createDetails(int num) {
        ChequeDetails cd = new ChequeDetails(this, num);
        return cd;
    }   */
}

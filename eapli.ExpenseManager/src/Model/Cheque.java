/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author
 */
public class Cheque extends PaymentMeans {

    private String bank;
    private int num;

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
/*
    public ChequeDetails createDetails(int num) {
        ChequeDetails cd = new ChequeDetails(this, num);
        return cd;
    }   */
}

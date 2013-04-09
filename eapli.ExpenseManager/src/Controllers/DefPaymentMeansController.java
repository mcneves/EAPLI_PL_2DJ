/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentMeans;
import Persistence.PaymentMeansRepository;

/**
 *
 * @author
 */
public class DefPaymentMeansController {

    PaymentMeansRepository repo = new PaymentMeansRepository();

    public DefPaymentMeansController() {
    }

    public void createMeansCash() {
        Cash cash = new Cash();
        repo.saveMeans(cash);
    }

    public void createMeansCredit(int num, String desc, String bank) {
        CreditCard cc = new CreditCard(num, desc, bank);
        repo.saveMeans(cc);
    }

    public void createMeansDebit(int num, String desc, String bank) {
        DebitCard dc = new DebitCard(num, desc, bank);
        repo.saveMeans(dc);
    }

    public void showMeans() {
        System.out.println("\n");
        for(PaymentMeans o : repo.getAllMeans()){
            System.out.println(o.getDescription());
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.Cheque;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentMeans;
import Persistence.PaymentMeansRepository;
import Persistence.PersistenceRegistry;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author
 */
public class DefPaymentMeansController {

    public DefPaymentMeansController() {
    }

    public void createMeansCash() {
        Cash cash = new Cash();
        PersistenceRegistry.getInstance().paymentMeansRepository().saveMeans(cash);
    }

    public void createMeansCredit(int num, String desc, String bank) {
        CreditCard cc = new CreditCard(num, desc, bank);
        PersistenceRegistry.getInstance().paymentMeansRepository().saveMeans(cc);
    }

    public void createMeansDebit(int num, String desc, String bank) {
        DebitCard dc = new DebitCard(num, desc, bank);
        PersistenceRegistry.getInstance().paymentMeansRepository().saveMeans(dc);
    }

    public void createMeansCheque(int num, String desc, String bank) {
        Cheque cheque = new Cheque(num, desc, bank);
        PersistenceRegistry.getInstance().paymentMeansRepository().saveMeans(cheque);
    }

     public List<PaymentMeans> ListAllMeans()
    {
        return PersistenceRegistry.getInstance().paymentMeansRepository().getAllMeans();
    }
    

    public void deleteMeans() {
        int del;
        System.out.println("Listing Means");
        ListAllMeans();
        del = Console.readInteger("Choose the mean to eliminate");
        PersistenceRegistry.getInstance().paymentMeansRepository().deleteMeans(--del);
    }
}
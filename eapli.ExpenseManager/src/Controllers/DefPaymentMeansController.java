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
import Persistence.IPaymentMeansRepository;
import Persistence.PaymentMeansRepository;
import Persistence.PersistenceFactory;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author
 */
public class DefPaymentMeansController extends BaseController{

    public DefPaymentMeansController() {
    }

    public void createMeansCash() {
        Cash cash = new Cash();
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        repo.saveMeans(cash);
    }

    public void createMeansCredit(int num, String desc, String bank) {
        CreditCard cc = new CreditCard(num, desc, bank);
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        repo.saveMeans(cc);
    }

    public void createMeansDebit(int num, String desc, String bank) {
        DebitCard dc = new DebitCard(num, desc, bank);
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        repo.saveMeans(dc);
    }

    public void createMeansCheque(int num, String desc, String bank) {
        Cheque cheque = new Cheque(num, desc, bank);
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        repo.saveMeans(cheque);
    }

     public List<PaymentMeans> ListAllMeans()
    {
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();
        return repo.getAllMeans();
    }
    

    public void deleteMeans() {
        int del;
        System.out.println("Listing Means");
        ListAllMeans();
        del = Console.readInteger("Choose the mean to eliminate");
        PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository().deleteMeans(--del);
    }
}
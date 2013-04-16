/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
<<<<<<< HEAD
import Model.PaymentMeans;
import Persistence.PersistenceRegistry;
import java.util.List;
=======
import Model.Cheque;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentMeans;
import Persistence.PaymentMeansRepository;
import eapli.util.Console;
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f

/**
 *
 * @author
 */
public class DefPaymentMeansController {

<<<<<<< HEAD
=======
    PaymentMeansRepository repo = new PaymentMeansRepository();

>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
    public DefPaymentMeansController() {
    }

    public void createMeansCash() {
        Cash cash = new Cash();
<<<<<<< HEAD
        PersistenceRegistry.getInstance().paymentMeansRepository().saveMeans(cash);
    }
    
    public List<PaymentMeans> ListAllMeans()
    {
        return PersistenceRegistry.getInstance().paymentMeansRepository().getAllMeans();
    }
}
=======
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

    public void createMeansCheque(int num, String desc, String bank) {
        Cheque cheque = new Cheque(num, desc, bank);
        repo.saveMeans(cheque);
    }

    public void showMeans() {
        int cont = 0;
        System.out.println("\n");
        for (PaymentMeans o : repo.getAllMeans()) {
            System.out.println(++cont + "\t-\t" + o.getDescription());
        }
    }

    public void deleteMeans() {
        int del;
        System.out.println("Listing Means");
        showMeans();
        del = Console.readInteger("Choose the mean to eliminate");
        repo.deleteMeans(--del);
    }
}
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f

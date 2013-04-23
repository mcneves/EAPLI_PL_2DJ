/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Cash;
import Model.Cheque;
import Model.CreditCard;
import Model.DebitCard;
import Persistence.IPaymentMeansRepository;
import Persistence.PaymentMeansRepository;

/**
 *
 * @author
 */
public class PaymentMeansBootStrapper {

    static {
        IPaymentMeansRepository repo = new PaymentMeansRepository();

        repo.saveMeans(new Cash());
        repo.saveMeans(new CreditCard(123, "My credit card", "My bank"));
        repo.saveMeans(new CreditCard(321, "My other credit card", "My other bank"));
        repo.saveMeans(new DebitCard(456, "My debit card", "My bank"));
        repo.saveMeans(new DebitCard(654, "My other debit card", "My other bank"));
        repo.saveMeans(new Cheque(789, "My first cheque", "My bank"));
        repo.saveMeans(new Cheque(987, "My second cheque", "My other bank"));
    }
}
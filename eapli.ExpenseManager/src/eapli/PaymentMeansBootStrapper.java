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
import Persistence.PersistenceFactory;

/**
 *
 * @author
 */
public class PaymentMeansBootStrapper {

    static {
        IPaymentMeansRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getPaymentMeansRepository();

        repo.saveMeans(new Cash());
        repo.saveMeans(new CreditCard(123, "CartaoCredito1", "Banco1"));
        repo.saveMeans(new CreditCard(321, "CartaoCredito2", "Banco2"));
        repo.saveMeans(new DebitCard(456, "CartaoDebito", "Banco1"));
        repo.saveMeans(new DebitCard(654, "CartaoDebito2", "Banco2"));
        repo.saveMeans(new Cheque(789, "Cheque1", "Banco1"));
        repo.saveMeans(new Cheque(987, "Cheque2", "Banco2"));
    }
}
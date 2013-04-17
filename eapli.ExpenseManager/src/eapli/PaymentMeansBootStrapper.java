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
 * @author i060752
 */
public class PaymentMeansBootStrapper {
    
    static {
        
        IPaymentMeansRepository repo = new PaymentMeansRepository();
        
        repo.saveMeans(new Cash());
        repo.saveMeans(new CreditCard(123456789, "Cartao Credito 1", "BES"));
        repo.saveMeans(new DebitCard(987654321, "Cartao Debito 1", "BES"));
        repo.saveMeans(new Cheque(1, "Cheque 1", "BES"));
    }    
}

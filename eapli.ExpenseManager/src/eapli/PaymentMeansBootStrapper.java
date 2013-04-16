/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli;

import Model.Cash;
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
//        repo.saveMeans(new DebitCard());
//        repo.saveMeans(new CreditCard());
//        repo.saveMeans(new Check());
    }    
}

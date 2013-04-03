/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Persistence.PaymentMeansRepository;

/**
 *
 * @author
 */
public class DefPaymentMeansController {

    public DefPaymentMeansController() {
    }

    public void createMeansCash() {
        Cash cash = new Cash();
        PaymentMeansRepository repo = new PaymentMeansRepository();
        repo.saveMeans(cash);
    }
}
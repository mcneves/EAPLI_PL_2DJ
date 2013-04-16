/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Cash;
import Model.PaymentMeans;
import Persistence.PersistenceRegistry;
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
    
    public List<PaymentMeans> ListAllMeans()
    {
        return PersistenceRegistry.getInstance().paymentMeansRepository().getAllMeans();
    }
}
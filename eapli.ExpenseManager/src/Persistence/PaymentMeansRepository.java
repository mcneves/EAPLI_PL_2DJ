/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMeans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class PaymentMeansRepository implements IPaymentMeansRepository{

    private static List<PaymentMeans> listMeans = new ArrayList<>();

    public PaymentMeansRepository() {
    }

    @Override
    public void saveMeans(PaymentMeans pm) {
        if (pm == null) {
            throw new IllegalArgumentException();
        }
        listMeans.add(pm);
    }

    @Override
    public List<PaymentMeans> getAllMeans() {
        return Collections.unmodifiableList(listMeans);
    }    
}

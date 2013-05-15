/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.PaymentMeans;
import Persistence.IPaymentMeansRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class PaymentMeansInMemoryRepository implements IPaymentMeansRepository{

    private static List<PaymentMeans> listMeans = new ArrayList<>();

    public PaymentMeansInMemoryRepository() {
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

    @Override
    public void deleteMeans(int del) {
        listMeans.remove(del);
    }
}


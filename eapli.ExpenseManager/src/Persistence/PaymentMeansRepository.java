<<<<<<< HEAD
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
=======
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
public class PaymentMeansRepository {

    private static List<PaymentMeans> listMeans = new ArrayList<>();

    public PaymentMeansRepository() {
    }

    public void saveMeans(PaymentMeans pm) {
        if (pm == null) {
            throw new IllegalArgumentException();
        }
        listMeans.add(pm);
    }

    public List<PaymentMeans> getAllMeans() {
        return Collections.unmodifiableList(listMeans);
    }

    public void deleteMeans(int del) {
        listMeans.remove(del);
    }
}
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f

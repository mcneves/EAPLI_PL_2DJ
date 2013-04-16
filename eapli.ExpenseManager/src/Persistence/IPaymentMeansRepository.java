/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMeans;
import java.util.List;

/**
 *
 * @author i060752
 */
public interface IPaymentMeansRepository {
    
    void saveMeans(PaymentMeans pm);
    
    List<PaymentMeans> getAllMeans();
    
    void deleteMeans(int del);
}

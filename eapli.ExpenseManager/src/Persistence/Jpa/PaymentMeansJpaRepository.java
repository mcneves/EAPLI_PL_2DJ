/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Jpa;

import Model.PaymentMeans;
import Persistence.IPaymentMeansRepository;
import java.util.List;

/**
 *
 * @author i060752
 */
public class PaymentMeansJpaRepository extends JpaGeneric<PaymentMeans, Integer> implements IPaymentMeansRepository{
      @Override
      public void saveMeans(PaymentMeans pm){
            save(pm);
      }

      @Override
     public List<PaymentMeans> getAllMeans(){
            return all();
      }
      
     @Override
     public void deleteMeans(int del){
         PaymentMeans pay;
         pay=read(del);
         delete(pay);
      }
}
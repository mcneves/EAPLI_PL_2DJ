/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefPaymentMeansController;
import Model.PaymentMeans;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author
 */
public class DefPaymentMeansUI {

    public DefPaymentMeansUI() {
    }

    public void loop() {
        int op;
        DefPaymentMeansController controller = new DefPaymentMeansController();
        DefPaymentMeansController dpmc = new DefPaymentMeansController();
        List<PaymentMeans> listMeans = dpmc.ListAllMeans();
        DefPaymentMeansUI defui = new DefPaymentMeansUI();
        defui.displayList(listMeans);
        
        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println(" End create means");
                    break;
                case 1:
                    controller.createMeansCash();
                    System.out.println("Mean successfully created");
                    break;
                case 5:
                    displayList(listMeans);
                    break;
                default:
                    System.out.println("Wrong option. Please repeat");
                    break;
            }
        } while (op != 0);
    }

    private int menu() {
        System.out.println("* * *  DEFINE MEANS  * * *\n");
        System.out.println("1. Define cash");
        System.out.println("2. Define credit card");
        System.out.println("3. Define debit card");
        System.out.println("4. Define cheque");
        System.out.println("5. Show Payment means");
        System.out.println("0. End define means\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }
    
    public void displayList(List<PaymentMeans> listMeans){
        int i=0;
        System.out.println("List of Payment Means\n");
        for (PaymentMeans payMean : listMeans) {
            i=i+1;
            System.out.println("Mean "+i+"\n" + payMean);
        }
    }
}

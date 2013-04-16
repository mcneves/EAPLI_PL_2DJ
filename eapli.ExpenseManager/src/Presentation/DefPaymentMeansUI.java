/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefPaymentMeansController;
<<<<<<< HEAD
import Model.PaymentMeans;
import eapli.util.Console;
import java.util.List;
=======
import eapli.util.Console;
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f

/**
 *
 * @author
 */
public class DefPaymentMeansUI {

<<<<<<< HEAD
    public DefPaymentMeansUI() {
    }

    public void loop() {
        int op;
        DefPaymentMeansController controller = new DefPaymentMeansController();
        DefPaymentMeansController dpmc = new DefPaymentMeansController();
        List<PaymentMeans> listMeans = dpmc.ListAllMeans();
        DefPaymentMeansUI defui = new DefPaymentMeansUI();
        defui.displayList(listMeans);
        
=======
    DefPaymentMeansController controller = new DefPaymentMeansController();

    public DefPaymentMeansUI() {
    }

    public void header() {
        System.out.println("Define Payment Means");
    }

    public void run() {
        int op;
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
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
<<<<<<< HEAD
                case 5:
                    displayList(listMeans);
=======
                case 2:
                    createMeansCreditUI();
                    System.out.println("Mean successfully created");
                    break;
                case 3:
                    createMeansDebitUI();
                    System.out.println("Mean successfully created");
                    break;
                case 4:
                    createMeansChequeUI();
                    System.out.println("Mean successfully created");
                    break;
                case 5:
                    controller.showMeans();
                    break;
                case 6:
                    controller.deleteMeans();
                    System.out.println("Mean successfully deleted");
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
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
<<<<<<< HEAD
        System.out.println("5. Show Payment means");
=======
        System.out.println("5. Show Payment Means");
        System.out.println("6. Delete Payment Mean");
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
        System.out.println("0. End define means\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }
<<<<<<< HEAD
    
    public void displayList(List<PaymentMeans> listMeans){
        int i=0;
        System.out.println("List of Payment Means\n");
        for (PaymentMeans payMean : listMeans) {
            i=i+1;
            System.out.println("Mean "+i+"\n" + payMean);
        }
=======

    public void createMeansCreditUI() {
        System.out.println("* * *  DEFINE A CREDIT CARD  * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        controller.createMeansCredit(num, desc, bank);
    }

    public void createMeansDebitUI() {
        System.out.println("* * *  DEFINE A DEBIT CARD  * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        controller.createMeansDebit(num, desc, bank);
    }

    public void createMeansChequeUI() {
        System.out.println("* * *  DEFINE A CHEQUE * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        controller.createMeansCheque(num, desc, bank);
>>>>>>> 0fc207e86fe3c055e7d3360a5bd0a6bf73e32f2f
    }
}

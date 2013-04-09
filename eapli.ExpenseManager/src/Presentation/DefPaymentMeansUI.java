/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.DefPaymentMeansController;
import eapli.util.Console;

/**
 *
 * @author
 */
public class DefPaymentMeansUI /*extends BaseUI*/ {

    DefPaymentMeansController controller = new DefPaymentMeansController();

    /*@Override
     public BaseController controller() {
     return controller;
     }*/
    public DefPaymentMeansUI() {
    }

    public void header() {
        System.out.println("Define Payment Means");
    }

    public void run() {
        int op;
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
                case 2:
                    createMeansCreditUI();
                    System.out.println("Mean successfully created");
                    break;
                case 3:
                    createMeansDebitUI();
                    System.out.println("Mean successfully created");
                    break;
                case 5:
                    controller.showMeans();
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
        System.out.println("5. Show Payment Means");
        System.out.println("0. End define means\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }

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
}

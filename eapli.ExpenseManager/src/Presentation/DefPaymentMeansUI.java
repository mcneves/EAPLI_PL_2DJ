/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.DefPaymentMeansController;
import Model.PaymentMeans;
import eapli.util.Console;
import java.util.List;
import Persistence.PersistenceRegistry;

/**
 *
 * @author
 */
public class DefPaymentMeansUI extends BaseUI
    {

    DefPaymentMeansController basecontroller = new DefPaymentMeansController();

    public DefPaymentMeansUI() {
    }

    @Override
    protected BaseController controller() {
        return basecontroller;
    }

    @Override
    public void header() {
        System.out.print("Define Payment Means");
    }

    @Override
    public void run() {
        int op;
        DefPaymentMeansController defcontroller = new DefPaymentMeansController();
        List<PaymentMeans> listMeans = defcontroller.ListAllMeans();
        DefPaymentMeansUI defui = new DefPaymentMeansUI();
        defui.displayList(listMeans);

        do {
            op = menu();
            switch (op) {
                case 0:
                    System.out.println(" End create means");
                    break;
                case 1:
                    defcontroller.createMeansCash();
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
                case 4:
                    createMeansChequeUI();
                    System.out.println("Mean successfully created");
                    break;
                case 5:
                    listMeans = defcontroller.ListAllMeans();
                    displayList(listMeans);
                    break;
//                case 6:
//                    defcontroller.deleteMeans();
//                    System.out.println("Mean successfully deleted");
//                    break;
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
        System.out.println("6. Delete Payment Mean");
        System.out.println("0. End define means\n\n");
        int op = Console.readInteger("Choose an option");
        return op;
    }

    public void displayList(List<PaymentMeans> listMeans) {
        int i = 0;
        System.out.println("List of Payment Means\n");
        for (PaymentMeans payMean : listMeans) {
            i = i + 1;
            System.out.println("Mean " + i + "\n" + payMean);
        }
    }

    public void createMeansCreditUI() {
        DefPaymentMeansController defcontroller = new DefPaymentMeansController();
        System.out.println("* * *  DEFINE A CREDIT CARD  * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        defcontroller.createMeansCredit(num, desc, bank);
    }

    public void createMeansDebitUI() {
        DefPaymentMeansController defcontroller = new DefPaymentMeansController();
        System.out.println("* * *  DEFINE A DEBIT CARD  * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        defcontroller.createMeansDebit(num, desc, bank);
    }

    public void createMeansChequeUI() {
        DefPaymentMeansController defcontroller = new DefPaymentMeansController();
        System.out.println("* * *  DEFINE A CHEQUE * * *\n");
        String desc = Console.readLine("Description:");
        int num = Console.readInteger("Number:");
        String bank = Console.readLine("Bank:");
        defcontroller.createMeansCheque(num, desc, bank);
    }
    }

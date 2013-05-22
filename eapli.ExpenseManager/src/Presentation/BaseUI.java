/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Model.AccountServices;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author sv02
 */
public abstract class BaseUI
    {
    
    protected abstract BaseController controller();
    public abstract void header();
    public abstract void run();

    public BaseUI() {
    };
        
    public void show() {
        this.header();
        this.run();
        this.showBalances();

    }

    public void showBalances() {
        BigDecimal wb;
        BigDecimal mb;

        wb = controller().getThisWeekExpenditure();
        mb = controller().getThisMonthExpenditure();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("");
        System.out.println("This week's expenditures  are: " + n.format(wb.doubleValue()));
        System.out.println("This months' expenditures are: " + n.format(mb.doubleValue()));
        
        //adicionado print com o balance
        AccountServices accServ = new AccountServices();
        System.out.println("Balance : " + accServ.getBalance() +"€");
        
    }
    
    
    
    }
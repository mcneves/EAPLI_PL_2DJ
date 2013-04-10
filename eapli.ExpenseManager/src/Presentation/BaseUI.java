/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author sv02
 */
public class BaseUI
    {

    public BaseUI() {
    };
        
        public void show() {
        this.header();
        this.run();
        this.showBalances();

    }

    public void showBalances() {
        BaseController baseController = new BaseController();
        BigDecimal wb;
        BigDecimal mb;

        wb = baseController.getThisWeekExpenditure();
        mb = baseController.getThisMonthExpenditure();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("This week's expenditures  are: " + n.format(wb.doubleValue()));
        System.out.println("This months' expenditures are: " + n.format(mb.doubleValue()));
    }

    public void run() {
    }

    public void header() {
    }
    }

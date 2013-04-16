package Presentation;

import Controllers.ExpenseConsultMonthController;
import eapli.util.Console;
import java.math.BigDecimal;

public class ExpenseConsultMonthUI {

    public ExpenseConsultMonthUI() {
    }

    public void DisplayTotalExpensesMonth() {

        int month = Console.readInteger("Month:");
        ExpenseConsultMonthController expConMonController = new ExpenseConsultMonthController();


        System.out.println("No mês " + month + " gastou " + round(expConMonController.getExpensesMonth(month), 2, true) + "€");
        System.out.println("Press <Enter> to continue!");
        try {
            System.in.read();
        } catch (Exception exc) {
        }
    }

    //método para arredondar BigDecimal, se valor booleano definido a true, arredonta para cima
    //se definido a false arredonda sempre para baixo.
    //round (BigDecimal NUMBER, Nº de casas decimais, true/false)
    public static BigDecimal round(BigDecimal d, int scale, boolean roundUp) {
        int mode = (roundUp) ? BigDecimal.ROUND_UP : BigDecimal.ROUND_DOWN;
        return d.setScale(scale, mode);
    }
}

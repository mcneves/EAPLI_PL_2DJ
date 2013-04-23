package Presentation;

import Controllers.ExpenseConsultMonthDTOController;
import Model.ExpenseDTO;
import static Presentation.ExpenseConsultMonthUI.round;
import eapli.util.*;
import java.util.List;

public class ExpenseConsultMonthDTOUI {

    public ExpenseConsultMonthDTOUI() {
    }

    public void DisplayTotalExpensesMonth() {

        int month = Console.readInteger("Month:");
        ExpenseConsultMonthDTOController controller = new ExpenseConsultMonthDTOController();
        List<ExpenseDTO> listDTO = controller.getExpensesMonth(month);
        
        System.out.println("<<Start Of List>>");
        for (ExpenseDTO e : listDTO) {
            System.out.println("");
            System.out.println(e.getAmount() + " " + e.getExptype()+ " " + e.getPay() + " " + e.getDateOccurred() + " " + e.getDescription() + " " + e.getComment());
            System.out.println("");
        }
        
        System.out.println("<<End Of List>>");
  
    }

}


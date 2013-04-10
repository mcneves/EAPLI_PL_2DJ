/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Expense;
import Model.ExpenseType;
import java.util.*;

/**
 *
 * @author FGCM
 */
public class ExpenseRecord {

    public ExpenseRecord() {
    }

    public List<Expense> getMonthExpenses(List<Expense> listExpense, int month) {

        List<Expense> listMonthExpenses = new ArrayList<>();

        for (int i = 0; i < listExpense.size(); i++) {

            Calendar cal = Calendar.getInstance();
            cal.setTime(listExpense.get(i).getDateOccurred());
            if (cal.get(Calendar.MONTH) == month - 1) {
                listMonthExpenses.add(listExpense.get(i));
            }

        }

        return listMonthExpenses;
    }

    /*
     public List<Expense> getThisWeeksExpenses(List<Expense> listExpense) {
     List<Expense> listThisWeekExpenses = new ArrayList<>();
     Calendar c = Calendar.getInstance();
     // firstDayOfWeek
     // thisWeek
     c.add(Calendar.WEEK_OF_YEAR, 0);
     // firstDay
     c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
     //lastDayOfWeek
     c = (Calendar) c.clone();
     // first day of this week
     c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
     // last day of previous week
     c.add(Calendar.DAY_OF_MONTH, -1);
     for (int i = 0; i < listExpense.size(); i++) {
     cal.setTime(listExpense.get(i).getDateOccurred());
     if (cal.get(Calendar.MONTH) == month - 1) {
     listMonthExpenses.add(listExpense.get(i));
     }
     }
     return listThisWeekExpenses;
     }
     */
    
    public List<Expense> getExpensesByType(List<Expense> listExpense, ExpenseType exptype) {

        List<Expense> listTypeExpenses = new ArrayList<>();

        // percorrer listExpense
        for (Expense e : listExpense) {
            // verificar igualdade
            if (e.getExpenseType().getDescription() == exptype.getDescription()) {
                //adicionar quando igual
                listTypeExpenses.add(e);
            }
        }

        return listTypeExpenses;
    }
}
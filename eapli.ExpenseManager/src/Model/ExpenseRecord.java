/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ExpenseRecord
    {

    private List<Expense> listExpenses;
    private Iterable<Expense> list;

    public ExpenseRecord(List<Expense> expenseList) {
        this.listExpenses = expenseList;
    }

    public BigDecimal getExpenditure() {
        BigDecimal expenditure = new BigDecimal("0");
        for (Expense e : listExpenses) {
            expenditure = expenditure.add(e.getAmount());
        }

        return expenditure;


    }

    public BigDecimal getThisWeekExpenditure() {

        BigDecimal total = new BigDecimal(0);
        Expense temp;
        int weekMinValue = 0;
        int weekMaxValue = 0;
        Calendar cal2 = Calendar.getInstance();
        switch (cal2.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 6;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR);
                break;
            case Calendar.SATURDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 5;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 1;
                break;
            case Calendar.FRIDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 4;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 2;
                break;
            case Calendar.THURSDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 3;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 3;
                break;
            case Calendar.WEDNESDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 2;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 4;
                break;
            case Calendar.TUESDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR) - 1;
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 5;
                break;
            case Calendar.MONDAY:
                weekMinValue = cal2.get(Calendar.DAY_OF_YEAR);
                weekMaxValue = cal2.get(Calendar.DAY_OF_YEAR) + 6;
                break;
        }

        for (int i = 0; i < listExpenses.size(); i++) {
            temp = listExpenses.get(i);
            Calendar cal = Calendar.getInstance();
            cal.setTime(temp.getDateOccurred());
            if (cal.get(Calendar.DAY_OF_YEAR) <= weekMaxValue && cal.get(Calendar.DAY_OF_YEAR) >= weekMinValue) {
                total = total.add(temp.getAmount());
            }


        }

        return total;
    }

    public BigDecimal getThisMonthExpenditure() {
        BigDecimal total = new BigDecimal(0);
        Expense temp;
        int currentMonth = DateTime.currentMonth();
        int monthNumber;

        for (int i = 0; i < listExpenses.size(); i++) {
            temp = listExpenses.get(i);
            Calendar cal = Calendar.getInstance();
            cal.setTime(temp.getDateOccurred());
            monthNumber = cal.get(Calendar.MONTH) + 1;
            if (monthNumber == currentMonth) {
                total = total.add(temp.getAmount());
            }


        }

        return total;

    }

    public BigDecimal getExpenseMonth(int month) {
        BigDecimal total = new BigDecimal("0");


        for (Expense exp : list) {
            Calendar cal;
            cal = DateTime.dateToCalendar(exp.getDateOccurred());

            int temp = cal.get(Calendar.MONTH);
            if (temp == (month - 1)) {
                total = total.add(exp.getAmount());
            }
        }

        return total;
    }
    
    
        public List<Expense> getExpensesByType(List<Expense> listExpense, ExpenseType exptype) {

        List<Expense> listTypeExpenses = new ArrayList<Expense>();

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


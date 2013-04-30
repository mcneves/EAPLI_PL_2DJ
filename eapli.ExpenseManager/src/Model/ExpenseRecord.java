/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;


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
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setFirstDayOfWeek(Calendar.MONDAY);
        currentCalendar.setMinimalDaysInFirstWeek(4);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        Calendar expenseCalendar = Calendar.getInstance();
        for (int i = 0; i < listExpenses.size(); i++) {
            temp = listExpenses.get(i);
            Date dateOccurred = temp.getDateOccurred();
            int year = Integer.parseInt(simpleDateFormat.format(dateOccurred)) + 1900;
            expenseCalendar.set(year, dateOccurred.getMonth(), dateOccurred.getDate());
            expenseCalendar.setFirstDayOfWeek(Calendar.MONDAY);
            expenseCalendar.setMinimalDaysInFirstWeek(4);
            if (expenseCalendar.get(Calendar.WEEK_OF_YEAR) == currentCalendar.get(Calendar.WEEK_OF_YEAR)) {
                total = total.add(temp.getAmount());
            }


        }

        return total;
    }

    public BigDecimal getThisMonthExpenditure() {
        BigDecimal total = new BigDecimal(0);
        Expense temp;
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < listExpenses.size(); i++) {
            temp = listExpenses.get(i);
            Calendar cal = Calendar.getInstance();
            cal.setTime(temp.getDateOccurred());

            if (currentMonth == cal.get(Calendar.MONTH) && currentYear == cal.get(Calendar.YEAR)) {
                total = total.add(temp.getAmount());
            }
        }
        return total;
    }

    public BigDecimal getExpenseMonth(int month) {
        BigDecimal total = new BigDecimal("0");


        for (Expense exp : listExpenses) {
            Calendar cal;
            cal = DateTime.dateToCalendar(exp.getDateOccurred());

            int temp = cal.get(Calendar.MONTH);
            if (temp == (month - 1)) {
                total = total.add(exp.getAmount());

            }
        }

        return total;
    }

    
    public List<Expense> getListOfExpensesMonth(int month) {

        List<Expense> newList = new ArrayList<Expense>();
        for (Expense exp : listExpenses) {
            Calendar cal;
            cal = DateTime.dateToCalendar(exp.getDateOccurred());

            int temp = cal.get(Calendar.MONTH);
            if (temp == (month - 1)) {
                newList.add(exp);
            }
        }
        return newList;
    }

    
    public List<Expense> getExpensesByType(List<Expense> listExpense, ExpenseType exptype) {

        List<Expense> listTypeExpenses = new ArrayList<Expense>();

        // percorrer listExpense
        for (Expense e : listExpense) {
            // verificar igualdade
            if (e.getExpenseType().getDescription().equals(exptype.getDescription())) {
                //adicionar quando igual
                listTypeExpenses.add(e);
            }
        }

        return listTypeExpenses;
    }
        
        
    }

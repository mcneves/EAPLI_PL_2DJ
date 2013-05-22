/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;
import Persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author sv02
 */
public class BaseController
    {
        public BaseController(){
            
        };
        
        public static BigDecimal getThisWeekExpenditure(){
            ExpenseRecord expenseRecord;
            BigDecimal weekExpenditure = new BigDecimal(0);
            List<Expense> expenseList;
            IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
            expenseList = repo.getAllExpenses();
            expenseRecord = new ExpenseRecord(expenseList);
            weekExpenditure = expenseRecord.getThisWeekExpenditure();
            return weekExpenditure;
        };
        
        public static BigDecimal getThisMonthExpenditure(){
            ExpenseRecord expenseRecord;
            BigDecimal monthExpenditure = new BigDecimal(0);;
            List<Expense> expenseList;
            IExpenseRepository repo = PersistenceFactory.getInstance().buildRepositoryFactory().getExpenseRepository();
            expenseList = repo.getAllExpenses();
            expenseRecord = new ExpenseRecord(expenseList);
            monthExpenditure = expenseRecord.getThisMonthExpenditure();
            return monthExpenditure;
        };
        
    
    }

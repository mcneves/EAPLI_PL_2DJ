/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author sv02
 */
public class ExpenseRecordTest
    {

    ExpenseRecord instance1;
    ExpenseRecord instance2;
    ExpenseRecord instance3;
    ExpenseRecord instance4;

    public ExpenseRecordTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<Expense> expenseArray = new ArrayList();
        instance1 = new ExpenseRecord(new ArrayList());
        expenseArray.add(new Expense("Autocarro", DateTime.today().getTime(), new BigDecimal(2.0), new ExpenseType("transporte"), "", new Cash()));
        expenseArray.add(new Expense("Autocarro", DateTime.today().getTime(), new BigDecimal(2.0), new ExpenseType("transporte"), "", new Cash()));
        expenseArray.add(new Expense("Almoço", DateTime.today().getTime(), new BigDecimal(12), new ExpenseType("refeições"), "", new Cash()));
        expenseArray.add(new Expense("Sapatilhas", DateTime.today().getTime(), new BigDecimal(12), new ExpenseType("vestuário"), "", new Cash()));
        expenseArray.add(new Expense("Cinema", DateTime.today().getTime(), new BigDecimal(5.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.MONTH, 1);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.MONTH, -2);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, -1);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.YEAR, 2);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        instance2 = new ExpenseRecord(expenseArray);
        expenseArray = new ArrayList();
        calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.MONTH, -2);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, -1);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        calendar.add(Calendar.YEAR, 2);
        expenseArray.add(new Expense("Cinema", calendar.getTime(), new BigDecimal(100.0), new ExpenseType("lazer"), "", new Cash()));
        instance3 = new ExpenseRecord(expenseArray);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getExpenditure method, of class ExpenseRecord.
     */
    @Ignore("Not yet Developed")
    public void testGetExpenditureBase() {
        System.out.println("getExpenditure");
        BigDecimal expResult = new BigDecimal(0.0);
        BigDecimal result = instance1.getExpenditure();
        expResult.setScale(5, BigDecimal.ROUND_HALF_UP);
        result.setScale(5, BigDecimal.ROUND_HALF_UP);
        assertTrue(expResult.compareTo(result) == 0);
    }

    @Ignore("Not yet Developed")
    public void testGetExpenditure1() {
        System.out.println("getExpenditure");
        BigDecimal expResult = new BigDecimal(53);
        BigDecimal result = instance2.getExpenditure();
        expResult.setScale(5, BigDecimal.ROUND_HALF_UP);
        result.setScale(5, BigDecimal.ROUND_HALF_UP);
        assertTrue(expResult.compareTo(result) == 0);
    }

    /**
     * Test of getThisWeekExpenditure method, of class ExpenseRecord.
     */
    @Ignore("Not yet Developed")
    public void testGetThisWeekExpenditure() {
        System.out.println("getThisWeekExpenditure");
        ExpenseRecord instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getThisWeekExpenditure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThisMonthExpenditure method, of class ExpenseRecord.
     */
    @Test
    public void testGetThisMonthExpenditure1() {
        System.out.println("getThisMonthExpenditure");
        BigDecimal expResult = new BigDecimal(0.0);
        BigDecimal result = instance1.getThisMonthExpenditure();
        result = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        expResult = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        assertTrue(expResult.compareTo(result) == 0);
    }

    @Test
    public void testGetThisMonthExpenditure2() {
        System.out.println("getThisMonthExpenditure1");
        BigDecimal expResult = new BigDecimal(33.8);
        BigDecimal result = instance2.getThisMonthExpenditure();
        result = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        expResult = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        assertTrue(expResult.compareTo(result) == 0);
    }
    
        @Test
    public void testGetThisMonthExpenditure3() {
        System.out.println("getThisMonthExpenditure");
        BigDecimal expResult = new BigDecimal(0.0);
        BigDecimal result = instance3.getThisMonthExpenditure();
        result = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        expResult = result.setScale(5, BigDecimal.ROUND_HALF_UP);
        assertTrue(expResult.compareTo(result) == 0);
    }

    /**
     * Test of getExpenseMonth method, of class ExpenseRecord.
     */
    @Ignore("not yet developed")
    public void testGetExpenseMonth() {
        System.out.println("getExpenseMonth");
        int month = 0;
        ExpenseRecord instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getExpenseMonth(month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfExpensesMonth method, of class ExpenseRecord.
     */
    @Ignore("not yet developed")
    public void testGetListOfExpensesMonth() {
        System.out.println("getListOfExpensesMonth");
        int month = 0;
        ExpenseRecord instance = null;
        List expResult = null;
        List result = instance.getListOfExpensesMonth(month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpensesByType method, of class ExpenseRecord.
     */
    @Ignore("not yet developed")
    public void testGetExpensesByType() {
        System.out.println("getExpensesByType");
        List<Expense> listExpense = null;
        ExpenseType exptype = null;
        ExpenseRecord instance = null;
        List expResult = null;
        List result = instance.getExpensesByType(listExpense, exptype);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    }
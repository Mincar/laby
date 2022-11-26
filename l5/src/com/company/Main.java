package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Main {
    public static int sum (int x, int y){
        return x+y;
    }
    public static int division (int x, int y){
        if(y==0)
        {
            throw new IllegalArgumentException("divider is 0");
        }
        return x/y;
    }
    public static void main(String[] args) {
	// write your code here
        if(sum(1,3)==4)
        {
            System.out.println("Test1 passed");
        } else
        {
            System.out.println("Test1 failed");
        }
        try
        {
            int z = division(1,0);
            System.out.println("Test3 failed");
        } catch (IllegalArgumentException e)
        {
            System.out.println("Test3 passed");
        }
    }

    @Test
    public void testSum() {
        System.out.println("сумма");
        int x = 4;
        int y = 2;
        int expResult = 6;
        int result = Main.sum(x, y);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");

    }

    /**
     * Test of division method, of class Laba5.
     */
    @Test
    public void testDivision() {
        System.out.println("деление");
        int x = 0;
        int y = 5;
        int expResult = 5;
        int result = Main.division(x, y);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Laba5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testDivisionByZero() {
        int x = 5;
        int y = 1;
        int expResult = 5;
        try
        {
            int result= Main.division(x,y);
            assertEquals(expResult, result);
            if(y==0) fail("Деление на ноль не дает исключительной ситуации");
        } catch (IllegalArgumentException e)
        {
            if(y!=0) fail("Генерация исключения при ненулевом знаменателе");
        }
    }
}

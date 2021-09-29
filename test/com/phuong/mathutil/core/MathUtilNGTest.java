/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.core;

import org.junit.runners.Parameterized;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class MathUtilNGTest {
    
    public MathUtilNGTest() {
    }

    /**
     * Test of getFactorial method, of class MathUtil.
     */
    @Test
    public void testGetFactorial() {
        System.out.println("getFactorial");
        int n = 5;
        long expResult = 120;
        long result = MathUtil.getFactorial(n);
        assertEquals(result, expResult);
        //fail("The test case is a prototype.");
    }
    @Parameterized.Parameter(value = 0)
    private int input;
    @Parameterized.Parameter(value = 1)
    private long output;
    
    @DataProvider(name = "data-provider")
    public static Object[][] initData(){
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {3, 6}
        };
    }
    
    @Test
    public void checkFactorialReturnsResultWell(){
        assertEquals(output, input);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kringe.mathutil.test;

import static com.kringe.mathutil.MathUtils.*; //import static -> khi gọi hàm ko cần class(.)
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author nguye
 */

public class MathUtilsTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsCorrectResult(){
        int n = 5;
        int expected = 120;
        
        long actual = getFactorial(n);
        
        assertEquals(expected, actual);
        
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        
    }
    
    //@Test(expected = IllegalArgumentException.class)
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWrongArgumentThrowsException(){
        getFactorial(-5);       
        getFactorial(21);       
        getFactorial(40);       
    }
}





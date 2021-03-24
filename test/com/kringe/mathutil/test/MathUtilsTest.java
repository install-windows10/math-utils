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
        
        
        
    }
    
    //@Test(expected = IllegalArgumentException.class)
    @Test (expected = IllegalArgumentException.class)
    public void testFactorialWrongArgumentThrowsException(){
        getFactorial(-5);       
        getFactorial(21);       
        getFactorial(40);       
    }
}





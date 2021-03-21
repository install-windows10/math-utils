/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kringe.test;

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
        
        long actual = Utils.MathUtils.getFactorial(n);
        
        assertEquals(expected, actual);
    }
    
}

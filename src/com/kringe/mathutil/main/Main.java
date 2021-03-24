package com.kringe.mathutil.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        //Testing 5! = 120
        long expected = 120;
        int n = 5;
        long actual = com.kringe.mathutil.MathUtils.getFactorial(n);
        
        System.out.println("5!"
                + "\nExpected: " +expected 
                +"\nActual: " +actual);
        
        //Testing 0! = 1????
        
        expected = 1;
        n = 0;
        actual = com.kringe.mathutil.MathUtils.getFactorial(n);
        
        System.out.println("0!"
                + "\nExpected: " +expected 
                +"\nActual: " +actual);
        }
    }


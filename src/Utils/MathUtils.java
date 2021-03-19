package Utils;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class MathUtils {
    public static double getFactorial(){
        double result = 0 ;
        double input = 0;
        
        System.out.print("Input a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();
        
        for (double i = 0; i < input; i++){
            result = input*i;
        }
        
        return result;
    }
}

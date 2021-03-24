package com.kringe.mathutil;


/**
 *
 * @author nguye
 */
public class MathUtils {
    private static final double pi = 3.1415;
    
    public static long getFactorial(int n){
        long result = 0;        
        //Hàm chỉ chấp nhận từ 0 -> 21, trả kiểu Long
        //Kiểu long chịu đc 10^18 con số
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalud argument. Input must be between 0 -> 20");
        
        if(n == 0 || n == 1)
            return 1; //0! = 1! = 1
        
        for (int i = 2; i <= n; i++) 
            result *=i;
        
        return result;
    }
}

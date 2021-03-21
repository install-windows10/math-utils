package com.kringe;

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
        long actual = Utils.MathUtils.getFactorial(n);
        
        System.out.println("5!"
                + "\nExpected: " +expected 
                +"\nActual: " +actual);
        
        //Testing 0! = 1????
        
        expected = 1;
        n = 0;
        actual = Utils.MathUtils.getFactorial(n);
        
        System.out.println("0!"
                + "\nExpected: " +expected 
                +"\nActual: " +actual);
        }
    }

//Viết code xong phải test code
//Test ngay từng hàm, từng class trước khi ráp với các class khác
//Test ngay khi xong hàm, xong class-> test mức độ 1: Unit Testing (test mức đơn vị code)
    //Có nhiều cách test:
        //1. sout(gọi hàm) -> In ra kết quả của hàm
        //2. JOptionPane -> Pop up kết quả của hàm
        //3. Ghi ra log file/ trang web
        //-> 3 cách dùng MẮT để xem kết quả và tự kết luận đúng/ sai
        // Đúng: hàm chạy ra 1 giá trị (ACTUAL VALUE) khớp với giá trị mong đợi đã tính trước = tay (EXPECTED VALUE)
            //vd: 5!  tính tay = 120, hàm trả = 120 --> Đúng
        //Sai: Test 6! = 720 (Expected value), hàm trả = 120 (Actual value) --> Sai

        //4. MÁY SO SÁNH VÀ KẾT LUẬN
            //SỬ DỤNG CÁC PHÉP TOÁN SO SÁNH
            //Tình huống chạy hàm đúng --> màu xanh
            //Hầu hết tình huống chạy đúng, 1 sai --> màu đỏ
        //Để làm đc -> cần thư viện phụ trợ trong Java xanh đỏ
        //Java: JUnit, TestNG | C#: NUnit, xUnit, PHP: PHPUnit| ......
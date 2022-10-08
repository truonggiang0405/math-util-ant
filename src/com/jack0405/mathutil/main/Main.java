/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jack0405.mathutil.main;

import com.jack0405.mathutil.core.MathUtil;

/**
 *
 * @author Truong Giang
 */
public class Main {

    public static void main(String[] args) {
        
           tryTDDFirst();
           
    }
    public static void tryTDDFirst(){
        //Test case 1:
        //n = 0 hy vọng hàm trả về expected = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sánh 2 giá trị để biết hàm vừa viết đúng hay k???
        // 3 thứ này tổ hợp nên 1 thứ gọi là TEST CASE
        System.out.println("0! Status | Expected = " + expected +
                                    " | Actual = " + actual);
        
        //Test case 2: n=1, 1! hy vọng trả về 1 luôn
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | Expected = " + expected +
                                    " | Actual = " + actual);
    
        //Test case 3: n=3, 2! hy vọng trả về 2 luôn
        expected = 6;
        System.out.println("3! Status | Expected = " + expected +
                                    " | Actual = " + MathUtil.getFactorial(3));
    }
}

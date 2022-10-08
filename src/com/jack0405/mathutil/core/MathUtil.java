/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jack0405.mathutil.core;

/**
 *
 * @author Truong Giang
 */
//Ta sẽ clone bộ thư viện/công cụ Math util của JDK, giả lập các hàm của class Math của JDK
//Những gì mà là công cụ dùng cho hàm khác, clas khác, thì thường sẽ được thiết kê là STATIC
//STATIC LÀ CHẤM TRỰC TIẾP QUA TÊN CLASS, KHÔNG CÓ NEW
public class MathUtil {
    
    public static final double PI = 3.141592653589793;
    
    //Hàm tính n!=1.2.3...n
    // Quy ước:
    //          + không có giải thừa cho số âm
    //          + 0! = 1! = 1
    //          + 21! là vượt 18 số 0, vượt kiểu long
    //Hàm của chúng ta design là: chỉ chấp nhận tính giai thừa của n từ 0..20
    public static long getFactorial(int n){
        if(n<0 ||n>20)
            throw new IllegalArgumentException("Invalid n, n must be between 0..20");
        if(n == 0 || n==1)
            return 1;
        //sống sót tới đây , sure n từ 2..20
        long product = 1; //biến con heo đất, nhân tích lũy
                          //acc = accumulation, góp dần
        for (int i = 2; i <=  n; i++)
            product *= i;
        
        return product;
    }
    // KĨ THUẬT LẬP TRÌNH KIỂU MỚI 
    //  1 PLUGIN MỚI CHO TRÌNH ĐỘ CỦA DEV - VIẾT CODE CHÚ Ý LUÔN CODE CÓ CHẤT LƯỢNG
    // KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT
    // VIẾT CODE VÀ VIẾT CODE ĐỂ TEST CODE SONG SONG VỚI NHAU
    // MỖI HÀM DEVELOPER VIẾT RA PHẢI VIẾT NGAY CÁI TEST CASE, PHẢI VIẾT RA ACTION KIỂM THỬ HÀM
    // ĐỂ BIẾT RẰNG HÀM VỪA VIẾT CHẠY SAI HAY ĐÚNG
}

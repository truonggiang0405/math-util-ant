
package com.jack0405.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    //CLASS NÀY VIẾT CODE ĐỂ TEST CODE CHÍNH BÊN MATHUTIL
    //TEST SCRIPT LÀ NHỮNG ĐOẠN CODE ĐC VIẾT RA ĐỂ TEST CODE KHÁC, CODE CHÍNH
    //nhũng đoạn code này sẽ gọi các hàm bên code chính , so sánh giá trị
    //trả về của hàm chính cần test với các expected value
    //Nhũng dodnanj code này/test script này sẽ phỉa BAO GỒM CÁC TEST CASE BÊN TRONG
    //TEST SCRIPT CHỨA CÁC TEST CASE
    //@Test : @ stand by ANNOTATION : kí hiệu,flag để đánh dấu 1 ddaonj code nào đó
    //Khi compile sẽ tự động generate thêm code cho mình tùy theo
    //Kĩ thuật dùng thư viện, bị ép phải theo cú pháp của nó qua những @, thư viện này gọi là FRAMEWORK
    //+Framework: ép ta phải xài theo cách của nó, theo dàn khung code mà nó quy ước
		//Dàn khung, template, ta điền nốt code vòa chỗ trống
                //String boot, Junit
    //+Library: những file .jar .dll chứa 1 đống class bên trong, ta thoải mái dùng hàm của nó theo cách của ta
              //ex: gson, jdbc, excel,jackson
    //Quy tắc chơi xanh đỏ
    //  - XANH khi tất cả các test canh đều xanh
    //  -ĐỎ : chỉ cần có 1 test case màu đỏ, xem như hàm toang
    //        1 tháng gây sai cho tất cả
    //KHÔNG THỂ TEST HẾT CÁC CASE, NHƯNG ĐÃ TEST CASE NÀO THÌ PHẢI XANH CASE ĐÓ
    //ĐỎ:
    //  - đỏ xảy ra khi: có 1 sự ko = nhau của expected và actual
    //  -expected != actual :
    //        REASON 1: expected đúng, mình tính bên ngoài, bằng tay khi chưa có hàm
    //                  actual sai, tình huống này hàm sai -> bug
    //        REASON 2: expected sai, vứt luôn test case
    
    //DDT - Data Driven Testing
    //Tách data ra một chỗ
    //Sau này nạp/fill/điền data này tuần tự vào chỗ test
    //EX : 0  1
    //         0    1
    //         1    1
    //         2    2
    //         6    3
    //         24   4
    //         120  5
    //         720  6
    //         [7][2]
    //Assert.assertEquals(2, MathUtil.getFactorial(2));
    //thay vì lệnh so sánh gọi viết cho từng case, ta biến lệnh này
    //trở thành tổng quát, ko điền data cụ thể, mà sẽ lấy từ đâu đó
    //Assert.assertEquals(???, MathUtil.getFactorial(???));
    //??? này sẽ lấy từ data
    //kĩ thuật tách code test ra khỏi data của nó, lát hồi fill sau
    //kĩ thuật này gọi là KĨ THUẬT 
    
    
    @Test 
    //tên hàm test bao hàm luôn ý nghĩa test cái gì
    //quy ước của dân kiểm thử
    //hàm này tui mún test hàm giai thừa khi đưa tham số đúng
    //viết code phải theo quy tắc - CONDING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell(){
        //TEST CASE #1: Kiểm thử tình huống 01 coi có đúng k
        // n = 0, hy vọng hàm 01 về expected =1; actual thực tế
        // hàm chạy trả về mấy, đoán xem??
        long expected = 1;
        long actual= MathUtil.getFactorial(0);       
        Assert.assertEquals(expected, actual);
        //TEST CASE #2: n=1; 1! expected =1?      
        expected = 1;
        actual= MathUtil.getFactorial(1);       
        Assert.assertEquals(expected, actual);
        //TEST CASE #3: n=2; 2! expected =2?      
        expected = 6;
        actual= MathUtil.getFactorial(3);       
        Assert.assertEquals(expected, actual);
        
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        //TEST CASE #4: n=3; 3! expected =6?      
        long expected = 6;
        long actual= MathUtil.getFactorial(3);       
        Assert.assertEquals(expected, actual);
        //TEST CASE #5: n=4; 4! expected =24?   
        expected = 24;
        actual= MathUtil.getFactorial(4);       
        Assert.assertEquals(expected, actual);
        //TEST CASE #6: n=5; 5! expected =120?        
        expected = 120;
        actual= MathUtil.getFactorial(5);       
        Assert.assertEquals(expected, actual);
        //TEST CASE #7: n=6; 6! expected =720?    
        expected = 720;
        actual= MathUtil.getFactorial(6);       
        Assert.assertEquals(expected, actual);
        
    }
    @Test(expected = IllegalArgumentException.class)//Khi chạy hàm này kiểm trả xem có exception thuộc class  
                                                    //IllegalArgumentException hay không nó xuất hiện = cách 
                                                    //đc new IllegalArgumentException ở đâu đó
    //Hàm getF() đc thiết kể trả về long nếu n đưa vào từ 0..20
    //Hàm getF() đc thiết kế ném ra EXCEPTION nếu ta đưa vào N < 0 || N > 20
    //tức là nếu gọi getF(-5) thì chỗ gọi sẽ nhận về EXCEPTION tên là 
    // illegalArgumentException
    //đưa cà chớn, nhận ngoại lệ
    //bắt xem hàm mình có đúng ném ngoại lệ hay ko nếu data cà chớn
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);      
    }
      
}

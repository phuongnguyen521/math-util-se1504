/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.core;


import static com.phuong.mathutil.core.MathUtil.getFactorial;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author SE150998 - Phượng
 */
public class FactoriatTest {

    @Test  //viết code dùng để xem code chính MathUtils
    //tên hàm phải nói lên mục đích của việc test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        //Kì vọng khi gọi hàm tính 5! thì máy phải trả về 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        assertEquals(expected, actual);

        // đừng quên còn nhiều tình huống xài hàm
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(0));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));

    }

    @Test(expected = IllegalArgumentException.class)
    //biến hàm này thành public static void main(){...}
    // đây là cú pháp/ quy tắc bộ thư viện JUnit

    public void checkFactorialGivenWrongArgurmentThrowsException() {
        getFactorial(-5);
        getFactorial(21);
        getFactorial(22);
        getFactorial(1);
    }
    //âm không tính giai thừa
    // > 21 bị tràn long, khong tính luôn
    // 2 tình huống này không có value trả về, không so sánh được
    // không assertEquals() so sánh coi có bằng không
}

// Xanh Đỏ quy ước
// Hàm đánh giá là xanh, nếu tất cả các tình huống phải xanh
// Test gi thì xanh nấy, tức là test gì, thì expected = actual
// ám chỉ hàm xử lí đúng
// chỉ cần 1 cái đỏ, cặp expected = actual, có nghĩa hàm xử lí không đúng
// hoặc bạn kì vọng sai
// ta càn xem lại code/test để đảm bảo xanh hết, kết luận hàm ổn
// cho các tình huống đã test
//C# <- NUnit Nuget
// NSTest <- xUnit

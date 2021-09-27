/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author DELL
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //tách toàn bộ data cần test gồm đầu vào (input) và expected(output)
    // ra 1 chỗ cho dễ quản lí/ dễ theo dõi/ dễ thống kê đủ các tình huống 
    // cần test hay chưa
    // về mặt lý thuyết, ta có thể đặt bộ data này ở 
    //file txt, csv, excel, database (viết thêm đoạn code để đọc external)
    //Chuẩn bị 2 biến hứng data từ mảng, sau đó thảy vào hàm test
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;

    @Parameterized.Parameters
    public static Object[][] initData() { //tên hàm tự do
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(input));
    }
}

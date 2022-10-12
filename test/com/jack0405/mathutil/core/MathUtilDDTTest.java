
package com.jack0405.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Truong Giang
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters
    public static Object[][] initData(){   
        return new Integer[][] {{1,0},
                               {1,1},
                               {2,2},
                               {6,3},
                               {24,4},
                               {120,5},
                               {720,6}};
 
    }
    @Parameterized.Parameter(value = 0)
        public long expected;
        
        @Parameterized.Parameter(value = 1)
        public int n;
    @Test //fill data và gọi hàm so sánh
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}

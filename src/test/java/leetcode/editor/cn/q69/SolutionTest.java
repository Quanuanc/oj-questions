package leetcode.editor.cn.q69;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void before() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int x = 8;
        int res = solution.mySqrt(x);
        assertEquals(2, res);
    }

    @Test
    void test2() {
        int x = 9;
        int res = solution.mySqrt(x);
        assertEquals(3, res);
    }

    @Test
    void test3() {
        int x = 4;
        int res = solution.mySqrt(x);
        assertEquals(2, res);
    }

    @Test
    void test4() {
        int x = 2147395599;
        int res = solution.mySqrt(x);
        assertEquals(46339, res);
    }

}
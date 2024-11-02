package dev.cheng.leetcode.q67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String a = "111";
        String b = "11";

        String res = solution.addBinary(a, b);
        Assertions.assertEquals("1010", res);
    }

    @Test
    void test2() {
        String a = "1000";
        String b = "1000";

        String res = solution.addBinary(a, b);
        Assertions.assertEquals("10000", res);
    }

    @Test
    void test3() {
        String a = "000";
        String b = "1000";

        String res = solution.addBinary(a, b);
        Assertions.assertEquals("1000", res);
    }
}

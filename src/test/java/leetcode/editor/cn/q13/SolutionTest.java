package leetcode.editor.cn.q13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String s = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(s));
    }

    @Test
    void test2() {
        String s = "LVIII";
        assertEquals(58, solution.romanToInt(s));
    }
}

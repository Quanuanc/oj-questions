package leetcode.editor.cn.q415;

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
        String num1 = "1122";
        String num2 = "222";
        String s = solution.addStrings(num1, num2);
        assertEquals("1344", s);
    }
}
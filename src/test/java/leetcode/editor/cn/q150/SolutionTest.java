package leetcode.editor.cn.q150;

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
    public void test1() {
        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        int res = solution.evalRPN(tokens);
        assertEquals(6, res);
    }
}

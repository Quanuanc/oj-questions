package leetcode.editor.cn.q1592;

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
        String s = "  this   is  a sentence ";
        String res = solution.reorderSpaces(s);
        assertEquals("this   is   a   sentence", res);
    }

    @Test
    public void test2() {
        String s = " practice   makes   perfect";
        String res = solution.reorderSpaces(s);
        assertEquals("practice   makes   perfect ", res);
    }
}

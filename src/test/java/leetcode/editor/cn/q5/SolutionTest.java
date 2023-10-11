package leetcode.editor.cn.q5;

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
        String s = "cbbd";
        String res = solution.longestPalindrome(s);
        assertEquals("bb", res);
    }

    @Test
    public void test2() {
        String s = "babad";
        String res = solution.longestPalindrome(s);
        assertEquals("bab", res);
    }

    @Test
    public void test3() {
        String s = "ccc";
        String res = solution.longestPalindrome(s);
        assertEquals("ccc", res);
    }
}

package leetcode.editor.cn.q125;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void test2() {
        String s = "0P";
        assertFalse(solution.isPalindrome(s));
    }

    @Test
    void test3() {
        String s = ".,";
        assertTrue(solution.isPalindrome(s));
    }

}

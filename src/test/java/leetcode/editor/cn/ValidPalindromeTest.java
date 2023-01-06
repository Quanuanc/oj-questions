package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    ValidPalindrome.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidPalindrome().new Solution();
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

}
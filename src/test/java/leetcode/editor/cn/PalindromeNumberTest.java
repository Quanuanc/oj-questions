package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new PalindromeNumber().new Solution();
    }

    @Test
    void test1() {
        int x = -121;
        assertTrue(solution.isPalindrome(x));
    }
}
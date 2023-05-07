package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestPalindromicSubstring().new Solution();
    }

    @Test
    public void test1() {
        String s = "cbbd";
        String res = solution.longestPalindrome(s);
        assertEquals("bb", res);
    }
}
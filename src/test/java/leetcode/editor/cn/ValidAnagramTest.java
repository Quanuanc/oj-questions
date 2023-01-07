package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    ValidAnagram.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidAnagram().new Solution();
    }

    @Test
    void test1() {
        String s = "anagram", t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
    }
}
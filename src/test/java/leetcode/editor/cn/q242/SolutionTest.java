package leetcode.editor.cn.q242;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String s = "anagram", t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
    }
}

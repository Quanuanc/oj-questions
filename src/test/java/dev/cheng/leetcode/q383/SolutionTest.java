package dev.cheng.leetcode.q383;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String ransomNote = "aa";
        String magazine = "ab";
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }
}

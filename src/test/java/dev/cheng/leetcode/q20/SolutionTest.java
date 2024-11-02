package dev.cheng.leetcode.q20;

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
    void isValid1() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }
}

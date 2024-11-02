package dev.cheng.leetcode.q14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void before() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        String res = solution.longestCommonPrefix(strs);
        assertEquals("", res);
    }

    @Test
    void test2() {
        String[] strs = new String[]{"cir", "car"};
        String res = solution.longestCommonPrefix(strs);
        assertEquals("c", res);
    }

}
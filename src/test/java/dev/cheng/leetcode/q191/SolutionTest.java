package dev.cheng.leetcode.q191;

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
    void test1() {
        int n = 11;
        int bits = solution.hammingWeight(n);
        assertEquals(3, bits);
    }
}

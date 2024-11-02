package dev.cheng.leetcode.q2670;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void distinctDifferenceArray() {
        int[] nums = new int[] {3, 2, 3, 4, 2};
        int[] ret = solution.distinctDifferenceArray(nums);
        int[] expected = new int[] {-2, -1, 0, 2, 3};
        assertArrayEquals(expected, ret);
    }
}
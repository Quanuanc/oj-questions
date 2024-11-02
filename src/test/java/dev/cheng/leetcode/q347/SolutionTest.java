package dev.cheng.leetcode.q347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = solution.topKFrequent(nums, k);
        Assertions.assertArrayEquals(new int[]{1, 2}, res);
    }
}

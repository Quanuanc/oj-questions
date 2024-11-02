package dev.cheng.leetcode.q34;

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
    public void test1() {
        int[] nums = new int[]{5, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] res = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{4, 5}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2, 2};
        int target = 3;
        int[] res = solution.searchRange(nums, target);
        assertArrayEquals(new int[]{-1, -1}, res);
    }
}

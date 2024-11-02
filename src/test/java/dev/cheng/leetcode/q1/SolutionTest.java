package dev.cheng.leetcode.q1;

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
    public void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{2, 9, 7, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{0, 2}, result);
    }
}

package dev.cheng.leetcode.q169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void majorityElement() {
        int[] nums = new int[]{3, 2, 3};
        int result = new Solution().majorityElement(nums);
        assertEquals(3, result);
    }
}

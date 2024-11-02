package dev.cheng.leetcode.q268;

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
    void missingNumber() {
        int[] nums = new int[]{3, 0, 1};
        int result = solution.missingNumber(nums);
        assertEquals(2, result);

        int[] nums2 = new int[]{0, 1};
        int result2 = solution.missingNumber(nums2);
        assertEquals(2, result2);

        int[] nums3 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int result3 = solution.missingNumber(nums3);
        assertEquals(8, result3);

        int[] nums4 = new int[]{0};
        int result4 = solution.missingNumber(nums4);
        assertEquals(1, result4);
    }
}
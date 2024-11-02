package dev.cheng.leetcode.q27;

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
    public void test1() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = solution.removeElement(nums, val);
        int[] expected = new int[]{0, 1, 3, 0, 4};
        assertEquals(expected.length, res);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}

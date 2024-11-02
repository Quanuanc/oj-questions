package dev.cheng.leetcode.q724;

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
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int res = solution.pivotIndex(nums);
        assertEquals(3, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 1};
        int res = solution.pivotIndex(nums);
        assertEquals(1, res);
    }
}

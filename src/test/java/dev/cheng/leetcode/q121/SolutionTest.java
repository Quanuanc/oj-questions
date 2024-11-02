package dev.cheng.leetcode.q121;

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
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int res = solution.maxProfit(prices);
        assertEquals(5, res);
    }

    @Test
    public void test2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int res = solution.maxProfit(prices);
        assertEquals(0, res);
    }
}

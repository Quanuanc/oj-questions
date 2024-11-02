package dev.cheng.leetcode.q409;

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
        String s = "abccccdd";
        assertEquals(7, solution.longestPalindrome(s));
    }

    @Test
    void testAdd() {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 4;
        nums[3] = 2;
        int ans = 0;
        for (int v : nums) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) ans++;
        }
        System.out.println(ans);
    }
}

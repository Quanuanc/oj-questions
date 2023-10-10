package leetcode.editor.cn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

    private MaximumSubarray.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new MaximumSubarray().new Solution();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assertions.assertEquals(6, solution.maxSubArray(nums));
    }

}
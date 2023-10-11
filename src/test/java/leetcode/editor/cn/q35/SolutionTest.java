package leetcode.editor.cn.q35;

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
        int[] nums = new int[]{1, 3, 5, 6};
        int res = solution.searchInsert(nums, 2);
        assertEquals(1, res);
    }
}

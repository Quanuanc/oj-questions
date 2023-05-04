package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {
    HouseRobber.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new HouseRobber().new Solution();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 1};
        int rob = solution.rob(nums);
        assertEquals(4, rob);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{6, 6, 4, 8, 4, 3, 3, 10};
//        int[] nums = new int[]{6, 6, 4, 8, 4, 3};
        int rob = solution.rob(nums);
        assertEquals(27, rob);
    }
}
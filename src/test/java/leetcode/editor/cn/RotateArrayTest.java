package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArrayTest {

    RotateArray.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new RotateArray().new Solution();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
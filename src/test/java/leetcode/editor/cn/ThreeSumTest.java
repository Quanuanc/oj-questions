package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    ThreeSum.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ThreeSum().new Solution();
    }

    @Test
    void threeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> res1 = List.of(-1, -1, 2);
        List<Integer> res2 = List.of(-1, 0, 1);
        expected.add(res1);
        expected.add(res2);
        assertEquals(expected, result);
    }
}
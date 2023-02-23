package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    BinarySearch.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch().new Solution();
    }

    @Test
    void test1() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        assertEquals(4, solution.search(nums, target));
    }
}
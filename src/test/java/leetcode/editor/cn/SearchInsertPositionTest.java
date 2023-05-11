package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {
    SearchInsertPosition.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new SearchInsertPosition().new Solution();
    }

    @Test
    public void test1() {
        int[] nums = new int[]{1, 3, 5, 6};
        int res = solution.searchInsert(nums, 2);
        assertEquals(1, res);
    }
}
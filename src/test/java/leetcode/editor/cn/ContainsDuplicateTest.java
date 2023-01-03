package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    ContainsDuplicate.Solution solution;

    @BeforeEach
    void setSolution() {
        solution = new ContainsDuplicate().new Solution();
    }

    @Test
    void containsDuplicate() {
        int[] nums1 = new int[]{1, 2, 3, 1};
        boolean result1 = solution.containsDuplicate(nums1);
        assertTrue(result1);
    }

    @Test
    void containsDuplicate2() {
        int[] nums2 = new int[]{1, 2, 3, 4};
        boolean result2 = solution.containsDuplicate(nums2);
        assertFalse(result2);
    }

    @Test
    void containsDuplicate3() {
        int[] nums3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result3 = solution.containsDuplicate(nums3);
        assertTrue(result3);
    }
}
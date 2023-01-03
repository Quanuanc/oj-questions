package leetcode.editor.cn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void majorityElement() {
        int[] nums = new int[]{3, 2, 3};
        int result = new MajorityElement().new Solution().majorityElement(nums);
        assertEquals(3, result);
    }
}
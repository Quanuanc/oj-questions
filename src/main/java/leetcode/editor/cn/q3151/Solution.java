package leetcode.editor.cn.q3151;

/**
 * 3151. Special Array I
 */
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i] % 2;
            int right = nums[i + 1] % 2;

            if (left == right) {
                return false;
            }
        }
        return true;
    }
}

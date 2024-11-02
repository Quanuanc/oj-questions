package dev.cheng.leetcode.q189;

import java.util.Arrays;

// [189] 轮转数组
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) return;
        int[] temp = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = temp[i];
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)



package leetcode.editor.cn.q53;

// [53] 最大子数组和
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


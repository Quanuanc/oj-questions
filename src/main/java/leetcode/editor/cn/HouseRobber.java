package leetcode.editor.cn;

import java.util.Arrays;

// [198] 打家劫舍
public class HouseRobber {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int rob(int[] nums) {
            int[] dp = new int[nums.length + 1];
            Arrays.fill(dp, -1);
            return dp(nums, dp, nums.length - 1);
        }

        private int dp(int[] nums, int[] dp, int i) {
            if (i == 0) return nums[i];
            else if (i == 1) return Math.max(nums[0], nums[1]);
            else {
                int A, B;
                if (dp[i] != -1 && dp[i - 2] != -1) {
                    A = dp[i - 2];
                    B = dp[i];
                } else {
                    A = nums[i] + dp(nums, dp, i - 2);
                    B = dp(nums, dp, i - 1);
                    dp[i - 2] = A;
                    dp[i] = B;
                }
                return Math.max(A, B);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
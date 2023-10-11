package leetcode.editor.cn.q746;

// [746] 使用最小花费爬楼梯
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        return recurDp(cost, dp, -1);
    }

    private int recurDp(int[] cost, int[] dp, int i) {
        if (i == cost.length - 1 || i == cost.length - 2)
            return 0;
        else {
            if (dp[i + 1] == 0) {
                dp[i + 1] = cost[i + 1] + recurDp(cost, dp, i + 1);
            }
            if (dp[i + 2] == 0) {
                dp[i + 2] = cost[i + 2] + recurDp(cost, dp, i + 2);
            }
            return Math.min(dp[i + 1], dp[i + 2]);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


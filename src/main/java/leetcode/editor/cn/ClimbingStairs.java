package leetcode.editor.cn;

/**
 * [70] 爬楼梯
 */
public class ClimbingStairs {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;
            int dpN1 = 2; //dp[n-1]
            int dpN2 = 1; //dp[n-2]
            int dpN = 0; //dp[n]
            for (int i = 3; i <= n; i++) {
                dpN = dpN1 + dpN2;
                dpN2 = dpN1;
                dpN1 = dpN;
            }
            return dpN;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
package dev.cheng.leetcode.q70;

// [70] 爬楼梯
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int dpi2 = 1;
        int dpi1 = 2;
        int dpi = dpi1 + dpi2;
        for (int i = 3; i < n + 1; i++) {
            dpi = dpi1 + dpi2;
            dpi2 = dpi1;
            dpi1 = dpi;
        }
        return dpi;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


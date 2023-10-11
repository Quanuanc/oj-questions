package leetcode.editor.cn.q1137;

// [1137] 第 N 个泰波那契数
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else {
            int dpN0 = 0;
            int dpN1 = 1;
            int dpN2 = 1;
            int dpN = 0;
            for (int i = 3; i <= n; i++) {
                dpN = dpN0 + dpN1 + dpN2;
                dpN0 = dpN1;
                dpN1 = dpN2;
                dpN2 = dpN;
            }
            return dpN;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


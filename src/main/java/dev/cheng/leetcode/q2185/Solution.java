package dev.cheng.leetcode.q2185;

// [2185] 统计包含给定前缀的字符串
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref))
                res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)



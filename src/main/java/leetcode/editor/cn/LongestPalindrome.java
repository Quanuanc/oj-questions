package leetcode.editor.cn;

/**
 * [409] 最长回文串
 */
public class LongestPalindrome {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            if (s.length() <= 1) return s.length();
            int[] count = new int[128];
            for (char c : s.toCharArray()) {
                count[c]++;
            }

            int res = 0;
            for (int i : count) {
                int t = (i / 2) * 2;
                res += t;
                if (i % 2 == 1 && res % 2 == 0) {
                    res += 1;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
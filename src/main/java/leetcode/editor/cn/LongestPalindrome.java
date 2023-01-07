package leetcode.editor.cn;

/**
 * [409] 最长回文串
 */
public class LongestPalindrome {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestPalindrome(String s) {
            int[] nums = new int[128]; //ascii
            for (char c : s.toCharArray()) nums[c]++;

            int ans = 0;
            for (int v : nums) {
                ans += v / 2 * 2;
                if (v % 2 == 1 && ans % 2 == 0) ans++;
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
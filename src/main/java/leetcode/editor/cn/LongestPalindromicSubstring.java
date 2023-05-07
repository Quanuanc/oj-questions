package leetcode.editor.cn;

/**
 * [5] 最长回文子串
 */
public class LongestPalindromicSubstring {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int start = 0;
            int maxLen = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    int left = i, right = j;
                    for (; left < right; left++, right--) {
                        if (s.charAt(left) != s.charAt(right)) {
                            break;
                        }
                    }
                    if (left >= right && j - i > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                    }
                }
            }
            if (maxLen > 0)
                return s.substring(start, maxLen + 1);
            return null;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
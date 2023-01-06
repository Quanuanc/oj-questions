package leetcode.editor.cn;

public class ValidPalindrome {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0) return true;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetterOrDigit(s.charAt(i))) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            for (int i = 0, j = sb.length() - 1; i <= j; i++, j--) {
                if (sb.charAt(i) != sb.charAt(j)) return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
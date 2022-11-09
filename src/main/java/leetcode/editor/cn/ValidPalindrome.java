package leetcode.editor.cn;

public class ValidPalindrome {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0) return true;
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch))
                    temp.append(ch);
            }
            String str = temp.toString().toLowerCase();
            for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
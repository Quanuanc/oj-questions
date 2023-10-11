package leetcode.editor.cn;

// [125] Valid Palindrome
public class ValidPalindrome {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0) return true;
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                    i++;
                while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
                    j--;
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                    return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
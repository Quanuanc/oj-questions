package leetcode.editor.cn;

import java.math.BigDecimal;


/**
 * [66] 加一
 */
public class PlusOne {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            StringBuilder sb = new StringBuilder();
            for (int digit : digits) {
                sb.append(digit);
            }
            BigDecimal num = new BigDecimal(sb.toString());
            String s = num.add(new BigDecimal(1)).toString();
            if (s.length() == digits.length) {
                for (int i = 0; i < s.length(); i++) {
                    digits[i] = Character.digit(s.charAt(i), 10);
                }
                return digits;
            } else {
                int[] newDigits = new int[s.length()];
                for (int i = 0; i < s.length(); i++) {
                    newDigits[i] = Character.digit(s.charAt(i), 10);
                }
                return newDigits;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

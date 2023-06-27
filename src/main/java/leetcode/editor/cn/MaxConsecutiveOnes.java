package leetcode.editor.cn;

/**
 * [485] 最大连续 1 的个数
 */
public class MaxConsecutiveOnes {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0, tempMax = 0;
            for (int num : nums) {
                if (num == 1) {
                    tempMax++;
                } else {
                    max = Math.max(max, tempMax);
                    tempMax = 0;
                }
            }
            return Math.max(max, tempMax);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
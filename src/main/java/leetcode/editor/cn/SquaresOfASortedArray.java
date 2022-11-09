package leetcode.editor.cn;

public class SquaresOfASortedArray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int len = nums.length;
            int[] result = new int[len];
            int i = 0, j = len - 1;
            for (int p = len - 1; p >= 0; p--) {
                if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                    result[p] = nums[i] * nums[i];
                    i++;
                } else {
                    result[p] = nums[j] * nums[j];
                    j--;
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
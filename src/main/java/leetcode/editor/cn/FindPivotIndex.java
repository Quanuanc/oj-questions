package leetcode.editor.cn;

// [724] Find Pivot Index
public class FindPivotIndex {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int pivotIndex(int[] nums) {
            int len = nums.length;
            int[] preResult = new int[len];
            int[] postResult = new int[len];
            int preSum = 0, postSum = 0;
            for (int i = 0; i < len; i++) {
                preSum += nums[i];
                postSum += nums[len - 1 - i];
                preResult[i] = preSum;
                postResult[i] = postSum;
            }
            for (int i = 0; i < len; i++) {
                if (preResult[i] == postResult[len - 1 - i]) {
                    return i;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
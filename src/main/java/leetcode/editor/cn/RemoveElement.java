package leetcode.editor.cn;

public class RemoveElement {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int left = 0;
            for (int right = 0; right < n; right++) {
                if (nums[right] != val) {
                    nums[left] = nums[right];
                    left++;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
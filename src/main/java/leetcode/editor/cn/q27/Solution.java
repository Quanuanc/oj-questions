package leetcode.editor.cn.q27;

// [27] Remove Element
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0, fastIndex = 0;
        while (fastIndex < nums.length) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
            fastIndex++;
        }
        return slowIndex;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


package leetcode.editor.cn;

// [35] 搜索插入位置
public class SearchInsertPosition {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int len = nums.length;
            int left = 0, right = len - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target > nums[mid]) {
                    left = mid + 1;
                } else if (target < nums[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return right + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
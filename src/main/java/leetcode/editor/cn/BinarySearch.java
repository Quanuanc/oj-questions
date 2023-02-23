package leetcode.editor.cn;

/**
 * [704] 二分查找
 */
public class BinarySearch {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int mid = left + (right - left) / 2;
            while (left <= right) {
                if (nums[mid] > target) {
                    right = mid - 1;
                    mid = left + (right - left) / 2;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                    mid = left + (right - left) / 2;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
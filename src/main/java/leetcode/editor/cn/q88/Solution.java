package leetcode.editor.cn.q88;

import java.util.Arrays;

// [88] Merge Sorted Array

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)


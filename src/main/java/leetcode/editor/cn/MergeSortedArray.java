package leetcode.editor.cn;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new MergeSortedArray().new Solution().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2, 0, nums1, m, n);
            Arrays.sort(nums1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
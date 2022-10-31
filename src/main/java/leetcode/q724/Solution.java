package leetcode.q724;
/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心下标
 */

// @lc code=start
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

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(new Solution().pivotIndex(nums));

    }
}
// @lc code=end

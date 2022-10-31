package leetcode.q27;


import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int k = new Solution().removeElement(nums, 3);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }

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

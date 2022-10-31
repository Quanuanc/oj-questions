package leetcode.q704;

public class Solution {
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

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(new Solution().search(nums, target));
    }
}

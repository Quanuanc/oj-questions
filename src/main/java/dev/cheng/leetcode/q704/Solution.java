package dev.cheng.leetcode.q704;

// [704] 二分查找
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1; //左右都在num区间范围内
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int left = 0, right = nums.length; //左在，右不在
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }
}


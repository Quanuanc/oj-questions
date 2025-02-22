package dev.cheng.leetcode.q268;


// [268] 丢失的数字
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] array = new int[len + 1];

        for (int num : nums) {
            array[num]++;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return i;
        }

        return 0;
    }
}

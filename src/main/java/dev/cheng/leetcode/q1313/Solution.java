package dev.cheng.leetcode.q1313;

// [1313] Decompress Run-Length Encoded List
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int[] result = new int[len];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int num = nums[i + 1];
            int freq = nums[i];
            while (freq > 0) {
                freq--;
                result[index++] = num;
            }
        }
        return result;
    }
}


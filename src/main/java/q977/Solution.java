package q977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int i = 0, j = len - 1;
        for (int p = len - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[p] = nums[i] * nums[i];
                i++;
            } else {
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(new Solution().sortedSquares(nums)));
    }
}

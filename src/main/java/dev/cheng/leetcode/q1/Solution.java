package dev.cheng.leetcode.q1;
// {1} {two-sum}

import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/two-sum">Two Sum</a>
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                result[0] = map.get(need);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

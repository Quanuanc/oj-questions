package dev.cheng.leetcode.q2670;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 2670. Find the Distinct Difference Array
 */
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> prefix = new HashSet<>();
        Map<Integer, Integer> suffix = new HashMap<>();

        for (int num : nums) {
            suffix.put(num, suffix.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Integer current = nums[i];
            prefix.add(current);
            if (suffix.containsKey(current)) {
                int count = suffix.get(current);
                if (count - 1 <= 0) {
                    suffix.remove(current);
                } else {
                    suffix.put(current, count - 1);
                }
            }
            int diff = prefix.size() - suffix.size();
            result[i] = diff;
        }
        return result;
    }
}

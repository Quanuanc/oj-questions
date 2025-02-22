package dev.cheng.leetcode.q169;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// [169] 多数元素
class Solution {
    public int majorityElement(int[] nums) {
        int halfLen = nums.length / 2;
        Map<Integer, Integer> count = new ConcurrentHashMap<>();
        Arrays.stream(nums).parallel().forEach(item -> {
            count.put(item, count.getOrDefault(item, 0) + 1);
        });

        for (Map.Entry<Integer, Integer> integerIntegerEntry : count.entrySet()) {
            if (integerIntegerEntry.getValue() > halfLen) {
                return integerIntegerEntry.getKey();
            }
        }

        return 0;
    }
}

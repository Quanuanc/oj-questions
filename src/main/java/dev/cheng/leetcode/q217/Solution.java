package dev.cheng.leetcode.q217;

import java.util.HashSet;
import java.util.Set;

// [217] 存在重复元素
class Solution {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            // add already exist will return false
            if (!set.add(num)) return true;
        }
        return false;
    }
}


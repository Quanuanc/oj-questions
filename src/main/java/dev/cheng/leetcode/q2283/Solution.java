package dev.cheng.leetcode.q2283;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 2283. Check if Number Has Equal Digit Count and Digit Value
 * Example 1:
 * Input: num = "1210"
 * Output: true
 * Explanation:
 * num[0] = '1'. The digit 0 occurs once in num.
 * num[1] = '2'. The digit 1 occurs twice in num.
 * num[2] = '1'. The digit 2 occurs once in num.
 * num[3] = '0'. The digit 3 occurs zero times in num.
 * The condition holds true for every index in "1210", so return true.
 */
class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> expected = new HashMap<>();
        Map<Integer, Integer> charCount = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int cc = c - '0';
            expected.put(i, cc);
            charCount.put(cc, charCount.getOrDefault(cc, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : expected.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (!Objects.equals(value, charCount.getOrDefault(key, 0))) {
                return false;
            }
        }
        return true;
    }
}

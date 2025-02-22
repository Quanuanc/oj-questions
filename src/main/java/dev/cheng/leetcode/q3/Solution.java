package dev.cheng.leetcode.q3;

import java.util.LinkedList;
import java.util.Queue;

// [3] 无重复字符的最长子串
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (queue.contains(c)) {
                queue.poll();
            }
            queue.add(c);
            res = Math.max(res, queue.size());
        }
        return res;
    }
}



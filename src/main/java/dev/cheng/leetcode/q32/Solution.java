package dev.cheng.leetcode.q32;

import java.util.Stack;

// [32] 最长有效括号
class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    int lastIndex = stack.peek();
                    int len = i - lastIndex;
                    if (len > max) max = len;
                }
            }
        }
        return max;
    }
}


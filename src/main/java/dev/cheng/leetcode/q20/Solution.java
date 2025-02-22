package dev.cheng.leetcode.q20;
// {20} {valid-parentheses}

import java.util.Stack;

// [20] Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLeft(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else {
                    Character pop = stack.pop();
                    if (pop == '(') {
                        if (c != ')') return false;
                    } else if (pop == '{') {
                        if (c != '}') return false;
                    } else {
                        if (c != ']') return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeft(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}


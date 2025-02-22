package dev.cheng.leetcode.q682;

import java.util.Stack;

// [682] 棒球比赛
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if ("C".equals(op)) {
                if (stack.isEmpty()) return -1;
                stack.pop();
            } else if ("D".equals(op)) {
                if (stack.isEmpty()) return -1;
                int pop = stack.peek();
                stack.push(pop * 2);
            } else if ("+".equals(op)) {
                if (stack.isEmpty()) return -1;
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}


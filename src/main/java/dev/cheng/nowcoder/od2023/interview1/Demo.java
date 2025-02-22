package dev.cheng.nowcoder.od2023.interview1;

import java.util.Stack;

// @see <a href="https://leetcode.cn/problems/longest-valid-parentheses">32. 最长有效括号</a>
public class Demo {
    public static void main(String[] args) {
//        String input = "(()";
        String input = ")()())";
//        String input = "(()(())(";
//        String input = "(()(()(())";
//        String input = "())";
        int res = getMaxLen(input);
        System.out.println(res);
    }

    private static int getMaxLen(String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    int len = i - stack.peek();
                    if (len > max) max = len;
                } else {
                    stack.push(i);
                }
            }
        }
        return max;
    }
}

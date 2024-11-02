package dev.cheng.leetcode.q150;

import java.util.Stack;

// [150] 逆波兰表达式求值
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            int num = parseNumber(token);
            if (num != -255) {
                stack.push(num);
            } else {
                if (!stack.isEmpty()) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int eval = eval(b, a, token);
                    stack.push(eval);
                }
            }
        }

        return stack.pop();
    }

    private int parseNumber(String s) {
        switch (s) {
            case "+":
            case "-":
            case "*":
            case "/":
                return -255;
            default: {
                return Integer.parseInt(s);
            }
        }
    }

    private int eval(int a, int b, String op) {
        switch (op) {
            case "+": {
                return a + b;
            }
            case "-": {
                return a - b;
            }
            case "*": {
                return a * b;
            }
            case "/": {
                return a / b;
            }
            default: {
                return 0;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


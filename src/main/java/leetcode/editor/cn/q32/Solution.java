package leetcode.editor.cn.q32;

import java.util.Stack;

// [32] 最长有效括号
//leetcode submit region begin(Prohibit modification and deletion)
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
//leetcode submit region end(Prohibit modification and deletion)


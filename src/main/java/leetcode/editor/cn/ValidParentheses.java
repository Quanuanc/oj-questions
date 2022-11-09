package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);
                if (isLeft(cur)) {
                    stack.push(cur);
                } else if (isRight(cur)) {
                    if (stack.isEmpty())
                        return false;
                    char popChar = stack.pop();
                    if (!isEqual(popChar, cur))
                        return false;
                }
            }
            return stack.isEmpty();
        }

        public boolean isLeft(char c) {
            return c == '(' || c == '[' || c == '{';
        }

        public boolean isRight(char c) {
            return c == ')' || c == ']' || c == '}';
        }

        public boolean isEqual(char left, char right) {
            switch (left) {
                case '(':
                    return right == ')';
                case '{':
                    return right == '}';
                case '[':
                    return right == ']';
                default:
                    return false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
package dev.cheng.leetcode.q1021;
// {1078} {remove-outermost-parentheses}

/**
 * @link <a href="https://leetcode.com/problems/remove-outermost-parentheses">Remove Outermost Parentheses</a>
 */
// ------ AlgoAce Begin -----
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (count > 1) result.append(c);
            } else {
                count--;
                if (count > 0) result.append(c);
            }
        }
        return result.toString();
    }
}
// ------ AlgoAce End -------

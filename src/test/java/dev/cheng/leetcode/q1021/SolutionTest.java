package dev.cheng.leetcode.q1021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String s = "(()())(())";
        String ret = solution.removeOuterParentheses(s);
        Assertions.assertEquals("()()()", ret);
    }

    @Test
    void test2() {
        String s = "(()())(())(()(()))";
        String ret = solution.removeOuterParentheses(s);
        Assertions.assertEquals("()()()()(())", ret);
    }

    @Test
    void test3() {
        String s = "(()(()))";
        String ret = solution.removeOuterParentheses(s);
        Assertions.assertEquals("()(())", ret);
    }
}
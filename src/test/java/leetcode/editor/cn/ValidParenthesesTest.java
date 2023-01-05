package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    ValidParentheses.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ValidParentheses().new Solution();
    }

    @Test
    void isValid1() {
        String s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid2() {
        String s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    void isValid3() {
        String s = "(]";
        assertFalse(solution.isValid(s));
    }
}
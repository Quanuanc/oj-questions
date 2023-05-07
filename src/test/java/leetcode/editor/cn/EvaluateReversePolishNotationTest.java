package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new EvaluateReversePolishNotation().new Solution();
    }

    @Test
    public void test1() {
        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        int res = solution.evalRPN(tokens);
        assertEquals(6, res);
    }
}
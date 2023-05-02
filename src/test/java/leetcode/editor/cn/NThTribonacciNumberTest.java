package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NThTribonacciNumberTest {
    NThTribonacciNumber.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new NThTribonacciNumber().new Solution();
    }

    @Test
    public void test1() {
        int n = 4;
        assertEquals(4, solution.tribonacci(n));
        int n2 = 25;
        assertEquals(1389537, solution.tribonacci(n2));
    }
}
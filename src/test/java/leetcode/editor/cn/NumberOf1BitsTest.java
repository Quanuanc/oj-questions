package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOf1BitsTest {

    NumberOf1Bits.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOf1Bits().new Solution();
    }

    @Test
    void test1() {
        int n = 11;
        int bits = solution.hammingWeight(n);
        assertEquals(3, bits);
    }
}
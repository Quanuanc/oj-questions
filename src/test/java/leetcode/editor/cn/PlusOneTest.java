package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class PlusOneTest {

    PlusOne.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new PlusOne().new Solution();
    }

    @Test
    public void test1() {
        String s = "728509129536673284379577474947011174006";
        BigDecimal big = new BigDecimal(s);
        BigDecimal add = big.add(new BigDecimal(1));
        System.out.println(add);
    }
}
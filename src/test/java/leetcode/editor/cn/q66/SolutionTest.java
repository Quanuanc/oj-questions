package leetcode.editor.cn.q66;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        String s = "728509129536673284379577474947011174006";
        BigDecimal big = new BigDecimal(s);
        BigDecimal add = big.add(new BigDecimal(1));
        System.out.println(add);
    }
}

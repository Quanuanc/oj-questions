package dev.cheng.leetcode.q28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        String hay = "leetcode", need = "leetco";
        int result = solution.strStr(hay, need);
        Assertions.assertEquals(0, result);
    }
}

package dev.cheng.leetcode.q1108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void defangIPaddr() {
        String ret = solution.defangIPaddr("1.1.1.1");
        assertEquals("1[.]1[.]1[.]1", ret);
    }

}
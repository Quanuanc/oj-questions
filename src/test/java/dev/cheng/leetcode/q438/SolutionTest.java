package dev.cheng.leetcode.q438;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = solution.findAnagrams(s, p);
        assertEquals(List.of(0, 6), res);
    }

    @Test
    public void test2() {
        String s = "abab";
        String p = "ab";
        List<Integer> res = solution.findAnagrams(s, p);
        assertEquals(List.of(0, 1, 2), res);
    }
}

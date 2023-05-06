package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcofTest {

    ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof().new Solution();
    }

    @Test
    public void test1() {
        String s = "abcabcbb";
        int res = solution.lengthOfLongestSubstring(s);
        assertEquals(3, res);
    }

    @Test
    public void test2() {
        String s = "pwwkew";
        int res = solution.lengthOfLongestSubstring(s);
        assertEquals(3, res);
    }
}
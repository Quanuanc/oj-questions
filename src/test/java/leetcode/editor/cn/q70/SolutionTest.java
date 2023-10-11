package leetcode.editor.cn.q70;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.climbStairs(3));
        assertEquals(5, solution.climbStairs(4));
        System.out.println(solution.climbStairs(10));
    }
}

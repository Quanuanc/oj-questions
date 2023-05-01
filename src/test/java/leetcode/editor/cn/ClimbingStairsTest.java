package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    ClimbingStairs.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new ClimbingStairs().new Solution();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.climbStairs(3));
        assertEquals(5, solution.climbStairs(4));
        System.out.println(solution.climbStairs(10));
    }
}
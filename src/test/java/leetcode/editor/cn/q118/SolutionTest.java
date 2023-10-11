package leetcode.editor.cn.q118;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        List<List<Integer>> generate = solution.generate(10);
        System.out.println(generate);
    }
}

package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

    FirstBadVersion.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new FirstBadVersion().new Solution();
    }

    @Test
    void test1() {
        solution.firstBadVersion(100);
    }
}
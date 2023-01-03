package leetcode.editor.cn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    InsertInterval.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new InsertInterval().new Solution();
    }

    @Test
    void insert() {
        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};
        int[][] result = solution.insert(intervals, newInterval);
        int[][] expected = new int[][]{{1, 5}, {6, 9}};
        assertArrayEquals(expected, result);
    }
}
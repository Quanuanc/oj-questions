package leetcode.editor.cn.q2284;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String[] messages =
                new String[] {"Hello userTwooo", "Hi userThree", "Wonderful day Alice", "Nice day userThree"};
        String[] senders = new String[] {"Alice", "userTwo", "userThree", "Alice"};

        String ret = solution.largestWordCount(messages, senders);
        assertEquals("Alice", ret);
    }
}
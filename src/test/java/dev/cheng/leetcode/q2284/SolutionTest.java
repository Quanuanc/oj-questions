package dev.cheng.leetcode.q2284;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
package leetcode.editor.cn.q232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {

    @Test
    void test() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        int peek = myQueue.peek();
        assertEquals(1, peek);
        assertEquals(1, myQueue.pop());
        assertFalse(myQueue.empty());
    }
}

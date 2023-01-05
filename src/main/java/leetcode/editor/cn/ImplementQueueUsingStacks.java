package leetcode.editor.cn;

import java.util.Stack;

/**
 * [232] 用栈实现队列
 */
public class ImplementQueueUsingStacks {
    //leetcode submit region begin(Prohibit modification and deletion)
    class MyQueue {
        private final Stack<Integer> tail;
        private final Stack<Integer> head;

        public MyQueue() {
            tail = new Stack<>();
            head = new Stack<>();
        }

        public void push(int x) {
            tail.push(x);
        }

        public int pop() {
            if (head.isEmpty()) {
                while (!tail.isEmpty()) {
                    head.push(tail.pop());
                }
            }
            return head.pop();
        }

        public int peek() {
            if (head.isEmpty()) {
                while (!tail.isEmpty()) {
                    head.push(tail.pop());
                }
            }
            return head.peek();
        }

        public boolean empty() {
            return head.isEmpty() && tail.isEmpty();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
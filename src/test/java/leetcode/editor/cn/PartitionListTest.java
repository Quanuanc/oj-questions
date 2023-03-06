package leetcode.editor.cn;

import dsa.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionListTest {

    PartitionList.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new PartitionList().new Solution();
    }

    @Test
    void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        int x = 3;
        ListNode actual = solution.partition(head, x);

        ListNode expect = new ListNode(1);
        expect.next = new ListNode(2);
        expect.next.next = new ListNode(2);
        expect.next.next.next = new ListNode(4);
        expect.next.next.next.next = new ListNode(3);
        expect.next.next.next.next.next = new ListNode(5);

        for (ListNode p1 = actual, p2 = expect; p1 != null && p2 != null; p1 = p1.next, p2 = p2.next) {
            assertEquals(p2.val, p1.val);
        }
    }
}
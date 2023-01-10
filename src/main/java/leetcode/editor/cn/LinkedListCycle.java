package leetcode.editor.cn;

import dsa.ListNode;

/**
 * [141] 环形链表
 */
public class LinkedListCycle {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            if (head == null || head.next == null) {
                return false;
            }
            ListNode fast = head.next;
            while (slow != null && fast != null && fast.next != null) {
                if (slow == fast) {
                    return true;
                } else {
                    slow = slow.next;
                    fast = fast.next.next;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
package dev.cheng.leetcode.q86;

import dev.cheng.leetcode.dsa.ListNode;

// [86] 分隔链表
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
            /*
              新建两条链表，第一条存小于 x 的节点，第二条存大于 x 节点
             */
        ListNode p1 = new ListNode(), dummy1 = p1;
        ListNode p2 = new ListNode(), dummy2 = p2;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (cur.val < x) {
                p1.next = cur;
                p1 = p1.next;
            } else {
                p2.next = cur;
                p2 = p2.next;
            }
        }

        p1.next = dummy2.next;
        p2.next = null;
        return dummy1.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


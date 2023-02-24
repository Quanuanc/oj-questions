package leetcode.editor.cn;

import dsa.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * [23] 合并K个升序链表
 */
public class MergeKSortedLists {
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
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0)
                return null;

            ListNode dummy = new ListNode(-1);
            ListNode p = dummy;

            PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));
            for (ListNode head : lists) {
                if (head != null)
                    queue.add(head);
            }

            while (!queue.isEmpty()) {
                ListNode poll = queue.poll();
                p.next = poll;
                if (poll.next != null)
                    queue.add(poll.next);
                poll.next = null;
                p = p.next;
            }

            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
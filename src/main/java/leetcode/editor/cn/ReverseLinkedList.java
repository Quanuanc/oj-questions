package leetcode.editor.cn;

import dsa.ListNode;

/**
 * [206] 反转链表
 */
public class ReverseLinkedList {
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
        public ListNode reverseList(ListNode head) {
            ListNode pre = head, cur = null; // pre 在前，cur 在后
            while (pre != null) {
                ListNode t = pre.next;
                pre.next = cur;
                cur = pre;
                pre = t;
            }
            return cur;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
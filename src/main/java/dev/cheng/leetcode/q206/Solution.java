package dev.cheng.leetcode.q206;

import dev.cheng.leetcode.dsa.ListNode;

// [206] 反转链表

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
    /**
     * ----------- 1 -----------------
     * A -> B -> C -> D
     * p -> c -> n
     * ------------------------------
     * <p>
     * ----------- 2 -----------------
     * A -> B -> C -> D
     * p -> c -> n
     * ------------------------------
     * <p>
     * ----------- 3 -----------------
     * A -> B -> C -> D
     * p -> c -> n
     * ------------------------------
     */
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        while (c != null) {
            ListNode n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }
}


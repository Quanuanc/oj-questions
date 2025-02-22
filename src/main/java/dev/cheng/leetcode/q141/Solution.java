package dev.cheng.leetcode.q141;

import dev.cheng.leetcode.dsa.ListNode;

// [141] 环形链表

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
        if (head == null || head.next == null) return false;

        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (slow == null || fast == null) return false;
        }
        return true;
    }
}


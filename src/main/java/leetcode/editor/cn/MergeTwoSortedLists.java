package leetcode.editor.cn;

import dsa.ListNode;

// [21] 合并两个有序链表
public class MergeTwoSortedLists {
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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode preHead = new ListNode(-1);
            ListNode prev = preHead;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    prev.next = list1;
                    list1 = list1.next;
                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }
            prev.next = list1 == null ? list2 : list1;

            return preHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
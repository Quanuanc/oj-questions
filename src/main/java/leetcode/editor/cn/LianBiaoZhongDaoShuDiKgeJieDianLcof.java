package leetcode.editor.cn;

import dsa.ListNode;

/**
 * [剑指 Offer 22] 链表中倒数第k个节点
 */
public class LianBiaoZhongDaoShuDiKgeJieDianLcof {
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            /*
            p1 先向前 k 步，然后 p1 和 p2 一起向前走，p1 走到最后时，p2 就是倒数第 k 个节点
             */
            ListNode p1 = head, p2 = head;
            while (k > 0) {
                p1 = p1.next;
                k--;
            }
            while (p1 != null) {
                p2 = p2.next;
                p1 = p1.next;
            }
            return p2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
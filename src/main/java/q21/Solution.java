package q21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        ListNode l1 = new ListNode(1, node2);
        ListNode node44 = new ListNode(4);
        ListNode node3 = new ListNode(3, node44);
        ListNode l2 = new ListNode(1, node3);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(new Solution().mergeTwoLists(l1, l2));
    }
}

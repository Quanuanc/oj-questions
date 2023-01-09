package leetcode.editor.cn;

import dsa.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new MergeTwoSortedLists().new Solution();
    }

    @Test
    void test1() {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l14 = new ListNode(4);
        l11.next = l12;
        l12.next = l14;
        ListNode l21 = new ListNode(1);
        ListNode l23 = new ListNode(3);
        ListNode l24 = new ListNode(4);
        l21.next = l23;
        l23.next = l24;
        ListNode merged = solution.mergeTwoLists(l11, l21);
        int[] mergedArray = getArray(merged, 6);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, mergedArray);
    }

    @Test
    void test2() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode merged = solution.mergeTwoLists(l1, l2);
        int[] mergedArray = getArray(merged, 0);
        assertArrayEquals(null, mergedArray);
    }

    int[] getArray(ListNode list, int length) {
        if (list == null) return null;
        int[] result = new int[length];
        int index = 0;
        while (list != null) {
            result[index] = list.val;
            index++;
            list = list.next;
        }
        return result;
    }
}
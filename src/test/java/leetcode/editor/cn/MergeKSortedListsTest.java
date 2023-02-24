package leetcode.editor.cn;

import dsa.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    MergeKSortedLists.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new MergeKSortedLists().new Solution();
    }

    @Test
    void test1(){
        ListNode[] list = null;
        ListNode listNode = solution.mergeKLists(list);
        assertNull(listNode);
    }

    @Test
    void test2(){
        ListNode[] list = new ListNode[]{};
        ListNode listNode = solution.mergeKLists(list);
        assertNull(listNode);
    }
}
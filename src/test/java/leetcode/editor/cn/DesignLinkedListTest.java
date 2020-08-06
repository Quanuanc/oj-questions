package leetcode.editor.cn;

import org.junit.Assert;
import org.junit.Test;

public class DesignLinkedListTest {
    @Test
    public void test1() {
        DesignLinkedList.MyLinkedList list = new DesignLinkedList().new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        Assert.assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        Assert.assertEquals(3, list.get(1));

    }

    @Test
    public void test2() {
        DesignLinkedList.MyLinkedList list = new DesignLinkedList().new MyLinkedList();
        list.addAtHead(2);
        list.deleteAtIndex(1);
        list.addAtHead(2);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);
        list.addAtTail(5);
        Assert.assertEquals(2,list.get(5));
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);
    }
}
package q21;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (ListNode node = this; node != null; node = node.next) {
            sb.append(node.val).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}

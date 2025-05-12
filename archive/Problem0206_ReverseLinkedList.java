public class Problem0206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newList = null;

        while (head != null) {
            newList = new ListNode(head.val, newList);
            head = head.next;
        }

        return newList;
    }
}

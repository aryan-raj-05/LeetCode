package Problem0083_RemoveDuplicatesFromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode res = head;
        while (head.next != null) {
            if (head.val == head.next.val) {
                ListNode tmp = head.next;
                head.next = tmp.next;
                tmp.next = null;
                continue;
            }
            head = head.next;
        }
        return res;
    }
}

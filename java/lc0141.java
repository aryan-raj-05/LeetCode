public class lc0141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode turtle = head;
        ListNode hare = head.next;

        while (turtle != hare) {
            if (hare.next == null || hare.next.next == null)
                return false;
            turtle = turtle.next;
            hare = hare.next.next;
        }

        return true;
    }
}

public class Problem0002_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null & l2 == null)    return null;
        else if (l1 == null)            return l2;
        else if (l2 == null)            return l1;

        int sum;
        int carry = 0;
        ListNode res = new ListNode();
        ListNode temp = res;

        while (l1 != null & l2 != null) {
            sum = (l1.val + l2.val + carry) % 10;
            temp.next = new ListNode(sum, null);
            carry = (l1.val + l2.val + carry) / 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = (l1.val + carry) % 10;
            temp.next = new ListNode(sum, null);
            carry = (l1.val + carry) / 10;
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = (l2.val + carry) % 10;
            temp.next = new ListNode(sum, null);
            carry = (l2.val + carry) / 10;
            temp = temp.next;
            l2 = l2.next;
        }

        if (carry == 1)
            temp.next = new ListNode(1, null);

        return res.next;
    }
}

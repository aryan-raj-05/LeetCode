public class lc0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
        * here I have used iterative method
        * to solve the given problem, it can
        * also be solved using recursion, I
        * might solve it later.
        */
        ListNode solution = new ListNode();
        ListNode temp = solution;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val, null);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val, null);
                temp = temp.next;
                list2 = list2.next;
            }
        }

        if (list1 != null || list2 != null) {
            while (list2 != null) {
                temp.next = new ListNode(list2.val, null);
                temp = temp.next;
                list2 = list2.next;
            }

            while (list1 != null) {
                temp.next = new ListNode(list1.val, null);
                temp = temp.next;
                list1 = list1.next;
            }

        }
        return solution.next;
    }
}

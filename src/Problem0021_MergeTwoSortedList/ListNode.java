package Problem0021_MergeTwoSortedList;

/*
        Definition of the ListNode class
        used for LeetCode Problem 0021,
        Merge Two Sorted List
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(){}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

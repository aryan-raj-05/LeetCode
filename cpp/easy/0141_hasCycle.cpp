#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    bool hasCycle(ListNode *head) {
        if (head == NULL || head->next == NULL) {
            return false;
        }
        ListNode *slow, *fast;
        slow = head;
        fast = head;
        do {
            if (fast->next == NULL || fast->next->next == NULL)   
                return false;
            slow = slow->next;
            fast = fast->next->next;
        } 
        while (slow != fast);
        return true;
    }
};
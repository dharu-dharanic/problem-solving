/*
Leetcode 160. Intersection of Two Linked Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode t1 = headA;
        ListNode t2 = headB;

        while (t1 != t2) {

            t1 = (t1 == null) ? headB : t1.next;
            t2 = (t2 == null) ? headA : t2.next;
        }

        return t1;
    }
}
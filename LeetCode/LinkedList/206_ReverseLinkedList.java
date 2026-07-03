/*
Leetcode 206. Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
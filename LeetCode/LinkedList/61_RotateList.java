/*
Leetcode 61. Rotate List
https://leetcode.com/problems/rotate-list/

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k %= length;

        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}
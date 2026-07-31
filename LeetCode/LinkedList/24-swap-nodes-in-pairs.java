package LeetCode.LinkedList;

/*
Leetcode 24. Swap Nodes in Pairs
https://leetcode.com/problems/swap-nodes-in-pairs/

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }
}
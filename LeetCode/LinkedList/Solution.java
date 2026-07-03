/*
Leetcode 141. Linked List Cycle
https://leetcode.com/problems/linked-list-cycle/

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        while(head!=null)
        {
            if(set.contains(head))
            {
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    
    }
}
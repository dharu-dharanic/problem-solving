/*
Leetcode 2073. Time Needed to Buy Tickets
https://leetcode.com/problems/time-needed-to-buy-tickets/

Time Complexity: O(n * max(tickets))
Space Complexity: O(n)
*/

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }

        int time = 0;

        while (!queue.isEmpty()) {

            int person = queue.poll();

            tickets[person]--;
            time++;

            if (tickets[person] == 0) {

                if (person == k) {
                    return time;
                }

            } else {
                queue.offer(person);
            }
        }

        return time;
    }
}
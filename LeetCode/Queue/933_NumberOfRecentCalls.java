package LeetCode.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Leetcode 933. Number of Recent Calls
https://leetcode.com/problems/number-of-recent-calls/

Time Complexity: O(1) Amortized
Space Complexity: O(n)
*/


class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

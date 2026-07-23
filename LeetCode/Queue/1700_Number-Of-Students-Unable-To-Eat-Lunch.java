package LeetCode.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
Leetcode 1700. Number of Students Unable to Eat Lunch
https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

Time Complexity: O(n²) (simulation approach)
Space Complexity: O(n)
*/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> q = new LinkedList<>();
        Stack<Integer> sw = new Stack<>();

        for (int i = students.length - 1; i >= 0; i--) {
            q.offer(students[i]);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sw.push(sandwiches[i]);
        }

        int count = 0;

        while (!sw.isEmpty() && count < q.size()) {
            if (q.peek().equals(sw.peek())) {
                q.poll();
                sw.pop();
                count = 0;
            } else {
                q.offer(q.poll());
                count++;
            }
        }

        return q.size();
    }
}

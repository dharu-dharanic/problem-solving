package LeetCode.Stack;

/*
Leetcode 1700. Number of Students Unable to Eat Lunch
https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

Time Complexity: O(n²) (queue simulation)
Space Complexity: O(n)
*/

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Solution {

    public int countStudents(int[] students, int[] sandwiches) {

        Deque<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = students.length - 1; i >= 0; i--) {
            queue.offer(students[i]);
        }

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }

        int rotations = 0;

        while (!stack.isEmpty() && rotations < queue.size()) {

            if (queue.peek().equals(stack.peek())) {
                queue.poll();
                stack.pop();
                rotations = 0;
            } else {
                queue.offer(queue.poll());
                rotations++;
            }
        }

        return queue.size();
    }
}
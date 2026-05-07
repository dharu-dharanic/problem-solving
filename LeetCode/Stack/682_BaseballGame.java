package LeetCode.Stack;

/*
Leetcode 682. Baseball Game
https://leetcode.com/problems/baseball-game/

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : operations) {

            if (s.equals("C")) {
                stack.pop();

            } else if (s.equals("D")) {
                stack.push(2 * stack.peek());

            } else if (s.equals("+")) {

                int first = stack.pop();
                int sum = first + stack.peek();

                stack.push(first);
                stack.push(sum);

            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        int total = 0;

        for (int score : stack) {
            total += score;
        }

        return total;
    }
}
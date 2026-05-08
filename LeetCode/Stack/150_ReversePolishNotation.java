/*
Leetcode 150. Evaluate Reverse Polish Notation
https://leetcode.com/problems/evaluate-reverse-polish-notation/

Time Complexity: O(n)
Space Complexity: O(n)
*/

package LeetCode.Stack;

import java.util.Deque;
import java.util.ArrayDeque;

class Solution {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {

            if (s.equals("+")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (s.equals("-")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (s.equals("*")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (s.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            } else {

                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}
package LeetCode.Stack;

/*
Leetcode 2000. Reverse Prefix of Word
https://leetcode.com/problems/reverse-prefix-of-word/

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        boolean found = false;

        for (char c : word.toCharArray()) {

            if (c == ch && !found) {
                found = true;
                stack.push(c);

                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }

                continue;
            }

            if (found) {
                result.append(c);
            } else {
                stack.push(c);
            }
        }

        return found ? result.toString() : word;
    }
}
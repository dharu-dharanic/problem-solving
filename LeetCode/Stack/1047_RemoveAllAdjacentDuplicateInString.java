/*
Leetcode 1047. Remove All Adjacent Duplicates In String
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

Time Complexity: O(n)
Space Complexity: O(n)
*/
package LeetCode.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public String removeDuplicates(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.reverse().toString();
    }
}

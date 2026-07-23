package LeetCode.Queue;

/*
Leetcode 232. Implement Queue using Stacks
https://leetcode.com/problems/implement-queue-using-stacks/

Time Complexity:
push()  : O(1)
pop()   : O(1) Amortized
peek()  : O(1) Amortized
empty() : O(1)

Space Complexity: O(n)
*/

import java.util.Stack;

class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.pop();
    }

    public int peek() {

        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }

        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
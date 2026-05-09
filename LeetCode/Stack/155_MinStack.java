package LeetCode.Stack;

/*
LeetCode 155 Min Stack
https://leetcode.com/problems/min-stack/

Time Complexity:
push()  -> O(1)
pop()   -> O(1)
top()   -> O(1)
getMin()-> O(1)

Space Complexity: O(n)

*/

import java.util.*;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
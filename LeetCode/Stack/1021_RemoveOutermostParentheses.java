package LeetCode.Stack;

import java.util.Stack;

/*
Leetcode 1021 Remove Outermost Parentheses
https://leetcode.com/problems/remove-outermost-parentheses/description/
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st =new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(st.isEmpty())
                {
                    st.push(c);
                }
                else
                {
                    sb.append(c);
                    st.push(c);
                }
            }
            else 
            {
                st.pop();
                if(!st.isEmpty())
                {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}

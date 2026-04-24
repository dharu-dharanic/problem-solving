//Leetcode 125 Valid Palindrome


package LeetCode.TwoPointer;

class Solution {
    public boolean isPalindrome(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(arr[start]==','||arr[start]==';'||arr[start]=='.'||arr[start]==' ')
            start++;
            else if(arr[end]==','||arr[end]==';'||arr[end]=='.'||arr[end]==' ')
            end--;
            else if(Character.toLowerCase(arr[start])!=Character.toLowerCase(arr[end]))
            {
            return false;
            }
            else
            {
            start++;end--;
            }
            
        }
        return true;
    }
}

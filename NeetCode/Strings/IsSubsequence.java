/* 
A subsequence of a string is a new string that is formed from the 
original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters.
*/

package NeetCode.Strings;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<t.length())
        {
            if(j<s.length() &&t.charAt(i)==s.charAt(j))
            {
            j++;
            }
            if(j==s.length()) 
                return true;
            i++;
        }
        return j==s.length();
    }
}

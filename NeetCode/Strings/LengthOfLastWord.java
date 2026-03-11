package NeetCode.Strings;

class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(i>=0&&s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0&&s.charAt(i)!=' ')
        {
            count++;
            i--;
        }
        return count;

        // String word[] = s.trim().split("\\s+");
        // int lastword = word[word.length - 1].length();
        // return lastword;
        
    }
}

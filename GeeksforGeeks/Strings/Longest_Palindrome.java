package GeeksforGeeks.Strings;

class Solution {
    static String longestPalindrome(String s) {
       
        
        String str="";
        
        for(int i=0;i<s.length();i++)
        {
        String odd=pali(s,i,i);
        String even=pali(s,i,i+1);
        
        if(str.length()<odd.length())
        {
            str=odd;
        }
        if(str.length()<even.length())
        {
            str=even;
        }
        
        }
        
        return str;
        
    }
    public static String pali(String s,int l,int r)
    {
        
        while(l>=0&&r<s.length()&& s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
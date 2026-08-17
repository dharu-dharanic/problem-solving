package GeeksforGeeks.Strings;

import java.util.*;

class Solution {
    static ArrayList<String> findPermutation(String s) {
        // Code here
        
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        s = new String(temp);
        ArrayList<String> list=new ArrayList<>();
        boolean used[]=new boolean[s.length()];
        StringBuilder sb=new StringBuilder();
        permute(s,used,sb,list);
        return list;
        
    }
    
    public static void permute(String s,boolean[] used,StringBuilder sb,ArrayList<String> list)
    {
        
    
        if(s.length()==sb.length())
        {
            list.add(sb.toString());
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            
            if(used[i]) continue;
            
            if(i>0&&s.charAt(i)==s.charAt(i-1)&&!used[i-1]) continue;
            
            sb.append(s.charAt(i));
            used[i]=true;
            permute( s,used,sb,list);
            
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
}
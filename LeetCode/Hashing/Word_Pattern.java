/* 
Leetcode 290. Word Pattern
Link: <https://leetcode.com/problems/word-pattern/>
*/

package LeetCode.Hashing;

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        if(pattern.length() != str.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(map1.containsKey(pattern.charAt(i))&&!map1.get(pattern.charAt(i)).equals(str[i]))
            {
                return false;
            }
            if(map2.containsKey(str[i])&&map2.get(str[i])!=pattern.charAt(i))
            return false;
            map1.put(pattern.charAt(i),str[i]);
            map2.put(str[i],pattern.charAt(i));
        }
        return true;

    }
}

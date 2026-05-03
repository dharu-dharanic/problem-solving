//Leetcode 49 Group Anagrams
// https://leetcode.com/problems/group-anagrams/

package LeetCode.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
          char[] word=s.toCharArray();
          Arrays.sort(word);
          String key=Arrays.toString(word);
          map.putIfAbsent(key,new ArrayList<>());   
          map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

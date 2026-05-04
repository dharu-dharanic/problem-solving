//Leetcode 438 Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/

package LeetCode.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;

            if (i >= k) {
                sFreq[s.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(pFreq, sFreq)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }
}
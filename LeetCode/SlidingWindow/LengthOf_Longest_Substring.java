// Leetcode 3 Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

package LeetCode.SlidingWindow;
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        
        int[] map = new int[128];
        Arrays.fill(map, -1);

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (map[ch] >= left) {
                left = map[ch] + 1;
            }

            map[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

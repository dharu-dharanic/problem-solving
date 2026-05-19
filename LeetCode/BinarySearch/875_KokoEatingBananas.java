package LeetCode.BinarySearch;

/*
Leetcode 875 Koko Eating Bananas
https://leetcode.com/problems/koko-eating-bananas/
Time Complexity: O(n log m)
Space Complexity: O(1)
*/

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int hours = 0;

            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid);
            }

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
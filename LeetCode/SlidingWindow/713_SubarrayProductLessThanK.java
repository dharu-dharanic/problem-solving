/*
Leetcode 713 Subarray Product less than K
https://leetcode.com/problems/subarray-product-less-than-k/
Time Complexity: O(n)
Space Complexity: O(1)
*/

package LeetCode.SlidingWindow;

class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
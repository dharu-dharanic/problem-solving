//Leetcode 167 Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package LeetCode.TwoPointer;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[]{l + 1, r + 1}; 
            } else if (sum > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{-1, -1};
    }
}

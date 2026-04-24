// Leetcode 26 Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package LeetCode.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int ind=0, n=nums.length-1;
        for(int i =0;i<n;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }

            nums[ind++]=nums[i];
        }
        nums[ind++]=nums[n];
        return ind;
    }
}

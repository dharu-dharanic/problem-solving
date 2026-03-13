package LeetCode.Arrays;

class Solution {
    public int maxSubArray(int[] nums) {
        int maximum=nums[0],current_max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current_max=Math.max(nums[i],current_max+nums[i]);
            maximum=Math.max(current_max,maximum);
        }
        return maximum;
    }
}
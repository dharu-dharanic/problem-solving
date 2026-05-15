package LeetCode.SlidingWindow;

/*
Leetcode 643 Maximum Average Subarray I
https://leetcode.com/problems/maximum-average-subarray-i/
Time → O(n)
Space → O(1)
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       for(int i=0;i<k;i++)
       {
        sum+=nums[i];
       }
        int max=sum;
       for(int i=k;i<nums.length;i++)
       {
        sum=sum-nums[i-k]+nums[i];
        max=Math.max(sum,max);
       }
       double avg=(double)max/k;
       return avg;
    }
}

package LeetCode.Arrays;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate area between left and right lines
            int width = right - left;
            int currArea = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currArea);

            // Move the pointer at the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}


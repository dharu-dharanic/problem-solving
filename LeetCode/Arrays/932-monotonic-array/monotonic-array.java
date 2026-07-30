class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true; 
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dec = false;  // cannot be decreasing
            }
            if (nums[i] < nums[i - 1]) {
                inc = false;  // cannot be increasing
            }
        }

        return inc || dec;
    }
}
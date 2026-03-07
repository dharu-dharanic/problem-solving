package GeeksforGeeks.Arrays;

// Problem: Second Largest
// Platform: GeeksforGeeks
// Topic: Arrays
// Link: https://www.geeksforgeeks.org/problems/second-largest3735/1
// Approach: Traverse the array once while maintaining the largest and second largest elements.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int smax = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        return smax;
    }
}

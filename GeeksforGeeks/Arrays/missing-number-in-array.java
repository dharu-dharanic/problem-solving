package GeeksforGeeks.Arrays;

// Problem: Missing in Array
// Platform: GeeksforGeeks
// Topic: Arrays
// Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
// Approach: Calculate the sum of numbers from 1 to n and subtract the sum of elements in the array.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    int missingNum(int arr[]) {

        int sum = 0, arr_sum = 0;

        // Alternatively, sum can be calculated using the formula sum=n*(n+1)/2
        for (int i = 1; i <= arr.length + 1; i++) {
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
        }

        return sum - arr_sum;
    }
}
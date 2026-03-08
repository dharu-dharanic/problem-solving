package GeeksforGeeks.Arrays;


import java.util.*;

public class indexes_of_subarray_sum {

/*
Problem: Indexes of subarray sum
Platform: GeeksforGeeks
Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
Topic: Arrays / Sliding Window

*/

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        ArrayList<Integer> res = new ArrayList<>();
        int s = 0, sum = 0;

        for(int e = 0; e < arr.length; e++) {

            sum += arr[e];

            while(sum > target && s <= e) {
                sum -= arr[s];
                s++;
            }

            if(sum == target) {
                res.add(s + 1); 
                res.add(e + 1); 
                return res;
            }
        }

        res.add(-1);
        return res;
    }

}

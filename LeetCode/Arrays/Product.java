//Leetcode 238 Product Of Array except self
// https://leetcode.com/problems/product-of-array-except-self/

package LeetCode.Arrays;

class Solution {
    public int[] productExceptSelf(int[] arr) {

        int[] res=new int[arr.length];
        res[0]=1;

        //prefix
        for(int i=1;i<arr.length;i++)
        {
            res[i]=res[i-1]*arr[i-1]; 
        }

        //suffix
        int suffix=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            res[i]=res[i]*suffix;
            suffix*=arr[i];
        }
    return res;

    }
}

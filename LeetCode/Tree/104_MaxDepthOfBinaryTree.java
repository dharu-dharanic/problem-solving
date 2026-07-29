package LeetCode.Tree;

/*
Leetcode 104. Maximum Depth of Binary Tree
https://leetcode.com/problems/maximum-depth-of-binary-tree/

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

package LeetCode.Tree;

/*
Leetcode 98. Validate Binary Search Tree
https://leetcode.com/problems/validate-binary-search-tree/

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, TreeNode min, TreeNode max) {

        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min.val) {
            return false;
        }

        if (max != null && root.val >= max.val) {
            return false;
        }

        return validate(root.left, min, root)
                && validate(root.right, root, max);
    }
}
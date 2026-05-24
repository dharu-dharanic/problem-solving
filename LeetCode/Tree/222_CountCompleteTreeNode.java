package LeetCode.Tree;

/*
Leetcode 222. Count Complete Tree Nodes
https://leetcode.com/problems/count-complete-tree-nodes/

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }
}

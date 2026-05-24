package LeetCode.Tree;

/*
Leetcode 145. Binary Tree Postorder Traversal
https://leetcode.com/problems/binary-tree-postorder-traversal/

Time Complexity: O(n)
Space Complexity: O(h)
*/

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        postorder(root, result);

        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}

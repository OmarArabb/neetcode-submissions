/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int longest = 0;

    private int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = height(treeNode.left);
        int right = height(treeNode.right);

        longest = Math.max(longest, left + right);
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return longest;

    }
}

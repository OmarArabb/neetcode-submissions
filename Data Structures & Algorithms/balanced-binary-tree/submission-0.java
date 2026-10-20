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
    boolean isBalanced = true;

    private int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = height(treeNode.left);
        int right = height(treeNode.right);
        
        if (Math.abs(left - right) > 1){
            isBalanced = false;
        }
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {

        height(root);
        return isBalanced;


    }
}

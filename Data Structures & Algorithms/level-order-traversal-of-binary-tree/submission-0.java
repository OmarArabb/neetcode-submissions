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
        public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> tree = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        tree.add(root);
        while (!tree.isEmpty()){
            List<Integer> level = new ArrayList<>();
            for (int i = tree.size(); i > 0 ; i--) {
                TreeNode n = tree.poll();
                if (n != null){
                    level.add(n.val);
                    tree.add(n.left);
                    tree.add(n.right);
                }
            }
            if (!level.isEmpty()){
                ans.add(level);
            }
        }
        return ans;
    }
}

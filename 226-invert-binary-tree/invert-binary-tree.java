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
    public TreeNode invertTree(TreeNode root) {
        // 1.base case agar only root ho 
        if (root == null) return root;

        // swap left & right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursive calls
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
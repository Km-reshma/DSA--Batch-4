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
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        int leftD1 = diameterOfBinaryTree(root.left);
        int rightD1 = diameterOfBinaryTree(root.right);

        int rootInclude = Height(root.left) + Height(root.right);

        return Math.max(Math.max(leftD1, rightD1), rootInclude);
    }

    public int Height(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }
}
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
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode flatRight = root.right;
        root.right = root.left;
        flatten(root.left);
        root.left = null;
        flatten(flatRight);
        
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = flatRight;
    }
}
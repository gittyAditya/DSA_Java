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
    
    public TreeNode buildSubtree(int start, int end, int[] nums){     
        int max = -1;
        int maxIndex = -1;
        for(int i=start; i<=end; ++i){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(max);
        if(start != maxIndex)
            root.left = buildSubtree(start, maxIndex-1, nums);
        if(end != maxIndex)
            root.right = buildSubtree(maxIndex+1, end, nums);
        return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int size = nums.length;
        TreeNode root = buildSubtree(0, size-1, nums);
        return root;
    }
}
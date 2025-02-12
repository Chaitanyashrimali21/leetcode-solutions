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
    public int goodNodes(TreeNode root) {
        return dfs( root , 0 , Integer.MIN_VALUE);
        
    }

    private int dfs(TreeNode root , int ans , int currMax){
        if(root == null)
             return 0;

          int rootAnswer = 0;
          if(root.val>= currMax){
            rootAnswer = 1;
            currMax = root.val;
          }

          int leftAnswer = dfs(root.left , ans, currMax);
          int rightAnswer = dfs(root.right , ans , currMax);

          return leftAnswer + rightAnswer + rootAnswer;

    }
}
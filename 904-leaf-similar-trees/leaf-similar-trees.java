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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        dfs(root1, list1);
        dfs(root2, list2);

        if(list1.equals(list2))
          return true;

          return false;
    }

    private void dfs(TreeNode root , List<Integer> leafValue){
        if(root == null) return;

        if(root.left == null && root.right == null)
          leafValue.add(root.val);

          dfs(root.left , leafValue);
          dfs(root.right , leafValue);
    }
}
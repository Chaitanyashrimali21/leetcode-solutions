class Solution {
    private int count = 0;
    
    private void dfs(TreeNode root, long sum){
        if(root == null) return;
        
        if(sum == root.val) count += 1;
        
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);

    }
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        // preorder
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        
        return count;
    }
}
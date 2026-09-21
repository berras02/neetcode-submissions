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
    int answer = -1;
    int globalK;
    public int kthSmallest(TreeNode root, int k){
        globalK = k;
        helper(root);
        return answer;
    }

    public void helper(TreeNode root){
        if(root == null || globalK == 0) return;

        helper(root.left);
        globalK -= 1;

        if(globalK == 0){
            answer = root.val;
            return;
        }

        helper(root.right);
    }
}

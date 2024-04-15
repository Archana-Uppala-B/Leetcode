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
    public int sumNumbers(TreeNode root) {
        int total[]=new int[1];
        total[0]=0;
        findSum(root,0,total);
        return total[0];
    }
    
    public void findSum(TreeNode root,int sum,int[] total)
    {
        sum=sum*10+root.val;
        if(root.left==null && root.right==null)
        {
            total[0]+=sum;
        }
        if(root.left!=null)
            findSum(root.left,sum,total);
        if(root.right!=null)
            findSum(root.right,sum,total);
    }
}
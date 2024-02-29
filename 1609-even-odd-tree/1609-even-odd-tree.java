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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)
            return true;
        
        boolean isEven = true;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty())
        {   
            int prev= isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                if(isEven==true)
                {
                    if(temp.val%2==0 || prev>=temp.val)
                        return false;
                }
                if(isEven==false)
                {
                    if(temp.val%2==1 || prev<=temp.val)
                      return false;
                }
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                
                prev=temp.val;
            }
             isEven=!isEven;
        }
        return true;
    }
}
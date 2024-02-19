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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        q.offer(root);
        int flag=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> sublist =new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                if(flag==1)
                    sublist.add(temp.val);
                else
                    sublist.add(0,temp.val);
            
            }
            list.add(sublist);
            flag=(flag==0)? 1:0;
        }
        return list;
    }
}
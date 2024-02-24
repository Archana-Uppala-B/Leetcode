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

class ino{
    public  void in(TreeNode root , ArrayList<Integer> inorder)
    {
        if(root==null) return;
        in(root.left,inorder);
        inorder.add(root.val);
        in(root.right,inorder);
    }
}
class BSTIterator {
    ArrayList<Integer> inorder=new ArrayList<>();
    int i=0;
    
    public  BSTIterator(TreeNode root) {
       ino obj=new ino();
       obj.in(root,inorder);
    }
    
    public int next() {
        return inorder.get(i++);
    }
    
    public  boolean hasNext() {
        if(i<inorder.size())
            return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
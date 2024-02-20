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

class Tuple{
    TreeNode node;
    int col;
    int row;
    
    Tuple(TreeNode node,int col,int row){
        this.node=node;
        this.col=col;
        this.row=row;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple temp=q.poll();
            
            if(map.containsKey(temp.col)==false){
                map.put(temp.col,new TreeMap<>());
            }
            
            if(map.get(temp.col).containsKey(temp.row)==false){
                map.get(temp.col).put(temp.row,new PriorityQueue<>());
            }
            
            map.get(temp.col).get(temp.row).offer(temp.node.val);
            
            if(temp.node.left!=null)
            {
                q.offer(new Tuple(temp.node.left,temp.col-1,temp.row+1));
            }
            
            if(temp.node.right!=null)
            {
                q.offer(new Tuple(temp.node.right,temp.col+1,temp.row+1));
            }
        
        }
        
        List<List<Integer>> list=new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> o : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> p : o.values())
            {
                while(!p.isEmpty()){
                    list.get(list.size()-1).add(p.poll());
                }
            }
        }
        return list;
    }
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        //indegree-outdegree = 1;
        
        int[] count=new int[n+1];
        
        for(int[] tr: trust)
        {
            count[tr[0]]--;
            count[tr[1]]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(count[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}
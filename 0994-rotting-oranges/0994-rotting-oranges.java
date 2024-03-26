class Triple{
    int i;
    int j;
    int time;
    Triple(int i,int j,int time)
    {
        this.i=i;
        this.j=j;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        Queue<Triple> q=new LinkedList<>();
        
        int vis[][]=new int[m][n];
        int t[]=new int[1];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Triple(i,j,0));
                    vis[i][j]=2;
                }
                else
                {
                    vis[i][j]=0;
                }
            }
        }
        
        bfs(q,grid,vis,t);
        
        //counting all the unreachable fresh oranges.. that are not rotten
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]!=2)
                    count++;
            }
        }
        if(count>0) 
            return -1;
        else
         return t[0];
    }
    
    public void bfs(Queue<Triple> q, int[][] grid, int[][] vis, int[] t)
    {
        int m=grid.length;
        int n=grid[0].length;
        while(!q.isEmpty())
        {
            Triple temp=q.poll();
            
            int ti=temp.i;
            int tj=temp.j;
            int time=temp.time;
            
            t[0]=Math.max(t[0],time);
            
            int di[]={-1,0,1,0};
            int dj[]={0,1,0,-1};
            
            for(int k=0;k<4;k++)
            {
                int ni=ti+di[k];
                int nj=tj+dj[k];
                    
                if(ni>=0 && ni<m && nj>=0 && nj<n && grid[ni][nj]==1 && vis[ni][nj]!=2)
                {
                    vis[ni][nj]=2;
                    q.add(new Triple(ni,nj,time+1));
                }
            }
        }
    }
}
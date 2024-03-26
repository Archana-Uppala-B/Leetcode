class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int vis[][] =new int[m][n];
        
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==0)
                {
                    dfs(i,j,vis,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(int i,int j,int[][] vis, char[][] grid)
    {
        vis[i][j]=1;
        int m=grid.length;
        int n=grid[0].length;
        
        int di[]={-1, 0, 1, 0};
        int dj[]={0, 1, 0, -1};
        
        for(int k=0;k<4;k++)
        {
            int ni=i+di[k];
            int nj=j+dj[k];
            
            if(ni>=0  && ni<m && nj>=0 && nj<n && vis[ni][nj]==0 && grid[ni][nj]=='1')
            {
                dfs(ni,nj,vis,grid);
            }
        }
    }
}
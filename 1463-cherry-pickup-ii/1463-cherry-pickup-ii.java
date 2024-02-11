class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int [m][n][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 Arrays.fill(dp[i][j],-1);
            }
        }
        return fun(0,0,n-1,m,n,grid,dp);
    }
    private int fun(int i,int j1,int j2,int m,int n,int [][]a,int [][][] dp)
    {
        if(j1<0 || j1>=n ||j2<0 || j2>=n) return Integer.MIN_VALUE;
        if(i==m-1)
        {
            if(j1==j2) return a[i][j1];
            else return a[i][j1]+a[i][j2];
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                if(j1==j2)
                {
                    maxi=Math.max(maxi, a[i][j1]+fun(i+1,j1+dj1,j2+dj2,m,n,a,dp));
                }
                else
                {
                    maxi=Math.max(maxi, a[i][j1]+a[i][j2]+fun(i+1,j1+dj1,j2+dj2,m,n,a,dp));             
                }
            }
        }
        return dp[i][j1][j2]=maxi;
    }
}
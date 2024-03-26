class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        
        int[][] vis = new int[m][n];
        int old=image[sr][sc];
        dfs(sr,sc,old,color,vis,image);
        return image;
    }
    
    public void dfs(int i,int j,int old,int color,int[][] vis,int[][] image)
    {
        vis[i][j]=1;
        image[i][j]=color;
        
        int m=image.length;
        int n=image[0].length;
        
        int di[]={-1,0,1,0};
        int dj[]={0,1,0,-1};
        
        for(int k=0;k<4;k++)
        {
            int ni=i+di[k];
            int nj=j+dj[k];
                
            if(ni>=0 && ni<m && nj>=0 && nj<n && vis[ni][nj]==0 && image[ni][nj]==old)
            {
                dfs(ni,nj,old,color,vis,image);
            }
        }
    }
}
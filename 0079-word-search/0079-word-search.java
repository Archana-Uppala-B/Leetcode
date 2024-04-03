class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        
        boolean vis[][]=new boolean[m][n];
        
        boolean ans=false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(word.charAt(0)==board[i][j] && dfs(i,j,vis,0,board,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int i,int j,boolean vis[][], int ind,char board[][], String word)
    {
        if(ind==word.length())
        {
            return true;
        }
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || vis[i][j]|| word.charAt(ind)!=board[i][j])
        {
            return false;
        }
        
        vis[i][j]=true;
        
        if(dfs(i+1,j,vis,ind+1,board,word) 
           || dfs(i-1,j,vis,ind+1,board,word) 
           || dfs(i,j+1,vis,ind+1,board,word) 
           || dfs(i,j-1,vis,ind+1,board,word))
        {
            return true;
        }
        
        vis[i][j]=false;
        return false;
    }
}
class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int brac=0;
        for(char c: s.toCharArray())
        {
            if(c=='(')
                brac++;
            else if(c==')')
                brac--;
            
            ans=Math.max(ans,brac);
        }
        return ans;
    }
}
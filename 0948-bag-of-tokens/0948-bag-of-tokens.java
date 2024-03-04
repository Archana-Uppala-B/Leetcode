class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        int ans=0;
        int score=0;
        while(i<=j)
        {
            if(power>=tokens[i])
            {
                power-=tokens[i];
                score++;
                ans=Math.max(ans,score);
                i++;
            }
            else if(score>0)
            {
                score--;
                power+=tokens[j];
                j--;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
}
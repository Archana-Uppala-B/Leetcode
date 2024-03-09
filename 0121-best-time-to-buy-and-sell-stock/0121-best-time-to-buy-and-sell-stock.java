class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int next[]=new int[n];
        
        next[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            next[i]=Math.max(next[i+1],prices[i+1]);
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,next[i]-prices[i]);
        }
        return max;
    }
}
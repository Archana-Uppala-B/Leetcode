class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return fun(0,arr,k,dp);
    }
    public int fun(int ind,int[] arr,int k,int[] dp){
        int n=arr.length;
        if(ind==n) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int maxsum=0;
        int sum=0;
        int len=0,maxi=Integer.MIN_VALUE;
        for(int i=ind;i<Math.min(n,ind+k);i++){
            len++;
            maxi=Math.max(maxi,arr[i]);
            sum=(len*maxi)+fun(i+1,arr,k,dp);
            dp[ind]=maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}
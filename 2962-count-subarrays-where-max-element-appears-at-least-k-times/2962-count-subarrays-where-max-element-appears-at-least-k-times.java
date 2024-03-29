class Solution {
    public long countSubarrays(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        
        int max=Integer.MIN_VALUE;
        for(int num : nums)
        {
            max=Math.max(max,num);
        }
        
        int count=0;
        long ans=0;
        while(j<n)
        {
            if(nums[j]==max)
            {
                count++;
            }
            
            while(count==k)
            {
                if(nums[i]==max)
                {
                    count--;
                }
                i++;
            }
            ans+=i;
            j++;
        }
        return ans;
    }
}
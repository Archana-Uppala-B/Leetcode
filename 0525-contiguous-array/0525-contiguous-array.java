class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int longest=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i]==0 ? -1 : 1;
            if(sum==0)
            {
                 if(longest<i+1)
                 {
                     longest=i+1;
                 }
            }
            else if(map.containsKey(sum))
            {
                if(longest<i-map.get(sum))
                {
                    longest=i-map.get(sum);
                }
            }
            
            else
            {
                map.put(sum,i);
            }    
        }
        return longest;
    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.getOrDefault(nums[i],0));
        }
        int sum=0;
        
        for(int i: map.keySet())
        {
            if(map.get(i)==max)
            {
                sum+=max;
            }
        }
        
        return sum;
    }
}
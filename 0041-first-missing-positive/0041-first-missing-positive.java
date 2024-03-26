class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       // first missing positive will start from 1
       int miss=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==miss)
                miss++;
        }
        return miss;
    }
}
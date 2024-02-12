class Solution {
    public int majorityElement(int[] nums) {
        int count=0,i;
        int majority=nums[0];
        for(i=1;i<nums.length;i++)
        {
            if(majority==nums[i])
            {
                count++;
            }
            else if(count==0)
            {
                majority=nums[i];
            }
            else
            {
                count--;
            }
        }
        return majority;
    }
}
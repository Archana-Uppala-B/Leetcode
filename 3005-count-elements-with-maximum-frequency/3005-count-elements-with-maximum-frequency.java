class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[]=new int[101]; // to store the freq of each and every element
        
        int max=0;
        for(int num: nums)
        {
            count[num]++;
            max=Math.max(max,count[num]);
        }
        
        int c=0;
        for(int i=0;i<101;i++)
        {
            if(max==count[i])
            {
                c++;
            }
        }
        return c*max;
    }
}
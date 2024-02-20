class Solution {
    public int missingNumber(int[] nums) {
        
        //USING BINARY SEARCH...
        int left=0,right=nums.length;
        int mid=0;
        Arrays.sort(nums);
        
        while(left<right)
        {
            mid=(left+right)/2;
            if(nums[mid]>mid) 
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }
}

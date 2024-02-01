class Solution {
    public void sortColors(int[] nums) {
       //soliving using the dutch national algorithm..
       // 0 to low-1 ---0s
       // low to mid-1 --1s
       // mid to high -1 -- any random stuff
       // high to n-1 ---2s
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
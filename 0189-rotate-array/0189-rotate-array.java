class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k=k%n;
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
        return;
    }
    public  void reverse(int i,int j,int[] nums)
    {
        int temp;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
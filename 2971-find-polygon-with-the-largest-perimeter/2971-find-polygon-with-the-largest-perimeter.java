class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long peri=-1;
        long sum=0;
        for(int i:nums){
            if(sum>i){
                peri=sum+i;
            }
            sum+=i;
        }
        return peri;
    }
}
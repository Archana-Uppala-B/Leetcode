class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int p=0,ne=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                pos[p++]=nums[i];
            }
            else{
                neg[ne++]=nums[i];
            }
        }
        int t=0;
        p=0;
        ne=0;
        boolean temp=true;
        while(t<n){
            if(temp)
            {
              nums[t++]=pos[p++];
              temp=false; 
            }
            else{
                nums[t++]=neg[ne++];
                    temp=true;
            }
        }
        return nums;
    }
}
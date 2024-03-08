class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        
        int max=0;
        while(i<j)
        {
            if(height[i]>height[j])
            {
                max = Math.max( max , Math.min(height[i],height[j])*(j-i));
                j--;
            }
            
            else
            {
                max = Math.max(max, Math.min(height[i],height[j])*(j-i));
                i++;
            }
        }
        return max;
    }
}
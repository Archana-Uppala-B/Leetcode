class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = nums[0];
        for(int i = 0 ; i < nums.length ; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int i = 0;
        int j = 0;
        int cntK = 0;
        int n = nums.length;
        long ans = 0;
        while(j < nums.length) {
            if(nums[j] == maxi) cntK++;
            while(cntK >= k) {
                if(nums[i] == maxi) cntK--;
                i++;
            }
            ans += (j - i + 1);
            j++;
        }
        long total_subarrays = (long)n * (n + 1) / 2;
        return total_subarrays - ans;
    }
}

// Approach
// First find out the maximum element in the array
// Let's reverse this question, let's check for all the subarrays where the number appears at most k times
// Using classic sliding window template we can solve this question for at most k times
// Now find out the total subarrays of nums
// Subtract total subarrays from our answer for at most k
// ALL DONE!
// Complexity
// Time complexity: O(N)
// Space complexity: O(1)
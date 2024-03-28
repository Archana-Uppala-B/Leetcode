class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
    Map<Integer, Integer> map = new HashMap<>();
        
    int ans = 0, left = 0;
        
    for(int right = 0; right < nums.length; right++)
    {
        map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
        
        while(map.get(nums[right]) > k){
            map.put(nums[left], map.get(nums[left]) - 1);
            left++;
        }
        ans = Math.max(right - left + 1, ans);
    }
    return ans;
    }
}
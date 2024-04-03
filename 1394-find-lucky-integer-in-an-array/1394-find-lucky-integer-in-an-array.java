class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int max=Integer.MIN_VALUE;
        for(int num: map.keySet())
        {
            if(num==map.get(num))
            {
                max=Math.max(max,num);
            }
                
        }
        if(max==Integer.MIN_VALUE) return -1;
        return max;
    }
}
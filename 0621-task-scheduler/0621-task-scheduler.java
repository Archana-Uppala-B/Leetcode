class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr=new int[26];
        int max=tasks.length;
        for(int i=0;i<tasks.length;i++){
            arr[tasks[i]-'A']++;
        }
        Arrays.sort(arr);
        int maxValue=arr[arr.length-1];
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==maxValue)    count++;
        }
        return Math.max((n+1)*(maxValue-1)+count,max);
    }
}
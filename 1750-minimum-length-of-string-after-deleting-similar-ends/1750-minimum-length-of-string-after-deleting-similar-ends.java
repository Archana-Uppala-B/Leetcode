class Solution {
    public int minimumLength(String s) {
        int length=s.length();
        int left=0,right=length-1;
        
        char[] arr=s.toCharArray();
        
        while(left<right)
        {
            if(arr[left]==arr[right])
            {
                char c=arr[left];
                while(left<right && arr[left]==c)
                {
                    left++;
                    length--;
                }
                while(right>=left && arr[right]==c)
                {
                    right--;
                    length--;
                }
            }
            else
            {
                break;
            }
        }
        return length;
    }
}
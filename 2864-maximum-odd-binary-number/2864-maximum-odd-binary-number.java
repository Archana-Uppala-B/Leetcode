class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int i=0;
        int count=0;
        while(i<n)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            i++;
        }
        
        StringBuilder sb=new StringBuilder();
        while(count!=1)
        {
            sb.append('1');
            count--;
        }
        
        while(sb.length()<s.length()-1)
        {
            sb.append('0');
        }
        sb.append('1');
        
        return sb.toString();
    }
}
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            int len=s.length();
            int i=0,j=len-1;
            while(i<=j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i>=j){
                return s;
            }
        }
        return "";
    }
}
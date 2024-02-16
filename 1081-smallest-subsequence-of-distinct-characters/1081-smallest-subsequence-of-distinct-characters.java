class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st= new Stack<>();
        Boolean exists[]=new Boolean[26];
        
        int freq[]=new int[26];
        
        for(char c: s.toCharArray()){
            freq[c-'a']++;
            exists[c-'a']=false;
        }
        
        for(char c: s.toCharArray()){
            freq[c-'a']--;
            if(exists[c-'a']==true) continue;
            
            while(st.size()>0 && st.peek()>c && freq[st.peek()-'a']>0){
                char removed=st.pop();
                exists[removed-'a']=false;
            }
            st.push(c);
            exists[c-'a']=true;
        }
        
        char arr[]=new char[st.size()];
        for(int i=st.size()-1;i>=0 ;i--){
            arr[i]=st.pop();
        }
        return new String(arr);
    }
}
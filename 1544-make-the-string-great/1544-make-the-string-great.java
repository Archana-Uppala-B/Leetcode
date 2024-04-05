class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                if(!st.isEmpty() && st.peek()=='a'+s.charAt(i)-'A')
                {
                    st.pop();
                }
                else
                 st.push(s.charAt(i));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                if(!st.isEmpty() && st.peek()=='A'+s.charAt(i)-'a')
                {
                    st.pop();
                }  
                else
                 st.push(s.charAt(i));
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        
        char[] ans=new char[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        String anss=String.copyValueOf(ans);
       
        return anss;
    }
}
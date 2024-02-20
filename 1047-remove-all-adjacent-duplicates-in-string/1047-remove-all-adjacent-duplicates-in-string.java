class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(st.empty()||st.peek()!=ch)
             st.push(ch);
            else
            {
                st.pop();
            }
            i++;
        }
        
        char arr[]=new char[st.size()];
        for(i=st.size()-1;i>=0;i--)
        {
            arr[i]=st.pop();
        }
        return new String(arr);
    }
}
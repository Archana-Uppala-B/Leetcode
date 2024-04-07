class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> o = new Stack<>();
        Stack<Integer> st =new Stack<>();
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='(')
            {
                o.push(i);
            }
            else if(c=='*')
            {
                st.push(i);
            }
            else
            {
                if(!o.isEmpty())
                {
                    o.pop();
                }
                else if(!st.isEmpty())
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        while(!o.isEmpty())
        {
            if(st.isEmpty())
                return false;
            else if(o.peek()<st.peek())
            {
                o.pop();
                st.pop();
            }
            else
                return false;
        }
        return true;
    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        
        for(char c: s.toCharArray()){
            if(c=='(')
            {
                if(st.isEmpty())
                {
                    st.push('(');
                }
                else
                {
                    st.push('(');
                    str.append(c);
                }
            }
            
            if(c==')' ){
                if(st.isEmpty())
                {
                    continue;
                }
                st.pop();
                if(!st.isEmpty())
                 str.append(c);
            }
        }
        return str.toString();
    }
}
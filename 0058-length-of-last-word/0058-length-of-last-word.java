class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        StringBuilder st=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
            {
                st=new StringBuilder();
            }
            else
            {
                st.append(s.charAt(i));
            }
            i++;
        }
        return st.length();
    }
}
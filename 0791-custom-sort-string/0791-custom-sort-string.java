class Solution {
    public String customSortString(String order, String s) {
        int n = s.length();
        StringBuilder st=new StringBuilder();
        
        char arr[]=s.toCharArray();
        char o[]=order.toCharArray();
        
        boolean atoz[]=new boolean[26];
        
        for(int i=0;i<26;i++)
        {
            atoz[i]=false;
        }
        
        boolean visited[]=new boolean[arr.length];
        
        for(int i=0;i<n;i++)
        {
            visited[i]=false;
        }
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: arr)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(char c: o)
        {
            if(s.indexOf(c)!=-1)
            {
                while(map.getOrDefault(c,0)!=0)
                {
                 st.append(c);
                 map.put(c,map.getOrDefault(c,0)-1);
                }
                visited[s.indexOf(c)]=true;
                atoz[c-'a']=true;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i]==false && atoz[arr[i]-'a']==false)
            {
                st.append(arr[i]);
            }
        }
        return st.toString();
    }
}
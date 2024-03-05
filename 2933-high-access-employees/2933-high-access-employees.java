class Solution {
    
    public boolean isHighAccess(List<Integer> temp)
    {
        for(int i=2;i<temp.size();i++)
        {
            if(temp.get(i)-temp.get(i-2)<=99)
            {
                return true;
            }
        }
        return false;
    }
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String,ArrayList<Integer>> map=new HashMap<>();
        
        for(List<String> ls: access_times)
        {
            String name=ls.get(0);
            String time=ls.get(1);
            
            if(!map.containsKey(name))
            {
                map.put(name,new ArrayList<>());
            }
            
            ArrayList<Integer> temp=map.get(name);
            temp.add(Integer.parseInt(time));
        }
        
        ArrayList<String> ans=new ArrayList<>();
        for(String name: map.keySet())
        {
            ArrayList<Integer> list=map.get(name);
            Collections.sort(list);
            if(isHighAccess(list))
            {
                ans.add(name);
            }
        }
        return ans;
    }
}
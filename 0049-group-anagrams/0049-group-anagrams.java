class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bmap=new HashMap<>();
        
        for(String str:strs){
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch: str.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            if(bmap.containsKey(map)==false){
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
                bmap.put(map,list);
            }
            else{
                ArrayList<String> list=bmap.get(map);
                list.add(str);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(ArrayList<String> list: bmap.values()){
            res.add(list);
        }
        return res;
    }
}
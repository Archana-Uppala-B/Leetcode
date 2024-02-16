class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        
        list.sort((a,b)->{return a.getValue()-b.getValue();});
        
        for(Map.Entry<Integer,Integer> e : list){
            
            if(e.getValue()<=k){
                k=k-e.getValue();
                map.remove(e.getKey());
            }
            else{
                break;
            }
        }
        return map.size();
    }
}
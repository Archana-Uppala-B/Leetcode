class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
        (a,b)->{
            return a.getValue()-b.getValue();
        }
        );
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            pq.add(e);
        }
        
        while(k>0 && !pq.isEmpty()){
            Map.Entry<Integer,Integer> e = pq.poll();
            if(k>=e.getValue())
             k=k-e.getValue();
            else if(k<e.getValue()){
                e.setValue(e.getValue()-k);
                pq.add(e);
                k=0;
            }
        }
        
        return pq.size();
    }
}
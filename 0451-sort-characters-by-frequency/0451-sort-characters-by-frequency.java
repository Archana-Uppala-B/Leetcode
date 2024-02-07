class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
        (a,b)->{
            if(b.getValue()==a.getValue()){
                return b.getKey()-a.getKey();
            }
            else{
                return b.getValue()-a.getValue();
            }
        });
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            pq.add(e);
        }
        String str="";
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> temp=pq.poll();
            int ct=temp.getValue();
            while(ct!=0){
                str+=temp.getKey();
                ct--;
            }
        }
        return str;
    }
}
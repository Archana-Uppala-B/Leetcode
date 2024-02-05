class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
      
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> ele: map.entrySet()){
            if(ele.getValue()==1){
                char ch=ele.getKey();
                int ind=s.indexOf(ch);
                min=Math.min(min,ind);
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}
class Pair{
    int y;
    int ts;
    
    Pair(int y,int ts)
    {
        this.y=y;
        this.ts=ts;
    }
}

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        
        ArrayList<ArrayList<Pair>> graph=new ArrayList<>();
        
        //creating the graph
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<Pair>());
        }
        for(int[] m: meetings)
        {
            graph.get(m[0]).add(new Pair(m[1],m[2]));
            graph.get(m[1]).add(new Pair(m[0],m[2]));
        }
        
        PriorityQueue<Pair> pq=new PriorityQueue<>(
        (a,b) ->{
            return a.ts-b.ts;
        }
        );
        pq.add(new Pair(0,0));
        pq.add(new Pair(firstPerson,0));
        
        int known[]=new int[n];
        for(int i=0;i<n;i++)
        {
            known[i]=0;
        }
        
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            int per=curr.y;
            int ts=curr.ts;
            
            known[per]=1;
            
            for(Pair p: graph.get(per))
            {
                int adjNode=p.y;
                int adj_ts=p.ts;
                
                if(known[adjNode]==1) continue;
                
                if(known[adjNode]==0 && adj_ts>=ts)
                {
                    pq.add(new Pair(adjNode,adj_ts));
                }
            }
            
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(known[i]==1)
                ans.add(i);
        }
        
        return ans;
    }
}
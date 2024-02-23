class Tuple{
    int first;
    int second;
    int third;
    
    Tuple(int first,int second,int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

class Pair{
    int first;
    int second;
    
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //converting the data to the arraylist
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        int m=flights.length;
        for(int i=0;i<m;i++)
        {
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        
        Queue<Tuple> q=new LinkedList<>();
        // stops, node, distance
        q.offer(new Tuple(0,src,0));
        
        int distance[]=new int[n];
        for(int i=0;i<n;i++)
        {
            distance[i]=(int)(1e9);
        }
        distance[src]=0;
        
        while(!q.isEmpty())
        {
            Tuple temp= q.poll();
            int stop=temp.first;
            int node=temp.second;
            int dist=temp.third;
            
            if(stop>k) continue;
            
            for(Pair p: adj.get(node))
            {
                int adjNode=p.first;
                int cost=p.second;
                
                if(dist+cost< distance[adjNode] && stop<=k)
                {
                    q.offer(new Tuple(stop+1,adjNode,dist+cost));
                    distance[adjNode]=dist+cost;
                }
            }
        }
        if(distance[dst]==(int)(1e9))
            return -1;
        else
            return distance[dst];
    }
}
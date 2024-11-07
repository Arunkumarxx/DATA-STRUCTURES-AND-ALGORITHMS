package GRAPH;

public class DijkstraAlgorithm
{
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        ArrayList<Integer> result =new ArrayList<Integer>();
        PriorityQueue<iPair> minHeap =new PriorityQueue<iPair>((a,b)->Integer.compare(a.second,b.second));
        int n=adj.size();
        boolean [] visited =new boolean [n];
        minHeap.add(new iPair(src,0));
        int [] distance =new int [n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        while(!minHeap.isEmpty())
        {
            iPair curr=minHeap.poll();
            int weight=curr.second;
            int node=curr.first;

            if(visited[node])
                continue;

            visited[node]=true;
            for(iPair pair :adj.get(node))
            {
                int newNode=pair.first;
                int newWeight=pair.second;
                if(!visited[newNode] && distance[node]+newWeight < distance[newNode])
                {
                    distance[newNode]=distance[node]+newWeight;
                    minHeap.add(new iPair(newNode,distance[newNode]));
                }
            }
        }
        for(int i=0;i<distance.length;++i)
            result.add(distance[i]);
        return result;
    }
    public static void main(String[] args)
    {

    }
}

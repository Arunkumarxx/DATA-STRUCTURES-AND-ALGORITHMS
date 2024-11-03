package GRAPH;

public class TopologicalSort
{
    private ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        int [] degree =new int [adj.size()];
        for(int i=0;i<n;++i)
            for(Integer edges:adj.get(i))
                ++degree[edges];

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++)
            if (degree[i] == 0)
                queue.add(i);

        ArrayList<Integer> result =new ArrayList<Integer>();
        while(!queue.isEmpty())
        {
            int curr= queue.poll();
            result.add(curr);
            for(int edge:adj.get(curr))
            {
                --degree[edge];
                if(degree[edge]==0)
                    queue.add(edge);

            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        
    }
}

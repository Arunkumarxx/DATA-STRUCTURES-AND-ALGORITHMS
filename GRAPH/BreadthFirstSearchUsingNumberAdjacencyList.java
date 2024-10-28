package GRAPH;

public class BreadthFirstSearchUsingNumberAdjacencyList
{
    private ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        boolean visited [] =new boolean [adj.size()];

        Queue<Integer> queue =new LinkedList<Integer>();

        queue.add(0);
        visited[0]=true;

        while(!queue.isEmpty())
        {
            int curr=queue.poll();
            result.add(curr);
            for(Integer val:adj.get(curr))
            {
                if(!visited[val])
                {
                    visited[val]=true;
                    queue.add(val);

                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {

    }
}

package GRAPH;

public class UnDirectedGraphCycleDetection
{
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        boolean [] visited=new boolean[n];

        for(int i=0; i<n;++i)
        {
            if(!visited[i])
            {
                Queue<int []> queue =new LinkedList<>();
                queue.add(new int [] {i,-1});
                visited[i]=true;
                while(!queue.isEmpty())
                {
                    int[] curr=queue.poll();
                    int src=curr[0];
                    int parent=curr[1];
                    for(Integer newSrc:adj.get(src))
                    {
                        if(visited[newSrc] && parent!=newSrc)
                            return true;

                        if(!visited[newSrc])
                        {
                            queue.add(new int []{newSrc,src});
                            visited[newSrc]=true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {

    }
}

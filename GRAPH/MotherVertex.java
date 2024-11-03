package GRAPH;

public class MotherVertex
{
    private int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int n=adj.size();
        boolean [] visited = new boolean [n];
        int lastVisited=-1;
        Queue<Integer> queue =new LinkedList<Integer>();
        for(int i=0;i<n;++i)
        {
            if(!visited[i])
            {
                lastVisited=i;
                queue.add(i);
                visited[i]=true;
                while(!queue.isEmpty())
                {
                    int curr=queue.poll();
                    for(Integer edges:adj.get(curr))
                    {
                        if(!visited[edges])
                        {
                            queue.add(edges);
                            visited[edges]=true;
                        }
                    }
                }

            }
        }
        visited=new boolean[n];
        queue.clear();
        queue.add(lastVisited);
        visited[lastVisited]=true;
        while(!queue.isEmpty())
        {
            int curr=queue.poll();
            for(Integer edges:adj.get(curr))
            {
                if(!visited[edges])
                {
                    visited[edges]=true;
                    queue.add(edges);
                }
            }
        }
        for(boolean val:visited)
            if(val==false)
                return -1;
        return lastVisited;
        vertex of creaet them in only way
    }
    public static void main(String[] args)
    {

    }
}

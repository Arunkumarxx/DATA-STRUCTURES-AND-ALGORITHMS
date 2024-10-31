package GRAPH;
import java.util.*;
public class PossiblePathBetweenTwoVerticesInGraph
{
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        Queue<Integer> queue =new LinkedList<>();
        queue.add(source);
        int pathCount=0;
        while(!queue.isEmpty())
        {
            int src= queue.poll();
            if(src==destination)
                ++pathCount;
            for(Integer newSrc:adj.get(src))
            {
                queue.add(newSrc);
            }
        }
        return pathCount;
    }
    public static void main(String[] args)
    {
        
    }

}

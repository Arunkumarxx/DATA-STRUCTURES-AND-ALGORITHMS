package GRAPH;

import java.util.*;

public class KosaRajuAlgorithmStronglyConnectedComponents
{
    public int kosaraju(int v, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> stack =new Stack<Integer>();
        boolean [] visited =new boolean [v];
        ArrayList<ArrayList<Integer>> adj2=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<v;++i)
        {
            adj2.add(new ArrayList<Integer>());
            if(!visited[i])
                dfs(visited,stack,adj,i);
        }
        for(int i=0;i<v;++i)
        {
            int src=i;
            for(int des:adj.get(i))
                adj2.get(des).add(src);
        }
        Arrays.fill(visited,false);
        int count=0;
        while(!stack.isEmpty())
        {
            int curr=stack.pop();
            if(!visited[curr])
            {
                dfsReverseGraph(curr,visited,adj2);
                ++count;
            }
        }
        return count;
    }
    private void dfsReverseGraph(int src, boolean [] visited, ArrayList<ArrayList<Integer>> adj)
    {
        visited[src]=true;
        for(int neighbor:adj.get(src))
        {
            if(!visited[neighbor])
                dfsReverseGraph(neighbor,visited,adj);
        }
    }
    private void dfs(boolean[] visited,Stack<Integer> stack,ArrayList<ArrayList<Integer>>adj,int src)
    {
        visited[src]=true;
        for(Integer neighbor:adj.get(src))
        {
            if(!visited[neighbor])
                dfs(visited,stack,adj,neighbor);
        }
        stack.push(src);
    }
    public static void main(String[] args)
    {
        KosaRajuAlgorithmStronglyConnectedComponents obj =new KosaRajuAlgorithmStronglyConnectedComponents();
        ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
        int v=5;
        for(int i=0;i<v;++i)
            adj.add(new ArrayList<Integer>());

        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(3).add(4);

        System.out.println("Number of strongly connected components: " + obj.kosaraju(v,adj));
    }

}

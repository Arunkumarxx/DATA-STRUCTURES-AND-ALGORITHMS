package GRAPH;

public class GraphRepresentationAdjacencyMatrix
{
    private boolean [][]  Graph;

    private GraphRepresentationAdjacencyMatrix(int size)
    {
        Graph=new boolean[size][size];
    }
    private void addAdjacent(GraphRepresentationAdjacencyMatrix Graph ,int u,int v)
    {
        Graph.Graph[u][v]=true;
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyMatrix Graph1 =new GraphRepresentationAdjacencyMatrix();
        Graph1.addAdjacent(Graph1,0,1);
    }
}

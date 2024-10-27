package GRAPH;

public class GraphRepresentationAdjacencyMatrix
{
    private boolean [][]  Graph;

    private GraphRepresentationAdjacencyMatrix(int size)
    {
        Graph=new boolean[size][size];
    }
    private void addAdjacent(int u,int v)
    {
        Graph[u][v]=true;
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyMatrix Graph1 =new GraphRepresentationAdjacencyMatrix();
        Graph1.addAdjacent(0,0);
        Graph1.addAdjacent(0,1);
        Graph1.addAdjacent(1,2);
        Graph1.addAdjacent(4,0);
        Graph1.addAdjacent(4,1);
    }
}

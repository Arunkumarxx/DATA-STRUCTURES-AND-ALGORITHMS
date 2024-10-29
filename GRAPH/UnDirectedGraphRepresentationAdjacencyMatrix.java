package GRAPH;

public class UnDirectedGraphRepresentationAdjacencyMatrix
{
    private boolean [][]  Graph;

    private UnDirectedGraphRepresentationAdjacencyMatrix(int size)
    {
        Graph=new boolean[size][size];
    }
    private void addAdjacent(int s,int d)
    {
        Graph[s][d]=true;
        Graph[d][s]=true;
    }
    private void printGraph()
    {
        for(boolean[] row:Graph)
        {
            for(boolean va:row)
            {
                if(va)
                    System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        UnDirectedGraphRepresentationAdjacencyMatrix Graph1 =new UnDirectedGraphRepresentationAdjacencyMatrix(5);
        Graph1.addAdjacent(0,1);
        Graph1.addAdjacent(0,4);
        Graph1.addAdjacent(1,4);
        Graph1.addAdjacent(1,3);
        Graph1.addAdjacent(1,2);
        Graph1.addAdjacent(3,4);
        Graph1.printGraph();
    }
}

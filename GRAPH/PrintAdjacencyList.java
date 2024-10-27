package GRAPH;

public class PrintAdjacencyList
{
    List<List<Integer>> adjacent;
    private void createAdjacent(int vetrices)
    {
        adjacent= new ArrayList();

        for(int i=0;i<vetrices;++i)
        {
            adjacent.add(new ArrayList<Integer>());
        }
    }
    public List<List<Integer>> printGraph(int vetrices, int edges[][]) {
        if (adjacent == null || adjacent.size() != vetrices)
            createAdjacent(vetrices);

        for(int rows=0;rows<edges.length;++rows)
            addAdjacent(edges[rows][0],edges[rows][1]);
        return adjacent;
    }

    private void addAdjacent(int s,int d)
    {
        adjacent.get(s).add(d);
        adjacent.get(d).add(s);
    }
}

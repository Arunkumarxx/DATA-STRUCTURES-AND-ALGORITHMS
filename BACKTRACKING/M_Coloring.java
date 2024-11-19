package BACKTRACKING;

public class M_Coloring
{
    int [] color;
    ArrayList<ArrayList<Integer>> list;
    int v;
    int m;
    boolean graphColoring(int v, List<int[]> edges, int m) {

        this.color=new int[v];
        this.list=new ArrayList<>();
        this.v=v;
        this.m=m;

        for(int i=0;i<v;++i)
            list.add(new ArrayList<Integer>());

        int size=edges.size();
        for(int i=0;i<size;++i)
        {
            int first=edges.get(i)[0];
            int second=edges.get(i)[1];
            list.get(first).add(second);
            list.get(second).add(first);
        }
        return  mColoring(0);
    }
    boolean mColoring(int src)
    {
        if(src==v)
            return true;

        for(int i=1;i<=m;++i)
        {
            if(isPossible(i,src))
            {
                color[src]=i;

                if(mColoring(src+1))
                    return true;

                color[src]=0;
            }
        }
        return false;
    }
    boolean isPossible(int colorCode,int src)
    {
        for(int val:list.get(src))
        {
            if(colorCode==color[val])
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {

    }

}

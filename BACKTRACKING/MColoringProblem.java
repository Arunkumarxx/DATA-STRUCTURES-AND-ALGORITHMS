package BACKTRACKING;

import java.util.*;

public class MColoringProblem
{
    int[] color;
    ArrayList<ArrayList<Integer>> list;
    int v;
    int m;

    boolean graphColoring(int v, List<int[]> edges, int m)
    {
        this.color = new int[v];
        this.list = new ArrayList<>();
        this.v = v;
        this.m = m;

        for (int i = 0; i < v; ++i)
            list.add(new ArrayList<Integer>());

        for (int[] edge : edges)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        return mColoring(0);
    }

    boolean mColoring(int src)
    {
        if (src == v)
            return true;

        for (int i = 1; i <= m; ++i)
        {
            if (isPossible(i, src))
            {
                color[src] = i;
                if (mColoring(src + 1))
                    return true;
                color[src] = 0;
            }
        }
        return false;
    }

    boolean isPossible(int colorCode, int src)
    {
        for (int val : list.get(src))
            if (colorCode == color[val])
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        MColoringProblem obj = new MColoringProblem();
        int v = 4;
        List<int[]> edges = Arrays.asList(
                new int[]{0, 1},
                new int[]{0, 2},
                new int[]{1, 2},
                new int[]{1, 3}
        );
        int m = 3;

        if (obj.graphColoring(v, edges, m))
         System.out.println("The graph can be colored with " + m + " colors ");
        else
            System.out.println("The graph cannot be colored with " + m + " colors ");
    }
}

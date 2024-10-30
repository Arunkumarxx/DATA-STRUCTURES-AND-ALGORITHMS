package GRAPH;

public class FindWhetherPathExist
{

    public static void main(String[] args)
    {
        one:for(int i=0;i<10;++i)
        {
            two:for(int j=0;j<10;++j)
            {
                if(j==5)
                    break two;
                System.out.println(j);
            }
        }
    }

}

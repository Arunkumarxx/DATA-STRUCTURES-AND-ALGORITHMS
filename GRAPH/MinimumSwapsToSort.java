package GRAPH;

public class MinimumSwapsToSort
{
    public int minSwaps(int nums[])
    {
        int n=nums.length;
        ArrayList<Pair> list= new ArrayList(n);
        for(int i=0;i<n;++i)
            list.add(new Pair(nums[i],i));

        Collections.sort(list,
                Comparator.comparingInt(pair -> pair.value));

        int swapCount=0;
        for(int i=0;i<n;++i)
        {
            if(list.get(i).ind!=i)
            {
                while(list.get(i).ind!=i)
                {
                    int correctIndex = list.get(i).ind;
                    Pair temp = list.get(i);
                    list.set(i, list.get(correctIndex));
                    list.set(correctIndex, temp);
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
    class Pair
    {
        int value;
        int ind;
        Pair(int value,int ind)
        {
            this.value=value;
            this.ind=ind;
        }
    }
    public static void main(String[] args)
    {

    }
}

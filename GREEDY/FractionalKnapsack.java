package GREEDY;

public class FractionalKnapsack
{double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
    int n=val.size();
    Pair[] pair =new Pair[n];

    for(int i=0;i<n;++i)
        pair[i]=new Pair(val.get(i),wt.get(i));

    Arrays.sort(pair,(a,b)-> Double.compare((double)b.value/b.weight,(double)a.value/a.weight));
    double result=0;
    int ind=0;
    while(capacity>0 && ind<n)
    {
        if (capacity>=pair[ind].weight)
        {
            capacity -= pair[ind].weight;
            result += pair[ind].value;
        }
        else if(ind<n)
        {
            double newValue = ((double) pair[ind].value / pair[ind].weight) * capacity;
            result+=newValue;
            break;
        }
        ++ind;
    }
    return result;
}
    public static void main(String[] args)
    {

    }

}

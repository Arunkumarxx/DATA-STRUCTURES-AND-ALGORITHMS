package HEAP;

public class MergeKSortedArray {

    public static void main(String[] args) {

    }
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k)
    {
        PriorityQueue<Integer> MinHeap =new PriorityQueue();
        for(int i=0;i<k;++i)
        {
            for(int j=0;j<k;++j)
            {
                MinHeap.add(arr[i][j]);
            }
        }
        ArrayList<Integer> res =new ArrayList<Integer>();
        int size=MinHeap.size();
        for(int i=0;i<size;++i)
        {
            res.add(MinHeap.poll());
        }
        MinHeap.clear();
        return res;
    }
}

package HEAP;

public class KMostOccurringElements {

    public static void main(String[] args) {

    }
    int kMostFrequent(int arr[], int n, int k) {
        HashMap<Integer,Integer> hashMap =new HashMap();

        for(int val:arr)
        {
            if(hashMap.containsKey(val))
            {
                hashMap.put(val,hashMap.getOrDefault(val,0)+1);
            }
            else hashMap.put(val,1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer val:hashMap.values())
        {
            maxHeap.add(val);
        }
        int sum=0;
        for(int i=0;i<k;++i)
        {
            sum+=maxHeap.poll();
        }
        return sum;
    }
}

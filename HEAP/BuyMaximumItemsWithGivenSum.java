package HEAP;

import java.util.PriorityQueue;

public class BuyMaximumItemsWithGivenSum {
    private int maxItems(int [] arr,int sum)
    {
        PriorityQueue<Integer> queue =new PriorityQueue<>();
        for(Integer val:arr)
            queue.add(val);
        int totalItems=0;
        while(!queue.isEmpty())
        {
            sum-=queue.poll();
            if(sum>=0)
            ++totalItems;
            else break;
        }
        return totalItems;
    }
    public static void main(String[] args) {
        BuyMaximumItemsWithGivenSum obj =new BuyMaximumItemsWithGivenSum();
        int [] arr =  {1,12,5,111,200};
        System.out.println( obj.maxItems(arr,10));

    }

}

package HEAP;

import java.util.PriorityQueue;
import java.util.Collections;

public class FindMedianInAStream {
    private static PriorityQueue<Integer> small=new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> large=new PriorityQueue<>();
    private static boolean even=true;

    private static void insertHeap(int num) {
        if(even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even=!even;
    }
    private static double getMedian() {
        if(even)
            return (small.peek()+large.peek())/2.0;
        else
            return small.peek();
    }

    public static void main(String[] args) {
        insertHeap(1);
        insertHeap(2);
        System.out.println("Current median: "+getMedian());
        insertHeap(3);
        System.out.println("Current median: "+getMedian());
    }
}

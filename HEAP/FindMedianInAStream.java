package HEAP;

public class FindMedianInAStream {
    private  static PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private  static PriorityQueue<Integer> large = new PriorityQueue<>();
    private static boolean even = true;
    public static void insertHeap(int num)
    {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }

    public static double getMedian() {
        if (even)
            return (small.peek() + large.peek()) / 2.0;
        else
            return small.peek();
    }
    public static void main(String[] args) {

    }

}

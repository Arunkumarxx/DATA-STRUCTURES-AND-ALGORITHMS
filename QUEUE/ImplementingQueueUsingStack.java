package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingQueueUsingStack {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        q1.add(1);
        System.out.println(q1.peek());
    }

}

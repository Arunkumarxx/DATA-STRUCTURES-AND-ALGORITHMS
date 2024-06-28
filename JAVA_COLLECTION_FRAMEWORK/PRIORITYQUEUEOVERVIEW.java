package JAVA_COLLECTION_FRAMEWORK;

import java.util.Queue;

class PRIORITYQUEUEOVERVIEW {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new java.util.PriorityQueue<>();
        integerQueue.add(10);
        integerQueue.add(3);
        integerQueue.add(15);
        System.out.println(integerQueue);
    }
}

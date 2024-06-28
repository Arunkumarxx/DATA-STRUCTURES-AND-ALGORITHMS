package JAVA_COLLECTION_FRAMEWORK;

import java.util.ArrayDeque;

class DEQUEOVERVIEW {
    public static void main(String[] args) {
        ArrayDeque<Integer> Queue = new ArrayDeque<>();
        Queue.addFirst(10);
        Queue.addFirst(20);
        Queue.addFirst(30);
        Queue.addFirst(40);
        System.out.println(Queue);
        Queue.addFirst(100);
        System.out.println(Queue);
        Queue.addLast(2);
        System.out.println(Queue);
    }
}

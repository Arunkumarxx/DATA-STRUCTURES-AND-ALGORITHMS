package QUEUE;

import java.util.Scanner;

public class ImplementQueueUsingArray {

    private class MyQueue {
        int front, rear;
        int arr[] = new int[100005];
        int size = arr.length;

        MyQueue() {
            front = 0;
            rear = 0;
        }

        void push(int x) {
            if (rear == size) {
                return;
            } else {
                arr[rear++] = x;
            }
        }

        int pop() {
            if (front == rear) {
                return -1;
            } else {
                return arr[front++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementQueueUsingArray queueImplementation = new ImplementQueueUsingArray();
        MyQueue queue = queueImplementation.new MyQueue();
        queue.push(10);
        queue.push(20);
        System.out.println(queue.pop());
        queue.push(30);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        sc.close();
    }
}

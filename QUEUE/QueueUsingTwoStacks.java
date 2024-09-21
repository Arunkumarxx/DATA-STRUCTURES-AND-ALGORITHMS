package QUEUE;

import java.util.Stack;

 class QueueUsingLinkedList {
    protected QueueNode front;
    protected QueueNode rear;

    protected class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public void add(int value) {
        QueueNode newNode = new QueueNode(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

non-sealed class StackQueue extends QueueUsingLinkedList {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void Push(int x) {
        s1.push(x);
    }

    public int Pop() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue using Linked List:");
        queue.print();
        System.out.println("Polled: " + queue.poll());
        queue.print();
        System.out.println("Queue using Two Stacks:");
        queue.Push(40);
        queue.Push(50);
        System.out.println(queue.Pop());
        System.out.println(queue.Pop());
        System.out.println(queue.Pop());
    }
}

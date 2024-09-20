package QUEUE;

public class ImplementationOfQueueUsingLinkedList {
    class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    QueueNode front, rear;

    ImplementationOfQueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    void push(int a) {
        QueueNode newNode = new QueueNode(a);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    int pop() {
        if (front != null) {
            int x = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return x;
        }
        return -1;
    }

    boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        ImplementationOfQueueUsingLinkedList queue = new ImplementationOfQueueUsingLinkedList();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}

package QUEUE;

public class ImplementQueueUsingArray {
   private class MyQueue {

        int front, rear;
        int arr[] = new int[100005];
        int size=arr.length;

        MyQueue()
        {
            front=0;
            rear=0;
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

    }
}

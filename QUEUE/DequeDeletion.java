package QUEUE;

public class DequeDeletion {
    private class DequeNode {
        int data;
        DequeNode next;
        DequeNode prev;

        DequeNode(int value) {
            this.data=value;
            this.next=null;
            this.prev=null;
        }
    }

    DequeNode front, rear;

    public void addFirst(int value) {
        DequeNode newNode=new DequeNode(value);
        if (front==null)
            front=rear=newNode;
        else {
            front.prev=newNode;
            newNode.next=front;
            front=newNode;
        }
    }

    public int popLast() {
        if (rear==null)
            return -1;
        int x=rear.data;
        rear=rear.prev;
        if (rear==null)
            front=null;
        else {
            rear.next=null;
        }
        return x;
    }

    public int popFirst() {
        if (front==null)
            return -1;
        int x=front.data;
        front=front.next;
        if (front==null)
            rear=null;
        else {
            front.prev=null;
        }
        return x;
    }

    public void addLast(int value) {
        DequeNode newNode=new DequeNode(value);
        if (rear==null)
            front=rear=newNode;
        else {
            rear.next=newNode;
            newNode.prev=rear;
            rear=newNode;
        }
    }

    public boolean isEmpty() {
        return front==null;
    }

    public void printDeque() {
        DequeNode current=front;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public void eraseAt(int x) {
        if (x<0 || front==null) return;

        DequeNode current=front;
        int index=0;

        while (current!=null && index<x) {
            current=current.next;
            index++;
        }

        if (current==null) return;

        if (current==front) {
            popFirst();
            return;
        }

        if (current==rear) {
            popLast();
            return;
        }

        current.prev.next=current.next;
        current.next.prev=current.prev;
    }

    public void eraseInRange(int start, int end) {
        if (start<0 || end<=start || front==null) return;

        DequeNode current=front;
        int index=0;

        while (current!=null && index<start) {
            current=current.next;
            index++;
        }

        while (current!=null && index<end) {
            DequeNode next=current.next;
            if (current.prev!=null) {
                current.prev.next=current.next;
            }
            if (current.next!=null) {
                current.next.prev=current.prev;
            }
            if (current==front) {
                front=current.next;
            }
            if (current==rear) {
                rear=current.prev;
            }
            current=next;
            index++;
        }
    }

    public void eraseAll() {
        front=rear=null;
    }

    public static void main(String[] args) {
        DequeDeletion deq=new DequeDeletion();

        for (int i=1; i<=10; i++) {
            deq.addLast(i);
        }

        System.out.println("Original Deque:");
        deq.printDeque();

        deq.eraseAt(3);
        System.out.println("After erasing element at index 3:");
        deq.printDeque();

        deq.eraseInRange(2, 5);
        System.out.println("After erasing elements from index 2 to 5:");
        deq.printDeque();

        deq.eraseAll();
        System.out.println("After erasing all elements:");
        deq.printDeque();
    }
}

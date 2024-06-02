package JAVA_COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListAndMethods {
    static LinkedList<Integer> integerLinkedList = new LinkedList<>();

    static void add(int index, int Element) {
        integerLinkedList.add(index, Element);
        System.out.println(integerLinkedList);
    }

    static void add(int n) {
        integerLinkedList.add(n);
        System.out.println(integerLinkedList);
    }

    static void addFirst() {
        integerLinkedList.addFirst(130);
        System.out.println(integerLinkedList);
    }

    static void addLast() {
        integerLinkedList.addLast(223);
        System.out.println(integerLinkedList);
    }

    static void clear() {
        integerLinkedList.clear();
        System.out.println(integerLinkedList);
    }

    public static void main(String[] args) {
        add(10);
        add(1, 10);
        LinkedList<Integer> integerLinkedList1 = new LinkedList<>();
        integerLinkedList1.add(1);
        integerLinkedList.addAll(integerLinkedList1);
        addFirst();
        addLast();
        clear();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(5);
        Iterator iterator = integerLinkedList.descendingIterator();
        System.out.println(integerLinkedList);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(integerLinkedList.element());
        System.out.println(integerLinkedList.get(1));
        System.out.println(integerLinkedList.getFirst());
        System.out.println(integerLinkedList.getLast());
        System.out.println(integerLinkedList.indexOf(1));
        System.out.println(integerLinkedList.lastIndexOf(5));
        Iterator<Integer> integerListIterator = integerLinkedList.listIterator(2);
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }
        integerLinkedList.offer(22);
        integerLinkedList.offer(33);
        System.out.println(integerLinkedList);
        integerLinkedList.offerFirst(11);
        integerLinkedList.offerLast(99);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.peek());
        System.out.println(integerLinkedList.peekFirst());
        System.out.println(integerLinkedList.peekLast());
        System.out.println(integerLinkedList.poll());
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.pollFirst());
        System.out.println(integerLinkedList.pollLast());
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.pop());
        integerLinkedList.push(2323);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.remove());
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.removeFirst());
        System.out.println(integerLinkedList.removeLast());
        System.out.println(integerLinkedList.removeFirstOccurrence(22));
        integerLinkedList.set(1, 23);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.size());
        System.out.println(integerLinkedList.spliterator());

    }

}

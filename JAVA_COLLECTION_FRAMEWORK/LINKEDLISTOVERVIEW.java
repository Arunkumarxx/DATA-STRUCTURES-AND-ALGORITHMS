package JAVA_COLLECTION_FRAMEWORK;

import java.util.LinkedList;

class LINKEDLISTOVERVIEW {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            integerLinkedList.add(i);
        }
        System.out.println(integerLinkedList);
        integerLinkedList.remove(3);
        System.out.println(integerLinkedList);
        for (int temp : integerLinkedList) {
            System.out.print(temp + " ");
        }
    }
}

package JAVA_COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.Stack;

class STACKOVERVIEW {
    public static void main(String[] args) {
        Stack<String> integerStack = new Stack<>();
        integerStack.push("Arun ");
        integerStack.push("Kumar");
        integerStack.push("T");
        Iterator<String> stringIterator = integerStack.iterator();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + " ");
        }
        integerStack.pop();
        stringIterator = integerStack.iterator();
        System.out.println();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next());
        }
    }
}

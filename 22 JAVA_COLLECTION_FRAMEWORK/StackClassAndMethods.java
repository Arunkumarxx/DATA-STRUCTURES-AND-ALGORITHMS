package JAVA_COLLECTION_FRAMEWORK;

import java.util.Stack;

class StackClassAndMethods {
    static Stack<Integer> integerStack = new Stack<>();

    static void empty() {
        System.out.println(integerStack.empty());
        integerStack.push(1000);
        integerStack.push(2);
        integerStack.push(2323);
    }

    static void peek() {

        System.out.println(integerStack.peek());
    }

    static void pop() {
        integerStack.pop();
        System.out.println(integerStack);
    }

    static void push() {
        integerStack.push(3);
        System.out.println(integerStack);
    }

    static void search() {
        System.out.println(integerStack.search(1000));
    }

    public static void main(String[] args) {
        empty();
        peek();
        pop();
        push();
        search();
        System.out.println(integerStack.peek());
        System.out.println(integerStack);
    }
}
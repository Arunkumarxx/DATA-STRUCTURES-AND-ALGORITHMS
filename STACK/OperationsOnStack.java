package STACK;

import java.util.Stack;

class OperationsOnStack {


    public static void insert(Stack<Integer> st, int x) {
        st.push(x);
    }
    public static void remove(Stack<Integer> st) {
        if (!st.isEmpty()) {
            st.pop();
        } else {
            System.out.println("Stack is empty, cannot remove element.");
        }
    }

    public static void headOf_Stack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            System.out.println("Top element: " + st.peek());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public static boolean find(Stack<Integer> st, int val) {
        return st.search(val) != -1;
    }


    public static void printStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (Integer elem : st) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        insert(stack, 10);
        insert(stack, 20);
        insert(stack, 30);
        insert(stack, 40);
        printStack(stack);
        headOf_Stack(stack);
        remove(stack);
        printStack(stack);
        int valueToFind = 20;
        boolean found = find(stack, valueToFind);
        System.out.println("Element " + valueToFind + " found: " + found);
        printStack(stack);
    }
}

package STACK;

import java.util.Stack;

public class GetMinAtPop {

    public static Stack<Integer> push(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            stack.push(min);
        }

        return stack;
    }

    static void getMinAtPop(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 4, 1};
        int n = arr.length;

        Stack<Integer> s = push(arr, n);
        getMinAtPop(s);
    }
}
